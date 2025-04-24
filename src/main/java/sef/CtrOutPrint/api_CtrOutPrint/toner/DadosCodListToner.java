package sef.CtrOutPrint.api_CtrOutPrint.toner;

public record DadosCodListToner(String codigo) {

    public DadosCodListToner(Toner toner){
        this(toner.getCodigo());
    }

}
