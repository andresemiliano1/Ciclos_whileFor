import javax.swing.*;

public class positivosNegativosConteoDeCeros {
        public static void main(String[] args) {
            int numero, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0, conteo_cero = 0;
            float media_pos,media_neg;

            for(int i=1;i<=10;i++){
                numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));

                if (numero == 0) {// si el numero es cero
                    conteo_cero++; //aumentamos en 1 el conteo de ceros
                }
                else if (numero>0) { //si el numero es positivo
                    suma_pos += numero; //suma iterativa de positivos
                    conteo_pos++;
                }
                else {
                    suma_neg += numero;
                    conteo_pos++;
                }
            }
            // tratamos los positivos para sacar la media
            if (conteo_pos==0){
                System.out.println("no se puede sacar la media de los positivos");
            }
            else {
                media_pos = (float) suma_pos/conteo_pos;
                System.out.println("la media de los positivos es: "+media_pos);
            }
            // vamos con los negativos
            if (conteo_neg==0){
                System.out.println("no se puede sacar la media de los negativos");
            }
            else {
                media_neg = (float) suma_neg / conteo_neg;
                System.out.println("la media de los negativos es: " + media_neg);
            }
        }
}
