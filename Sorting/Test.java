public class Test{

    public static void main(String[] args){
        Patient[] patient = new Patient[4];
        patient[0] = new Patient("Corazon", "Calimlim", 25, "Apalit");
        patient[1] = new Patient("Arcee", "Tolentino", 18, "Cavite");
        patient[2] = new Patient("Carl", "Pablea", 19, "Masantol");
        patient[3] = new Patient("Randy", "Ysulan", 21, "Cansinala");
        
        System.out.println("Unsorted Patient");
            for(int count = 0; count < patient.length; count++){
              System.out.println((count + 1) + ". " + patient[count]);
        }

        int[] ages = new int[patient.length];
            for(int a = 0; a < patient.length; a++){
              ages[a] = patient[a].getAge();
        }

        InsertionSort sort = new InsertionSort(ages);
        sort.sortAscending();
        
        System.out.println("\nSorted Patients Ascending");
            for(int r = 0; r < patient.length; r++){
                for(int c = 0; c < patient.length; c++){
                    if(sort.getValue(r) == patient[c].getAge()){
                     System.out.println((r + 1) + ". " + patient[c]);
                }
            }
        } 
        BubbleSort sorted = new BubbleSort(ages);
        sort.sortDescending();

        System.out.println("\nSorted Patients Descending");
            for(int r = 0; r < patient.length; r++){
                for(int c = 0; c < patient.length; c++){
                    if(sort.getValue(r) == patient[c].getAge()){
                     System.out.println((r + 1) + ". " + patient[c]);
                }
            }
        } 
    
    }
}
