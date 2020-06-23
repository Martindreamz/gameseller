package repo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import repo.Model.Game;
import repo.Model.Member;
import repo.Repository.GameRepository;
import repo.Repository.MemberRepository;

@SpringBootApplication
public class GamesellerApplication {

	@Autowired
	GameRepository grepo;

	@Autowired
	MemberRepository mrepo;

	public static void main(String[] args) {
		SpringApplication.run(GamesellerApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
//			Member Martin = new Member("Martin","@qwert123");
//			mrepo.save(Martin);
//			Member Martini = new Member("Martini","@qwert123");
//			mrepo.save(Martini);
//			
//			Game overcookeda = new Game("Overcooked");
//			grepo.save(overcookeda);
//			Game overcookedb = new Game("Overcooked2");
//			grepo.save(overcookedb);
//			Game overcookedc = new Game("Overcooked3");
//			grepo.save(overcookedc);
		};

	}
}
