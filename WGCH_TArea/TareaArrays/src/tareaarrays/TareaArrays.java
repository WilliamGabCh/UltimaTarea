
package tareaarrays;
/**
 *
 * @author WilliamGabCh
 */
public class TareaArrays {

   
    public void imprimirMatrisCadena(String[][] matriz){
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");  
                }else{
                    System.out.print("\t");
                }   
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void transformada5(int dim, int valini){
        System.out.println("Transformada 5 PROFESOR");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][(dim-1)-j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada6(int dim, int valini){
        System.out.println("Transformada 6 PROFESOR ");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada7(int dim, int valini){
        System.out.println("Transformada 7 William(1)");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0 ; j < (dim-i); j++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada8(int dim, int valini){
        System.out.println("Transformada 8 William(2)");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dim-1)-i ; j++) {
                matriz[i][(j+i)]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada9(int dim, int valini){
        System.out.println("Transformada 9 William(3)");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][((dim-1)-i)+j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada10(int dim, int valini){
        System.out.println("Transformada 10 William(4)");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][(i)-j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada11(int dim, int valini){
        System.out.println("Transformada 11 William(5)");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0 ; j < (dim-i); j++) {
                matriz[i][((dim-1)-i)-j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada12(int dim, int valini) {
        System.out.println("Transformada 12 PROFESOR ");
        String[][] matriz=new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dim-1)-i; j++) {
                matriz[i][(dim-1)-j]=""+valini;
                valini++;
            }
        }  
        imprimirMatrisCadena(matriz);
    }
    public void transformada13(int dim, int valini) {
        System.out.println("Transformada 13 William(6)");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dim-1)-j; i++) {
                matriz[i][j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada14(int dim, int valini){
        System.out.println("Transformada 14 William(7)");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0 ; i <= j; i++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    } 
    public void transformada15(int dim, int valini){
        System.out.println("Transformada 15 William(8)");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < dim - j; i++) {
                matriz[(dim-1)-i][j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada16(int dim, int valini){
        System.out.println("Transformada 16 William(9)");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dim-1)-i][j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada17(int dim, int valini) {
        System.out.println("Transformada 17 William(10)");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dim-1)-j; i++) {
                matriz[i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada18(int dim, int numini) {
        System.out.println("Transformada 18 William(11)");
        String[][] matriz=new String[dim][dim];
        for (int j = matriz[0].length-1; j >=0; j--) {
            for (int i = 0; i < (matriz.length)-j; i++) {            
                matriz[i][j]=""+numini;
                numini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada19(int dim, int valini){
        System.out.println("Transformada 19 William(12)");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < dim - j; i++) {
                matriz[(dim-1)-i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada20(int dim, int valini){
        System.out.println("Transformada 20 William(13)");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dim-1)-i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada21(int dim, int valini) {
        System.out.println("TRansformada 21 PROFESOR");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }
        }
        imprimirMatrisCadena(matriz);
    } 
    public void transformada24(int dim, int valini) {
        System.out.println("TRansformada 24");
        String[][] matriz=new String[dim][dim];
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valini;
                    valini++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }
        }
        imprimirMatrisCadena(matriz);
    }
    public void transformada28(int dimen, int numInit) {
        System.out.println("Transformada PROFESOR");
        String[][] matriz=new String[dimen][dimen];//j=filas, i=columnas
        for (int j = matriz.length-1; j >=0; j--) {
            if(j%2==0){
                for (int i = 0; i < (matriz[0].length); i++) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }else{
                for (int i = matriz[0].length-1; i >=0 ; i--) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }
        }
        imprimirMatrisCadena(matriz);
    }    
   
    public static void main(String[] args) {
        //william
        TareaArrays arr= new TareaArrays();
        arr.transformada5(5, 0); 
        arr.transformada6(5, 0);
        arr.transformada7(5, 0);
        arr.transformada8(5, 0);
        arr.transformada9(5, 0);
        arr.transformada10(5, 0);
        arr.transformada11(5, 0);
        arr.transformada12(5, 0);
        arr.transformada13(5, 0);
        arr.transformada14(5, 0);
        arr.transformada15(5, 0);
        arr.transformada16(5, 0);
        arr.transformada17(5, 0);
        arr.transformada18(5, 0);
        arr.transformada19(5, 0);
        arr.transformada20(5, 0);
        arr.transformada21(5, 0);
        arr.transformada24(5, 0);
        arr.transformada28(5, 0);
    }
    
}
