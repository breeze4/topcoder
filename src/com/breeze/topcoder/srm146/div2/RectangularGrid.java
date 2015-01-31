package com.breeze.topcoder.srm146.div2;

public class RectangularGrid {

	// overtime 1/23/2015; 15 minutes 1/24/2015

	// squares are not counted
	public long countRectangles(int width, int height) {
		if (width == 1 && height == 1) {
			return 0;
		}

		// count up to the max width, each extra block is a rectangle
		long rectCount = 0;
		for (long w = 1; w <= width; w++) {
			for (long h = 1; h <= height; h++) {
				if ((w == 1 && h == 1) || w == h) {
					// don't count squares
				} else {
					long h_slices_fit = width - w + 1;
					long w_slices_fit = height - h + 1;
					rectCount += w_slices_fit * h_slices_fit;
				}
			}
		}

		return rectCount;
	}
}
