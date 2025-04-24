package sef.CtrOutPrint.api_CtrOutPrint.toner;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "toners")
@Entity(name = "Toner")
@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Toner {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descricao;
    private String nota;
    private LocalDate dataRecebimento;
    @Enumerated(EnumType.STRING)
    private TipoToner tipo;

    public Toner() {
    }//Verificar qual o motivo a anotação @NoArgsConstructor não gerou um construtor sem argumentos automáticamente

    public Toner(DadosToner dados) {
        this.codigo = dados.codigo();
        this.descricao = dados.descricao();
        this.nota = dados.nota();
        this.dataRecebimento = dados.dataRecebimento();
        this.tipo = dados.tipo();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNota() {
        return nota;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public TipoToner getTipo() {
        return tipo;
    }

}
