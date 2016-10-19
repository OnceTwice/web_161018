package com.bit2016.web.util;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class WebUtil {
	public static void forward(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException {
		// forwarding(request 연장, request dispatch)
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
	
	public static void redirect(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
		response.sendRedirect(url);
	}
}
