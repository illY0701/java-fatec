//Exercícios - Classes


//Camera Digital

public class camera {
    public static void main(String[] args) {
        CameraDigital camera = new CameraDigital();

        camera.marca = "Canon";
        camera.resolucaoMP = 24;
        camera.Wifi = true;

        camera.mostrar();
    }
}

class CameraDigital {
    String marca;
    int resolucaoMP;
    boolean Wifi;

    void mostrar() {
        if (marca != null) {
            System.out.println(
                    "Marca: " + marca + "\n" +
                    "Resolucao: " + resolucaoMP + "MP\n" +
                    "WiFi? " + (Wifi ? "Yes" : "No")
            );
        } else {
            System.out.println("A camera digital não existe!!");
        }
    }
} 


//Carro

public class carro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cor = "Azul";
        carro.placa = "ABC123";
        carro.marca = "Toyota";
        carro.tipo = "Sedan";

        carro.mostrar();
    }
}

class Carro {

    String cor;
    String placa;
    String marca;
    String tipo;

    void mostrar() {
            System.out.println(
                    "Cor: " + cor + "\n" +
                    "Placa: " + placa + "\n" +
                    "Marca: " + marca + "\n" +
                    "Tipo: " + tipo
            );
        
    }
}


//Dança

public class danca {
    public static void main(String[] args) {

        Dança dança = new Dança();

        dança.tipo = "Ballet clássico";
        dança.duracaoMin = 5;
        dança.ritmo = "lento";

        dança.mostrar();
    }
}

class Dança {

    String tipo;
    double duracaoMin;
    String ritmo;

    void mostrar() {
            System.out.println(
                    "Tipo de dança: " + tipo + "\n" +
                    "Duração: " + duracaoMin + "\n" +
                    "Ritmo: " + ritmo + "\n");
    }
}


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


//Motocicleta

public class motocicleta {
    public static void main(String[] args) {

        Motocicleta motocicleta = new Motocicleta();

        motocicleta.tipoRoda = "Esportiva";
        motocicleta.cor = "Red";
        motocicleta.marca = "Honda";
        motocicleta.motor = "250cc";

        motocicleta.mostrar();
    }
}

class Motocicleta {

    String tipoRoda;
    String cor;
    String marca;
    String motor;

    void mostrar() {
        if (tipoRoda != null && cor != null && marca != null && motor != null) {
            System.out.println(
                    "Tipo de roda: " + tipoRoda + "\n" +
                            "Cor: " + cor + "\n" +
                            "Marca: " + marca + "\n" +
                            "Motor: " + motor
            );
        } else {
            System.out.println("A motocicleta não possui as informações completas!!");
        }
    }
}


//Smartphone
public class smartphone {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        smartphone.modelo = "Galaxy S21";
        smartphone.marca = "Samsung";
        smartphone.armazenamentoGB = 128;
        smartphone.temBluetooth = true;

        smartphone.mostrar();
    }
}

class Smartphone {
    String modelo;
    String marca;
    int armazenamentoGB;
    boolean temBluetooth;

    void mostrar() {
        if (modelo != null && marca != null) {
            System.out.println(
                    "Modelo: " + modelo + "\n" +
                    "Marca: " + marca + "\n" +
                    "Armazenamento: " + armazenamentoGB + "GB\n" +
                    "Tem Bluetooth? " + (temBluetooth ? "Sim" : "Não")
            );
        } else {
            System.out.println("Este smartphone não existe!!");
        }
    }
}


//Super homem

public class superhomem {
    public static void main(String[] args) {
        Superheroi superhomem = new Superheroi();

        superhomem.nome = "Superman";
        superhomem.poderPrincipal = "Super Força";
        superhomem.voar = true;

        superhomem.mostrar();
    }
}

class Superheroi {
    String nome;
    String poderPrincipal;
    boolean voar;

    void mostrar() {
        if (nome != null && poderPrincipal != null) {
            System.out.println(
                    "Nome: " + nome + "\n" +
                    "Poder Principal: " + poderPrincipal + "\n" +
                    "Pode Voar? " + (voar ? "Sim" : "Não")
            );
        } else {
            System.out.println("Não é um super héroi!!");
        }
    }
}


//Ventilador

public class ventilador {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();

        ventilador.material = "Plástico";
        ventilador.marca = "Philips";
        ventilador.potencia = 60;

        ventilador.mostrar();
    }
}
class Ventilador {

    String material;
    String marca;
    int potencia;

    void mostrar() {
      
            System.out.println(
  
                            "Material: " + material + "\n" +
                            "Marca: " + marca + "\n" +
                            "Potência: " + potencia + " watts");
    }
}














