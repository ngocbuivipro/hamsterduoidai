package exercise01;

import java.util.Scanner;

public class EducationStudentMajor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh hoc (M, C, I) va tinh trang hoc van (1, 2, 3, 4): ");
		String input = sc.nextLine();

		if (input.length() != 2) {
			System.out.println("Dau vao khong hop le ! Vui long nhap dung chinh xac hai ki tu");
		} else {
			char nganh = input.charAt(0);
			char namhoc = input.charAt(1);

			String major;
			switch (nganh) {
			case 'M':
			case 'm':
				major = "Mathematics";
				break;
			case 'C':
			case 'c':
				major = "Computer Science";
				break;
			case 'I':
			case 'i':
				major = "Information Technology";
				break;
			default:
				major = "Unknown major";

			}
			String yearStatus;
			switch (namhoc) {
			case '1':
				yearStatus = "Freshman";
				break;
			case '2':
				yearStatus = "Sophomore";
				break;
			case '3':
				yearStatus = "Junior";
				break;
			case '4':
				yearStatus = "Senior";
				break;
			default:
				yearStatus = "Unknown year status";
				break;

			}
			System.out.println(major + " " + yearStatus);
			sc.close();
		}
	}

}
