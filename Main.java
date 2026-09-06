
import java.lang.Math;
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> pedraPapelTesoura = new ArrayList<>();
    pedraPapelTesoura.add("Pedra");
    pedraPapelTesoura.add("Papel");
    pedraPapelTesoura.add("Tesoura");
    String computadorSelecionar = pedraPapelTesoura.get((int) (Math.random()*pedraPapelTesoura.size()));
    System.out.println("Computador: "+ computadorSelecionar);
    System.out.println("1. Pedra\n2. Papel\n3. Tesoura\n");
    int inputUser = sc.nextInt();

    //Computador wins
    if(computadorSelecionar=="Papel" && pedraPapelTesoura.get(inputUser-1) == "Pedra"){
        System.out.println("Computador wins");
    }else if (computadorSelecionar=="Pedra" && pedraPapelTesoura.get(inputUser-1) == "Tesoura") {
        System.out.println("Computador wins");
    } else if (computadorSelecionar=="Tesoura" && pedraPapelTesoura.get(inputUser-1)=="Papel") {
        System.out.println("Computador wins");
    }
    //empate
    else if (computadorSelecionar == pedraPapelTesoura.get(inputUser-1)) {
        System.out.println("Empate");
    }
    //user wins
    else {
        System.out.println("User wins");
    }
}
