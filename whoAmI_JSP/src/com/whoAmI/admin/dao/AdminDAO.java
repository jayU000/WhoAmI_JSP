package com.whoAmI.admin.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.whoAmI.admin.vo.AdminVO;
import com.whoAmI.managerExpert.vo.ConsultPaymentDetailVO;
import com.whoAmI.managerExpert.vo.ExpertProfileVO;
import com.whoAmI.managerWorry.vo.WorryCommentManagerDTO;
import com.whoAmI.managerWorry.vo.consultReviewVO;
import com.whoAmI.mybatis.config.MyBatisConfig;
import com.whoAmI.user.vo.UserVO;
import com.whoAmI.worry.vo.WorryVO;

public class AdminDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessoinFactory();
	SqlSession sqlSession;

	public AdminDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

	// 아이디 중복검사
	public boolean checkId(String managerId) {// 아이디가 존재하면 1 true, 없으면 0 false
		return (Integer) sqlSession.selectOne("Admin.checkId", managerId) == 1;
	}

	// 회원가입
	public void join(AdminVO admin) {
		sqlSession.insert("Admin.join", admin);
	}

	// 로그인
	public int login(Map<String, String> loginMap) {
		int managerNumber = 0;
		try {
			managerNumber = sqlSession.selectOne("Admin.login", loginMap);
		} catch (Exception e) {
			;
		}
		return managerNumber;
	}

	// 회원정보 상단 표시
	public String header(String managerId) {
		return sqlSession.selectOne("Admin.header", managerId);
	}
	
	
	//총 회원수
	public int everyUser() {
		return sqlSession.selectOne("Admin.everyUser");
	}
	
	//남자 수
	public int everyMan() {
		return sqlSession.selectOne("Admin.everyMan");
	}
	
	//여자 수
	public int everyWoman() {
		return sqlSession.selectOne("Admin.everyWoman");
	}
	
	//총 회원수
	public int allUser() {
		return sqlSession.selectOne("Admin.allUser");
	}
	
	//남자 수
	public int allMan() {
		return sqlSession.selectOne("Admin.allMan");
	}
	
	//여자 수
	public int allWoman() {
		return sqlSession.selectOne("Admin.allWoman");
	}
	
	//총 전문가 수
	public int allExpert() {
		return sqlSession.selectOne("Admin.allExpert");
	}
	
	//총 여자 전문가 수
	public int allWomanExpert() {
		return sqlSession.selectOne("Admin.allWomanExpert");
	}
	
	//총 남자 전문가 수
	public int allManExpert() {
		return sqlSession.selectOne("Admin.allManExpert");
	}
	
	//1급 자격증 전문가 수
	public int allFirstExpert() {
		return sqlSession.selectOne("Admin.allFirstExpert");
	}
	
	// 2급 자격증 전문가 수 
	public int allSecondExpert() {
		return sqlSession.selectOne("Admin.allSecondExpert");
	}
	
	//총 게시글 개수
	public int allWorry() {
		return sqlSession.selectOne("Admin.allWorry");
	}
	
	//총 남성글 개수 
	public int allManWorry() {
		return sqlSession.selectOne("Admin.allManWorry");
	}
	
	//총 여성글 개수
	public int allWomanWorry() {
		return sqlSession.selectOne("Admin.allWomanWorry");
	}
	
	//총 가입수
	public int allJoin() {
		return sqlSession.selectOne("Admin.allJoin");
	}
	
	//총 결제 수
	public int allPay() {
		return sqlSession.selectOne("Admin.allPay");
	}
	
	//총 후기 수
	public int allReview() {
		return sqlSession.selectOne("Admin.allReview");
	}

}
