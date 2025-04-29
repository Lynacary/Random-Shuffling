public class randomshuffling {
    public static void main(String[] args){
        int dd = 10;
        int[] myList = new int[dd];
        for(int i=0;i<dd;i++){
            myList[i]=(int)(Math.random()*100);
        }
        for(int num2:myList)
        System.out.print(num2 + " ");
        System.out.println();
        for(int i=0;i<dd-1;i++){
            int j = (int)(Math.random()*myList.length);
        int temp = myList[i];
        myList[i]=myList[j];
        myList[j]=temp;
        }
        for(int num:myList)
        System.out.print(num + " ");
        
    }
}
