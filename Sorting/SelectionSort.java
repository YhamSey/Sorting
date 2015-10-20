public class SelectionSort extends Sort {
    
    public SelectionSort(int num[]){
        super(num);
    }
    
    public void sortAscending(){
        for(int a = 0; a < this.num.length - 1; a++){
            for(int b = a + 1; b < this.num.length; b++){
                if(this.compare(a, b) == a){
                    this.swap(a, b);
           }
        }
    }
 }
    
    public void sortDescending(){
        for(int a = 0; a < this.num.length - 1; a++){
            for(int b = a + 1; b < this.num.length; b++){
                if(this.compare(a, b) == b){
                    this.swap(a, b);
                }
            }
        }
    }
}
