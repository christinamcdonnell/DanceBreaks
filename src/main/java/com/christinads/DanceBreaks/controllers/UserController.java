package com.christinads.DanceBreaks.controllers;

//import com.christinads.DanceBreaks.models.User;
import com.christinads.DanceBreaks.models.User;
import com.christinads.DanceBreaks.models.data.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Christy on 9/4/2017.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;

    // Request path: /user
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("users", userDao.findAll());
        model.addAttribute("title", "DanceBreaks Homepage");
        int i = 2;
       System.out.println("CDS line" + Integer.toString(i));

        return "user/index"; /* tells the html file to "go" to */
    }

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String displayAboutForm(Model model) {
        model.addAttribute("title", "Dance Breaks - What's that?");
        return "user/about";
    }

    @RequestMapping(value = "about", method = RequestMethod.POST)
    public String processAboutForm(Model model) {

        return "redirect:";
    }


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        model.addAttribute("title", "Dance Breaks Login");
        model.addAttribute(new User());
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String processLoginForm(Model model) {
        /* GET USER LOGIN AND PW */

        /* VERIFY login INFO  IF NO ERRORS SEND TO THE USERS PERSONAL PAGE */

        return "redirect:";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String displayLogoutForm(Model model) {
        model.addAttribute("title", "Dance Breaks LOGOUT");
        return "user/logout";
    }

    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public String processLogoutForm(Model model) {
        /* DO SOMETHING HERE TO LOGOUT THE USER AND SEND THEM BACK TO THE HOMEPAGE */
        return "redirect:";
    }


    @RequestMapping(value = "contactus", method = RequestMethod.GET)
    public String displayContactUsForm(Model model) {
        model.addAttribute("title", "Dance Breaks CONTACT US");
        return "user/contactus";
    }

    @RequestMapping(value = "contactust", method = RequestMethod.POST)
    public String processContactUsForm(Model model) {
        /* DO SOMETHING HERE TO LOGOUT THE USER AND SEND THEM BACK TO THE HOMEPAGE */
        return "redirect:";
    }


/******************************************************************************
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddNewUserForm(Model model) {
        model.addAttribute("title", "Add New User");
        model.addAttribute(new User());
        //model.addAttribute("categories", userDao.findAll());
        //model.addAttribute("cheeseTypes", CheeseType.values());
        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddNewUserForm(@ModelAttribute @Valid User newUser,
                                       Errors errors, @RequestParam int userId, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Cheese");
            model.addAttribute("categories", categoryDao.findAll());
            return "cheese/add";
        }

        Category cat = categoryDao.findOne(categoryId); // import nothing use the instance NOT the class
        //findOne fetches 1 Category with the given categoryId (all fields are not filled in) FROM MAMP db
        newCheese.setCategory(cat); // Assigns info to pgm internal object & setups up other object field values (cheese category)

        cheeseDao.save(newCheese); // Saves pgm completely filled object -> to the MAMP db tables
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", cheeseDao.findAll());
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds) {

        for (int cheeseId : cheeseIds) {
            cheeseDao.delete(cheeseId);
        }

        return "redirect:";
    }
*/
}
