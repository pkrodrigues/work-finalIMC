package com.imclpiv.imc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.imclpiv.imc.model.Usuario;
import com.imclpiv.imc.repository.UsuarioRepository;

@SpringBootApplication
public class ImcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImcApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(UsuarioRepository usuarioRepository){
		return args -> {
			usuarioRepository.deleteAll();

			Usuario u = new Usuario();
			u.setEmail("mcardoso@gmail.com");
			u.setNome("Maria Cardoso");

			usuarioRepository.save(u);
		};
	}
}
