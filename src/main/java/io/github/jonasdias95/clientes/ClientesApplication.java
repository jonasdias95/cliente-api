package io.github.jonasdias95.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientesApplication {

//    @Bean
//    public CommandLineRunner run(@Autowired ClienteRepository repository){
//        return  args -> {
//            Cliente cli = Cliente.builder().cpf("22754149830").nome("Jonas").build();
//            repository.save(cli);
//
//
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class,args);
    }
}
