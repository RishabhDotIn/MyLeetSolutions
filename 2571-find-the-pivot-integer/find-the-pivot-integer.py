class Solution:
    def pivotInteger(self, n: int) -> int:
        sum=n*(n+1)//2

        x=int(math.sqrt(sum))

        if(x*x==sum):
            return x

        return -1