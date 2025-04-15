package sef.CtrOutPrint.api_CtrOutPrint.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sef.CtrOutPrint.api_CtrOutPrint.toner.DadosToner;
import sef.CtrOutPrint.api_CtrOutPrint.toner.Toner;
import sef.CtrOutPrint.api_CtrOutPrint.toner.TonerRepository;

@RestController
@RequestMapping("/toner")
public class TonerController {

    @Autowired
    private TonerRepository repository;//Declarando

    @PostMapping
    public String cadastrar(@RequestBody DadosToner dados){

        //repository.save(new Toner(dados));  //Acionando o método save para salvar um Objeto Toner
                                            //Instancia um objeto Toner para encapsular os dados recebidos
        return "Ok";

    }




}
