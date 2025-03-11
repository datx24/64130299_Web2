package edu.datnx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.datnx.models.SinhVien;

@Service
public class SinhVienService {
	public List<SinhVien> getDSSV() {
		List<SinhVien> dssv = List.of(
			new SinhVien("111", "Nguyễn Văn An", "Nam", "2012"),
			new SinhVien("123", "Nguyễn Xuân Đạt", "Nam", "2001"),
			new SinhVien("231", "Nguyễn Văn Phúc", "Nam", "2004")
		);
		return dssv;
	}
}
