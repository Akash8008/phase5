package com.example.demo;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/")
	public ModelAndView basepage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletResponse response,HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		Student s=new Student();
        s.setName(request.getParameter("name"));
        s.setEmail(request.getParameter("email"));
         Student student=dao.insert(s);
         if(student!=null) {
        	 mv.setViewName("display.jsp");
         }
		return mv;
	}
	
	@RequestMapping("/view")
	public ModelAndView view(HttpServletResponse response,HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		List<Student> list=dao.view();
		mv.setViewName("displayall.jsp");
		mv.addObject("list", list);
		return mv;
	
	}
}
