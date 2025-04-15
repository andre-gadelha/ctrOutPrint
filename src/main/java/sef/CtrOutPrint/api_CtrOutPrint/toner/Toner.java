package sef.CtrOutPrint.api_CtrOutPrint.toner;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "toners")
@Entity(name = "Toner")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Toner {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;
    private String descricao;
    private String nota;
    private LocalDate dataRecebimento;
    @Enumerated(EnumType.STRING)
    private TipoToner tipo;

    public Toner(DadosToner dados) {
        this.codigo = dados.codigo();
        this.descricao = dados.descricao();
        this.tipo = dados.tipo();
        this.nota = dados.nota();
        this.dataRecebimento = dados.dataRecebimento();
    }
}
