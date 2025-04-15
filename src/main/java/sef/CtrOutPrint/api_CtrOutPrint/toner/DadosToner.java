package sef.CtrOutPrint.api_CtrOutPrint.toner;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosToner(

            String codigo,

            String descricao,

            String nota,
            LocalDate dataRecebimento,

            TipoToner tipo) {
}
