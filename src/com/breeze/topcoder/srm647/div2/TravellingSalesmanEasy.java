package com.breeze.topcoder.srm647.div2;

public class TravellingSalesmanEasy {

	public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
		int totalProfit = 0;
		int[] alreadySoldItems = new int[profit.length];

		for (int cityNum : visit) {
			int maxCityProfit = 0;
			int itemSold = -1;
			for (int p = 0; p < city.length; p++) {

				if (city[p] == cityNum) {
					if (alreadySoldItems[p] == 1) {
						// cant sell this item again
					} else {
						int cityProfit = profit[p];
						if (cityProfit > maxCityProfit) {
							maxCityProfit = cityProfit;
							itemSold = p;
						}
					}
				}
			}
			if (itemSold >= 0) {
				alreadySoldItems[itemSold] = 1;
			}
			totalProfit += maxCityProfit;
		}

		return totalProfit;
	}
}
