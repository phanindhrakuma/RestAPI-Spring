package com.example.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired
    AlienRepo repo;

    @ModelAttribute
    public void modeldata(Model mi){
        mi.addAttribute("name", "phanindhra");
    }

    // @RequestMapping("/")
    // public String home(){
    //     return "index.jsp";
    // }


    //  // THE BELOW WE CAN CALL THE PRIVATE PAGES ALSO WITHOUT EXTENSION FOR THAT MAKE THE CHANGES IN application properties

    @RequestMapping("/")
    public String home(){
        return "index1";
    }


    @RequestMapping("add")
    // public String result(HttpServletRequest req){

    //     int i = Integer.parseInt(req.getParameter("num1"));
    //     int j = Integer.parseInt(req.getParameter("num2"));

    //     int num3 = i+j;
    //     HttpSession session = req.getSession();
    //     session.setAttribute("num3", num3);
    //     return "result.jsp";


    // BELOW WE CAN MAKE THE CODE SMALLER 


    // public String result(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session){
    //     int num3 = i+j;
    //     session.setAttribute("num3", num3);
    //     return "result.jsp";
    // }

    //BELOWE USE THE MVC ODEL VIEW AND PERFORMING THE SAME OPERATION

    // public ModelAndView result(@RequestParam("num1") int i, @RequestParam("num2") int j){
        
    //     ModelAndView mv = new ModelAndView();
    //     mv.setViewName("result.jsp");
    //     int num3 = i+j;
    //     mv.addObject("num3", num3);
    //     return mv;  // this will return the result.jsp
    // }


    // THE BELOW WE CAN CALL THE PRIVATE PAGES ALSO WITHOUT EXTENSION FOR THAT MAKE THE CHANGES IN application properties
    public ModelAndView result(@RequestParam("num1") int i, @RequestParam("num2") int j){
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result1");
        int num3 = i+j;
        mv.addObject("num3", num3);
        return mv;  // this will return the result.jsp
    }


    // @RequestMapping("addAlien")
    // public String result(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m){
    //     Alien a = new Alien();
    //     a.setAid(101);
    //     a.setAname(aname);
    //     m.addAttribute("alien",a);
    //     return "result2";
    // }


    //THE BELOW WE ARE PERFORMING THE ABOVE SAME OPERATION UBUT USING THE MODEL ATTIBUTE 
    // @RequestMapping("addAlien")
    // public String result(@ModelAttribute Alien a, Model m){
    //     m.addAttribute("alien",a);
    //     return "result2";
    // }

    //ANOTHER WAY FOR ABOVE OPERATION

    // @RequestMapping(value = "addAlien" , method = RequestMethod.POST)
    // public String result(@ModelAttribute ("alien") Alien a){  // what we mention in that bracket (alien) the data will transfered to the alien from 'a'
        
    //     return "result2";
    // }

    // THE BEOW WE ARE USING THE ACCEPTING THE POOST AND GET RQUEST IN ANOTHER METHOD

    @PostMapping(value = "addAlien" )  // for get we ca use the (@GetMapping)
    public String result(@ModelAttribute ("alien") Alien a){  // what we mention in that bracket (alien) the data will transfered to the alien from 'a'
        
        return "result2";
    }
    @GetMapping("getAliens")
    public String getAliens(Model m){
        List<showaliens> aliens = Arrays.asList(new showaliens(101,"pani"), new showaliens(102, "kumar"));
        m.addAttribute("result", aliens);
        return "showalien";
    }


    @GetMapping("getdata")
    public String getdata(Model m){
        m.addAttribute("result", repo.findAll());
        return "showalien";
    }
    
    @SuppressWarnings("deprecation")
    @GetMapping("getonedata")
    public String getonedata(@RequestParam int aid ,  Model m){
        m.addAttribute("result", repo.getOne(aid));
        return "showalien";
    }
    @PostMapping(value = "adddata" )  // for get we ca use the (@GetMapping)
    public String adddata(@ModelAttribute ("alien") Alien a){  // what we mention in that bracket (alien) the data will transfered to the alien from 'a'
        repo.save(a);
        return "result2";
    }

    @GetMapping("getdataname")
    public String getdataname(@RequestParam String aname ,  Model m){
        m.addAttribute("result", repo.findByAname(aname));
        return "showalien";
    }

    @GetMapping("queryname")
    public String queryname(@RequestParam String aname ,  Model m){
        m.addAttribute("result", repo.find(aname));
        return "showalien";
    }
}
// NOte if the jsp file is downloading in trhe webpage we have to add the tomcat jasper in the pom.xml file 