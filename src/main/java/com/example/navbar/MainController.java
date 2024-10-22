package com.example.navbar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Simple controller for root context
 * 
 * @author M. Irribarra
 * @since OCt 18, 2024
 * @version 1.0
 */
@Controller
public class MainController {

    /**
     * Control {@code GET} request on {@code /} path
     * 
     * @return Main page name
     */
    @GetMapping("/")
    public String get(Model model) {
        // ModelAndView mav = new ModelAndView("main");
        // mav.addObject("menus", buildMenu());
        // return mav;
        model.addAttribute("menus", buildMenu());
        return "main";
    }

    /**
     * Dummy menu
     * 
     * @return List of menus
     */
    private List<Menu> buildMenu() {
        List<Menu> menus = new ArrayList<>();
        Menu menu = new Menu();
        menu.setText("New");
        menu.addItem(new MenuItem("Contact", "/contact"));
        menu.addItem(new MenuItem("Program", "/program"));
        menu.addItem(new MenuItem("Report", "/report"));
        menus.add(menu);
        menu = new Menu();
        menu.setText("Programs");
        menu.addItem(new MenuItem("Search", "/searchprogram"));
        menu.addItem(new MenuItem("Last search", "/lastsearch"));
        menu.addItem(new MenuItem("Load", "/load"));
        menu.addItem(new MenuItem("History", "/history"));
        menus.add(menu);
        menu = new Menu();
        menu.setText("Reports");
        menu.addItem(new MenuItem("Users", "/users"));
        menu.addItem(new MenuItem("Installed", "/installed"));
        menu.addItem(new MenuItem("Triggers", "/triggers"));
        menu.addItem(new MenuItem("Indicators", "/indicators"));
        menu.addItem(new MenuItem("Access", "/acccess"));
        menu.addItem(new MenuItem("Audit", "/audit"));
        menus.add(menu);
        return menus;
    }

}
