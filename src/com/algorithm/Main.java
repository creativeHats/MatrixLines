/**
 * 
 */
package com.algorithm;

/**
 * @author nehajirafe
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] grid1 = new char[][] {  "X..X".toCharArray(), 
										"...X".toCharArray(), 
										"...X".toCharArray() };

		char[][] grid2 = new char[][] {  "...X".toCharArray(), 
										"XX.X".toCharArray(), 
										"...X".toCharArray() };

		char[][] grid3 = new char[][] {  "...X".toCharArray(), 
										"...X".toCharArray(), 
										"...X".toCharArray() };

		char[][] grid4 = new char[][] {  "...X".toCharArray(), 
										"XXXX".toCharArray(), 
										"...X".toCharArray() };
										
		char[][] grid5 = new char[][] {  "X".toCharArray() };	
		
		char[][] grid6 = new char[][] {  ".".toCharArray() };	
		
		char[][] grid7 = new char[4][4] ;

		char[][] grid8 = new char[][] {  "X.".toCharArray(),
										".X".toCharArray()};	
		
		NumberOfLines numberOfLines = new NumberOfLines();
		System.out.println(numberOfLines.getNumberOfLines(grid1));
		System.out.println(numberOfLines.getNumberOfLines(grid2));
		System.out.println(numberOfLines.getNumberOfLines(grid3));
		System.out.println(numberOfLines.getNumberOfLines(grid4));
		System.out.println(numberOfLines.getNumberOfLines(grid5));
		System.out.println(numberOfLines.getNumberOfLines(grid6));
		System.out.println(numberOfLines.getNumberOfLines(grid7));
		System.out.println(numberOfLines.getNumberOfLines(grid8));

	}

}
