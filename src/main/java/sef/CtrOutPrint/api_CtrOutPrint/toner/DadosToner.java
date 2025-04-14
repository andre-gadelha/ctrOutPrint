package sef.CtrOutPrint.api_CtrOutPrint.toner;

import java.time.LocalDate;
import java.util.Date;

public record Toner(String codigo, String descricao, String nota, LocalDate dataRecebimento, TipoToner tipo) {

}
