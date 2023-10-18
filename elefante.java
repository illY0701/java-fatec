 //Elefante

public class elefante {
    public static void main(String[] args) {
        
        Elefante elefante = new Elefante();

        elefante.alturaM = 3.5;
        elefante.idade = 10;
        elefante.pesoKG = 5000;

        elefante.mostrar();
    }
}

class Elefante {
    
    double alturaM;
    int idade;
    double pesoKG;

     void mostrar() {
       
            System.out.println(
                    "Altura: " + alturaM + " metros\n" +
                    "Idade: " + idade + " anos\n" +
                    "Peso: " + pesoKG + " KG");   
    }
}
