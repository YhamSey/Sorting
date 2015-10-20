public class InsertionSort extends Sort {
    
    public InsertionSort(int[] num){
        super(num);
    }
    
    public void sortAscending(){
        int a, b, temp, c;
        for(a = 0; a < this.num.length - 1; a++){
            b = a + 1;
            c = b;
            temp = this.num[b];
            while(b > 0 && this.num[b - 1] > this.num[b]){
                    this.num[b] = this.num[b - 1];
                    b--;
                    this.num[b] = temp;
          }
      }
  }
    
    public void sortDescending(){
        int a, b, temp;
        for(a = 0; a < this.num.length - 1; a++){
            b = a + 1;
            while(b > 0 && this.num[b - 1] < this.num[b]){
                temp = this.num[b - 1];
                this.num[b - 1] = this.num[b];
                b--;
                this.num[b + 1] = temp;
            }
        }
    }
}
