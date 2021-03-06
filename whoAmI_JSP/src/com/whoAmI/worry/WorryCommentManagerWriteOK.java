package com.whoAmI.worry;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whoAmI.action.Action;
import com.whoAmI.action.ActionForward;
import com.whoAmI.managerWorry.vo.WorryCommentManagerVO;
import com.whoAmI.worry.dao.WorryDAO;
import com.whoAmI.worry.vo.WorryCommentVO;

public class WorryCommentManagerWriteOK implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		WorryDAO dao = new WorryDAO();
		WorryCommentManagerVO worryManager = new WorryCommentManagerVO();
		
		
		worryManager.setWorryCommentManagerContent(req.getParameter("ManagerContents"));
		worryManager.setWorryNumber(Integer.parseInt(req.getParameter("worryNumber")));
		worryManager.setUserNumberExpert((Integer)req.getSession().getAttribute("userNumber"));
		dao.commentManagerinsert(worryManager);
		
		
		
		return null;
	}
}
