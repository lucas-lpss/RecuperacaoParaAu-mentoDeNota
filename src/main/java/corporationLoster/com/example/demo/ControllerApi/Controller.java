package corporationLoster.com.example.demo.ControllerApi;


import corporationLoster.com.example.demo.Repository.RepositoryFuncionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/pedido/v1/")
public class Controller {
    @Autowired
    RepositoryFuncionario repositoryFuncionario;

}







