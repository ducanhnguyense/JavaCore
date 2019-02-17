package ducanh.demo;

import java.util.Random;

public class ArrayExample

{

	public static void main(String args[])

	{
		array1();
		
		// array2a();

		//array2b();

	}

	//mang 1 chieu

	public static void array1()

	{

		int a1[] = { 1, 2, 3, 4, 5 };

		int a2[];

		a2 = new int[5];

		int i;

		for (i = 0; i < 5; ++i)
			a2[i] = 2 * a1[i];

		long S = 0;

		for (i = 0; i < 5; ++i)
			S += a1[i] + a2[i];

		System.out.print("Sum of 2 arrays: ");

		System.out.println(S);

	}

	//mang 2 chieu (phan tu tren moi dong bang nhau

	public static void array2a()

	{

		int a[][] = { { 1, 2, 3, 6 }, { 4, 5, 4, 5 }, { 1, 3, 5, 7 } };

		// a= new int[3][4];

		long S = 0;

		for (int i = 0; i < a.length; ++i)

		{
			for (int j = 0; j < a[i].length; j++)

				System.out.printf("%3d", a[i][j]);

			System.out.println();

		}

	}

	//mang 2 chieu (Jagged array)

	public static void array2b()

	{

		int a[][], col;

		a = new int[3][];

		Random r = new Random();

		// Random phan tu moi dong

		for (int i = 0; i < a.length; i++)

		{

			col = r.nextInt(3) + 3;

			a[i] = new int[col];

		}

		// Tao gia tri ngau nhien cho phan tu trong mang

		for (int i = 0; i < a.length; ++i)

			for (int j = 0; j < a[i].length; j++)

				a[i][j] = r.nextInt(100);

		// xuat mang

		for (int i = 0; i < a.length; ++i)

		{
			for (int j = 0; j < a[i].length; j++)

				System.out.printf("%3d", a[i][j]);

			System.out.println();

		}

	}

}
