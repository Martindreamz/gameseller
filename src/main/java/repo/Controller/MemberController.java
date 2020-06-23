package repo.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import repo.Model.Game;
import repo.Model.Member;
import repo.Repository.MemberRepository;

@Controller
@RequestMapping("/")
public class MemberController {
	@Autowired
	MemberRepository mrepo;

	@InitBinder
	protected void InitBinder(WebDataBinder binder) {

	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/profile")
	public String profile(@ModelAttribute("member") Member member,Model model) {
		List<Member> allmembers = mrepo.findAll();
		System.out.println(member);
		for (Member m: allmembers) {
			System.out.println(m);
			if(m.getName().equals(member.getName())) {
				model.addAttribute("errormsg", "The name is taken");
				return "signup";
			}
		}
		mrepo.save(member);
		return "profile";
	}

	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}

	@GetMapping("/cart")
	public String cart(@ModelAttribute("cart") List<Game> cart, Model model) {

		
		return "cart";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		return "signup";
	}
}

