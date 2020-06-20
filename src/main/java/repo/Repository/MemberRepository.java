package repo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import repo.Model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
