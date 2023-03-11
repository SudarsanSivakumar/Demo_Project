package com.mydemoproject.pgm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adminDepartment a = new adminDepartment();
		HrDepartment h = new HrDepartment();
		TechDepartment t = new TechDepartment();
		a.deptName();
		a.getTodayWork();
		a.getWorkDeadline();
		a.isTodayAHoliday();
		System.out.println();
		h.deptName();
		h.getTodayWork();
		h.getWorkDeadline();
		h.doActivity();
		h.isTodayAHoliday();
		System.out.println();
		t.deptName();
		t.getTodayWork();
		t.getWorkDeadline();
		t.getTechStackInformation();
		t.isTodayAHoliday();
	}

}
