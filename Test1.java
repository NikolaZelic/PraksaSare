package test1;

public class Test1 {
    
    public static int brojDvocifrenih(String str){
        int counter=0, solution=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if( jesteBroj(c) ){
                counter++;
            }
            else{
                if(counter==2)
                    solution++;
                counter=0;
            }
        }
        if(counter==2)
            solution++;
        return solution;
    }
    
    public static boolean jesteBroj(char c){
        return c>='0' && c<='9';
    }
    
    public static boolean jesteProst(int broj){
        for(int i=2; i<Math.sqrt(broj); i++){
            if(broj % i ==0)
                return false;
        }
        return true;
    }
    
    public static int zbirMatrice(int[][] Matrica){
        int zbir=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0) 
                    zbir+=Matrica[i][j];
            }
        }
        return zbir;
    }
    
    public static void stampajFiguru(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( i==0 || j==0 || j==n-1 || i==n-1 || i+j==n-1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        stampajFiguru(100);
    }
    
}
