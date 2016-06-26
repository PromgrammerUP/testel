package org.javachina.el.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
//@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginUserDto dto = new LoginUserDto();
		dto.setUserId("system");
		dto.setUserName("manager");
		request.setAttribute("userId", "scott");
		request.setAttribute("user", dto);
		//传一个数组
		String[] arrs = new String[] {"zhangsan","lisi","wangwu"};
		request.setAttribute("arrs", arrs);
		//集合
		ArrayList list = new ArrayList(); 
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		request.setAttribute("list", list);
		//map
		HashMap map = new HashMap();
		map.put("name", "zhangsan");
		map.put("sex", "male");
		request.setAttribute("map", map);
		
		request.getRequestDispatcher("/page2.jsp?studentName=zhangsan").forward(request, response);
	}

	

}
