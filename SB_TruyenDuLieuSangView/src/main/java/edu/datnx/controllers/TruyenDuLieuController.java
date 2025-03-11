package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.datnx.models.SinhVien;
import edu.datnx.service.SinhVienService;

@Controller
public class TruyenDuLieuController {
	SinhVienService sinhVienService = new SinhVienService();
	@GetMapping("/aboutme")
	public String truyenDuLieu(ModelMap modelMap) {
		SinhVien sv1 = new SinhVien("64130299", "Nguyễn Xuân Đạt", "Nam", "2004");
		modelMap.addAttribute("sv",sv1);
		return "index";
	}

	@GetMapping("/danhsach")
	public String truyendsObject(ModelMap m) {
		m.addAttribute("dssv",sinhVienService.getDSSV());
		return "danhsach";
	}
}
