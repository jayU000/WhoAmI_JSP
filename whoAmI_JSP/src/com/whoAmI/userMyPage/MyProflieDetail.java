package com.whoAmI.userMyPage;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whoAmI.action.Action;
import com.whoAmI.action.ActionForward;
import com.whoAmI.user.vo.UserVO;
import com.whoAmI.userMyPage.dao.MyPageUserInformDAO;
import com.whoAmI.userMyPage.vo.ConsultPaymentDetailDTO;

public class MyProflieDetail implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		
		
		MyPageUserInformDAO MPUdao = new MyPageUserInformDAO();
		
		
		UserVO user = MPUdao.getInfo((Integer)req.getSession().getAttribute("userNumber"));
		List<ConsultPaymentDetailDTO> ConsultList =  MPUdao.consultDetail(((Integer)req.getSession().getAttribute("userNumber")));
		
		System.out.println(ConsultList.size());
		
		ActionForward af = new ActionForward();
		
		req.setAttribute("ConsultList", ConsultList);
		req.setAttribute("user", user);

		af.setRedirect(false);
		af.setPath("/app/myPage/myPage.jsp");
		
		return af;
	}
	
}
