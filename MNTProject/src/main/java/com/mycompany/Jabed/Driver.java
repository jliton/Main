package com.mycompany.Jabed;

import org.testng.annotations.Test;

import com.mycompany.Jabed.FileExistence;
import com.mycompany.Jabed.RandomNumber;

import com.mycompany.Jabed.WW;

public class Driver {
	@Test(priority=1)
	public static void Question_1() {
		System.out.println("Question_1:");

		FileExistence.doesFileExist("Path");
	}

	@Test(priority=2)
	public static void Question_3() {
		System.out.println("Question_3:");

		RandomNumber.R_Number();
	}

	@Test(priority = 2)
	public void Question_2() throws Exception {
		System.out.println("Question_2:");
		WW.Verfication();
		WW.WeeeklySchedule("Monday");
		
	}

}
