package edu.datnx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.datnx.models.SinhVien;

public class SinhVienService {
	public List<SinhVien> getDSSV() {
		List<SinhVien> dssv = List.of(
			new SinhVien("64130299", "Nguyễn Văn An", "Nam", "2004"),
			new SinhVien("66612383", "Nguyễn Xuân Đạt", "Nam", "2006"),
			new SinhVien("65623414", "Trần Văn Phúc", "Nam", "2005"),
			new SinhVien("68235243", "Mai Thị Hoa", "Nữ", "2008")
		);
		return dssv;
	}
}
