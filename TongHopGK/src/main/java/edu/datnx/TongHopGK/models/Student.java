package edu.datnx.TongHopGK.models;

public class Student {
    private String mssv;         
    private String fullName;     
    private double averageGrade; 

    public Student(String mssv, String fullName, double averageGrade) {
        this.mssv = mssv;
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", fullName=" + fullName + ", averageGrade=" + averageGrade + "]";
	}
    
}
