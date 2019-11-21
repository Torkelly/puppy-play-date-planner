package ppdapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ppdapp.beans.Message;
import ppdapp.repository.messageRepository;

@Controller
public class MessageController {
	
	@Autowired
	messageRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllMessages(Model model) {
		model.addAttribute("messages", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputMessage")
	public String addNewMessage(Model model) {
	    Message m = new Message();
	    model.addAttribute("newMessage", m);
	    return "input";
	}
	
	@PostMapping("/inputMessage")
	public String addNewMessage(@ModelAttribute Message m, Model model) {
		repo.save(m);
		model.addAttribute("messages", repo.findAll());
		return "results";
	}

}