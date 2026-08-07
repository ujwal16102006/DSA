class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
         max_candy = max(candies)
         return [candy + extraCandies >= max_candy for candy in candies]
        