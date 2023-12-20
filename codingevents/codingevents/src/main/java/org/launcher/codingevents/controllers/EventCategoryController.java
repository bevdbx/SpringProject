package org.launcher.codingevents.controllers;

import jakarta.validation.Valid;
import org.launcher.codingevents.data.EventCategoryRepository;
import org.launcher.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("categories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping
    public String displayAllCategories(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());
        return "categories/index";
    }

    @GetMapping("create")
    public String renderCreateCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute("categories", new EventCategory());
        return "categories/create";
    }

    @PostMapping("create")
    public String processCreateCategoryForm(@ModelAttribute @Valid EventCategory newEvent, Errors errors, Model model) {

        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Category");
            return "categories/create";
        }
        eventCategoryRepository.save(newEvent);
        return "redirect:/categories";
    }


}