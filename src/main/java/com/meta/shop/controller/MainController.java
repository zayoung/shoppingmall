package com.meta.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.shop.model.Product;
import com.meta.shop.service.ProductService;

@Controller
public class MainController {
	
	@Autowired
	ProductService ps;
	
	@RequestMapping("bedroomMain")
	public String bedroomMain(Product product, HttpSession session, Model model) {
		String sort = "B";
		List<Product> pList = ps.selectPList(sort);
		model.addAttribute("pList", pList);
		return "main/bedroomMain";
	}
	
	@RequestMapping("livingroomMain")
	public String livingroomMain(Product product, HttpSession session, Model model) {
		String sort = "L";
		List<Product> pList = ps.selectPList(sort);
		model.addAttribute("pList", pList);
		return "main/livingroomMain";
	}
	
	@RequestMapping("kitchenMain")
	public String kitchenMain(Product product, HttpSession session, Model model) {
		String sort = "K";
		List<Product> pList = ps.selectPList(sort);
		model.addAttribute("pList", pList);
		return "main/kitchenMain";
	}
	
	@RequestMapping("libraryMain")
	public String libraryMain(Product product, HttpSession session, Model model) {
		String sort = "D";
		List<Product> pList = ps.selectPList(sort);
		model.addAttribute("pList", pList);
		return "main/libraryMain";
	}
	
	@RequestMapping("livingPropMain")
	public String livingPropMain(Product product, HttpSession session, Model model) {
		String sort = "P";
		List<Product> pList = ps.selectPList(sort);
		model.addAttribute("pList", pList);
		return "main/livingPropMain";
	}
	
	@RequestMapping("pDetail")
	public String pDetail(int pNum, Model model) {
		Product dp = ps.detailProduct(pNum);
		model.addAttribute("dp", dp);
		return "main/pDetail";
	}
	
	@RequestMapping("main")
	public String main(Product product, HttpSession session, Model model) {
		//bestBedList
		List<Product> bestBedList = ps.bestBedList();
		model.addAttribute("bestBedList", bestBedList);
		//bestKitchenList
		List<Product> bestKitchenList = ps.bestKitchenList();
		model.addAttribute("bestKitchenList", bestKitchenList);
		//bestLibraryList
		List<Product> bestLibraryList = ps.bestLibraryList();
		model.addAttribute("bestLibraryList", bestLibraryList);
		//bestLivingList
		List<Product> bestLivingList = ps.bestLivingList();
		model.addAttribute("bestLivingList", bestLivingList);
		//bestPropList
		List<Product> bestPropList = ps.bestPropList();
		model.addAttribute("bestPropList", bestPropList);
		
		return "main/main";
	}
	
}
