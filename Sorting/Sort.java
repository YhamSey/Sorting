public class Sort {
    
    protected int[] num;
    
    public Sort(int[] num){
        this.num = num; }
    
    public void swap(int a , int b){
        int temp = this.num[a];
        this.num[a] = this.num[b];
        this.num[b] = temp;}
    
    public int compare(int indexY, int indexZ){
        if(this.num[indexY] > this.num[indexZ]){
            return indexY;
        }
         else if(this.num[indexY] < this.num[indexZ]){
            return indexZ;
        }
        else{
            return -1;
        }
    } 
    public void displayArray(){
        for(int a = 0; a < this.num.length; a++){
            System.out.print(this.num[a] + " ");
        }
    }
    
    public int getValue(int x){
        return this.num[x];
    }
}