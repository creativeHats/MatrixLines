/**
 * 
 */
package com.algorithm;

/**
 * @author nehajirafe
 *
 */
public class NumberOfLines {
	boolean[][] seen = null;

	public int getNumberOfLines(char[][] cartesian) {

		int numOfLines = 0;
		int len = cartesian.length;
		int width = cartesian[0].length;
		seen = new boolean[cartesian.length][cartesian[0].length];
		int r = 0, c = 0;

		// Traverse vertical
		while (r < len) {
			// Traverse Horizontal
			c = 0;
			while (c < width) {
				if (cartesian[r][c] == 'X' && !seen[r][c]) {
					if (isValidLine(cartesian, r, c))
						numOfLines++;
					else 
						return -1;
				}
				c++;
			}
			r++;
		}
		return numOfLines;
	}

	private boolean isValidLine(char[][] cartesian, int x, int y) {
		int len = cartesian.length;
		int width = cartesian[0].length;

		int r = x;
		int c = y;
		// is last point in the grid
		if (r == len - 1 && c == width - 1) 
			return true;

		if (c < width - 1 && cartesian[r][c + 1] == 'X' && !seen[r][c]) {
			// isLineHorizontal = true;
			// Traverse Horizontal The point is not yet visited and is not empty
			while (c <= width - 1 && cartesian[r][c] == 'X' && !seen[r][c]) {

				// adjacent line does not touch
				if (r < len - 1 && cartesian[r + 1][c] == 'X' || r > 0 && cartesian[r - 1][c] == 'X')
					return false;
				// continue search and mark point seen

				seen[r][c] = true;
				c++;
			}
		}

		r = x;
		c = y;

		if (r < len - 1 && cartesian[r + 1][c] == 'X' && !seen[r][c]) {
			// isLinLineVertical = true;
			// Traverse vertical he point is not yet visited and is not empty
			while (r <= len - 1 && cartesian[r][c] == 'X' && !seen[r][c]) {
				// adjacent line does not touch
				if (c < width - 1 && cartesian[r][c + 1] == 'X' || c > 0 && cartesian[r][c - 1] == 'X')
					return false;
				// continue search and mark point seen
				seen[r][c] = true;
				r++;

			}
		}

		// Valid Line
		return true;

	}

}
