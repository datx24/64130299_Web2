package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TruyenDuLieuController {
	@RequestMapping("/aboutme")
	public String truyenDuLieu(ModelMap modelMap) {
		modelMap.addAttribute("mssv", "64130299");
		modelMap.addAttribute("hoTen","Nguyễn Xuân Đạt");
		modelMap.addAttribute("namSinh","2004");
		modelMap.addAttribute("gioiTinh","Nam");
		modelMap.addAttribute("truongHoc","Đại Học Nha Trang");
		modelMap.addAttribute("lop", "64.CNTT_CLC");
		modelMap.addAttribute("email","dat.nx.64cntt@ntu.edu.vn");
		return "index";
	}
}
