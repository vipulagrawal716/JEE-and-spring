package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	/*@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myname)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myname);
		mv.setViewName("home");
		return mv;*/
		/*@RequestMapping("home")
		//@ResponseBody-it's return data as a text.
		public String home(@RequestParam("name")String mynameString name, HttpSession session)
		{
			
			 * HttpSession session = req.getSession(); String name =
			 * req.getParameter("name"); session.setAttribute("name", name);
			 
			session.setAttribute("name",myname);
			System.out.println("hii " + myname);
			return "home";*/
	/* @RequestMapping("home") */
	/*public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	
		
	}*/
	

}
