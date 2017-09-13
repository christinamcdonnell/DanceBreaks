package com.christinads.DanceBreaks.controllers;

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
    private UsereDao userDao;

    // Request path: /user
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("users", userDao.findAll());
        model.addAttribute("title", "DanceBreaks Homepage");

        return "user/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute("title", "Add Cheese");
        model.addAttribute(new Cheese());
        model.addAttribute("categories", categoryDao.findAll());
        //model.addAttribute("cheeseTypes", CheeseType.values());
        return "cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute @Valid Cheese newCheese,
                                       Errors errors, @RequestParam int categoryId, Model model) {

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

}
