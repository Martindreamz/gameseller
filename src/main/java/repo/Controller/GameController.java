package repo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repo.Model.Game;
import repo.Repository.GameRepository;

@Controller
public class GameController {

	@Autowired
	GameRepository grepo;


	@RequestMapping("/gallery")
	public String gallery(Model model) {
		List<Game> gallery = (List<Game>) grepo.findAll();
		for (Game g :gallery) {
			System.out.println(g);
		}

		model.addAttribute("gallery", gallery);
		return "gallery";
	}
}
