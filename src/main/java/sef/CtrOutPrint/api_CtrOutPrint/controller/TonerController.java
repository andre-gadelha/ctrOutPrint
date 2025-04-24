package sef.CtrOutPrint.api_CtrOutPrint.controller;

import jakarta.transaction.Transactional;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import sef.CtrOutPrint.api_CtrOutPrint.toner.DadosCodListToner;
import sef.CtrOutPrint.api_CtrOutPrint.toner.DadosToner;
import sef.CtrOutPrint.api_CtrOutPrint.toner.Toner;
import sef.CtrOutPrint.api_CtrOutPrint.toner.TonerRepository;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/toner")
public class TonerController {

    @Autowired
    private TonerRepository repository;//Declarando

    @GetMapping
    public String about(){
        //return repository.findAll();
        return "API - BACK - END para persistência de dados do CtrOutPrint!";
    }

    @PostMapping("/add")
    @Transactional //Para execução de transações
    public String cadastrar(@RequestBody DadosToner dados){

        repository.save(new Toner(dados));  //Acionando o método save para salvar um Objeto Toner na JTA
                                            //Instancia um objeto Toner para encapsular os dados recebidos
        return "Registro adicionado!";
    }

    @GetMapping("/list")
    public List<DadosToner> listar(){
        //return repository.findAll();
        return repository.findAll().stream().map(DadosToner::new).toList();//Converte a lista de uam JTA de uma classe DTO específica
    }

    @GetMapping("/list-codes")
    public List<DadosCodListToner> listarCodes(){
        //return repository.findAll();
        return repository.findAll().stream().map(DadosCodListToner::new).toList();//Converte a lista de uam JTA de uma classe DTO específica
    }

    /*
    //Paginação e Ordenação
    @GetMapping("/list-page-ord")
    public Page<DadosToner> listarPagOrd(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosToner::new);
    }
    */


}
