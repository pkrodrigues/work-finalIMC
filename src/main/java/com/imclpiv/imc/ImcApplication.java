package com.imclpiv.imc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImcApplication.class, args);
	}
	// @Bean
	// CommandLineRunner initDatabase(UsuarioRepository usuarioRepository, ImcRepository imcRepository, HistoricoRepository historicoRepository){
	// 	return args -> {
	// 		usuarioRepository.deleteAll();
	// 		imcRepository.deleteAll();
	// 		historicoRepository.deleteAll();

	// 		Usuario u = new Usuario();
	// 		u.setEmail("mcardoso@gmail.com");
	// 		u.setNome("Maria Cardoso");

	// 		Imc i = new Imc();
	// 		i.setAltura(1.80f);
	// 		i.setPeso(68.5f);
	// 		i.setSexo(true);

	// 		Historico h = new Historico();
	// 		h.setImc(i);
	// 		u.setHistorico(h);




	// 		usuarioRepository.save(u);
	// 		imcRepository.save(i);
	// 		historicoRepository.save(h);
	// 	};
	// }
}
