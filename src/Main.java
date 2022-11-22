import java.util.Scanner;
import java.lang.*;

public class Main {

    static void test(){
        //on prends tts les parametres et instructions
        System.out.println("Saisirle nombre de carrés sur l’axe x ");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        System.out.println("Saisirle nombre de carrés sur l’axe y ");
        int n= sc.nextInt();
        int[][] grille = new int[m][n];
        System.out.println("Saisirle la position initiale de l’aspirateur sur l’axe x");
        int x= sc.nextInt();
        System.out.println("Saisirle la position initiale de l’aspirateur sur l’axe y");
        int y= sc.nextInt();
        System.out.println("Saisirle l'orientation initiale de l’aspirateur");
        char N= sc.next().charAt(0);
        sc.nextLine();// Consume newline left-over
        System.out.println("Saisirle une série d'instructions que l’aspirateur exécutera");
        String instruc = sc.nextLine();
        //parcourire la chaine des instruction afin de deplacer l'aspirateur
        for(int i=0; i< instruc.length(); i++){
            // si l'instruction est Droite
            if(instruc.charAt(i)=='D'){
                //pivoter de 90° a droite en fct de l'orientation actuelle
                if(N=='N'){
                    N='E';
                } else if(N=='E'){
                    N='S';
                } else if(N=='S'){
                    N='W';
                } else if(N=='W'){
                    N='N';
                }
            }
            // si l'instruction est Gauche
            else if(instruc.charAt(i)=='G'){
                //pivoter de 90° a droite en fct de l'orientation actuelle
                if(N=='N'){
                    N='W';
                }else if(N=='W'){
                    N='S';
                } else if(N=='S'){
                    N='E';
                } else if(N=='E'){
                    N='N';
                }

            }
            // si l'instruction est Avance
            else if(instruc.charAt(i)=='A'){
                if(N=='N'){
                    y=y+1;
                    //avancer d'une case sur l'axe y
                } else if(N=='E'){
                    x=x+1;
                    //avancer d'une case sur l'axe x
                } else if(N=='S'){
                    y=y-1;
                    //reculer d'une case sur l'axe y
                } else if(N=='W'){
                    x=x-1;
                    //reculer d'une case sur l'axe x
                }
            }
        }
        System.out.println("x= "+x+" y= "+y+" orientation: "+N);
    }

    public static void main(String[] args) {
        test();
    }
}