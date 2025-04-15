package sef.CtrOutPrint.api_CtrOutPrint.toner;

import java.time.LocalDate;

public record DadosToner(String codigo, String descricao, String nota, LocalDate dataRecebimento, TipoToner tipo) {

}
