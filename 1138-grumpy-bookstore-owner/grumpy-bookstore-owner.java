class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int base=0;

        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }

        int total=base;

        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                total+=customers[i];
            }
        }
        int max=total;

        for(int i=0,j=minutes;j<grumpy.length;i++,j++){
            if(grumpy[i]==1){
                total-=customers[i];

            }
            if(grumpy[j]==1){
                total+=customers[j];
            }

            if(total>max)max=total;

        }
        return max;
    }
}