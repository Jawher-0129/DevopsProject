package tn.esprit.tpfoyer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;
import java.util.Set;


@SpringBootApplication
public class TpFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);






    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            Foyer foyer = new Foyer();
            Bloc bloc = new Bloc(5, "Khalil", 5, foyer, Set.of());
            System.out.println(bloc.getIdBloc());
        };
    }

}
