package repo.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gameid;
	private String name;
	
	@ManyToOne
	private Member member;
	private LocalDateTime purchaseddate;
	public Game() {
		super();
	}
	public Game(String name, Member member, LocalDateTime purchaseddate) {
		super();
		this.name = name;
		this.member = member;
		this.purchaseddate = purchaseddate;
	}
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public LocalDateTime getPurchaseddate() {
		return purchaseddate;
	}
	public void setPurchaseddate(LocalDateTime purchaseddate) {
		this.purchaseddate = purchaseddate;
	}
	@Override
	public String toString() {
		return "Games [name=" + name + ", member=" + member + ", purchaseddate=" + purchaseddate + "]";
	}
}
