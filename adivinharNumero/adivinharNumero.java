/*Basicamente nesse projeto uso 2 librarys, uma e o math para selecionar um numero aleatorio de 1 a 10 em uma arrayList
e tambem tem a library scanner para solicitar input de um numero do usuario, apor isso, e o basico, se o numero aleatorio
for igual ao input do usuario, acertou, se nao, errou, uma chance 1/10 :)*/
import java.lang.Math;
import java.util.Scanner;
void main() {
    ArrayList<Number> numbersAltamenteLegais = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for(int i =0;i<10;i++){
        numbersAltamenteLegais.add(i+1);
    }
    int randomNumber = numbersAltamenteLegais.get((int) (Math.random() * numbersAltamenteLegais.size())).intValue();
    int inputUser = sc.nextInt();
    if(inputUser==randomNumber){
        System.out.println("Acertou, tipo eh, tipo ah, tipo ndhave");
    }
    else{
        System.out.println("errou, neandertal, apagando System32.....");
    }
}
