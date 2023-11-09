//Atividade 1

//1-	
	import java.util.Scanner; 
     	public class Principal{ 
   	public static void main(String[] args) { 
         	int idade; 
        	Scanner ler = new Scanner(System.in); 
        	System.out.println("Digite sua idade: "); 
        	idade = ler.nextInt(); 
        	if (idade < 18) 
             {  
                    System.out.println("Voce e menor de idade"); 
              }
              else if (idade >= 18 && idade < 60)
            { 
                     System.out.println("Voce e um adulto"); 
              }  
               else if (idade >= 60)
            {
                    System.out.println("Voce e idoso")
             }
    } 
}


//2-          
	 import java.util.Scanner; 
     	public class Principal{ 
   	public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in); 
         	int soma = 0, atual = 1; 
        	System.out.println("Digite um numero: "); 
        	int n = ler.nextInt();
        	for (int c=1; c<n; c++)
        	{ 
        	    soma += atual;
        	    atual += 2;
        	}
        System.out.println("A soma dos numeros impares e: " + soma);
    }
}


//3-           
	import java.util.Scanner; 
     	public class Principal{ 
   	public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in); 
        
         	String[] nomes = new String[5];
         	String outronm;
        	for (int c=1; c<4; c++)
        	{ 
        	    System.out.println("Digite um nome: "); 
        	    nomes[c] = ler.nextLine();
        	}
        System.out.println("Digite outro nome para verificar: "); 
        outronm = ler.nextLine();
            for (int c=1; c<4; c++)
        	{ 
        	    if (outronm.equals(nomes[c]))
        	    {
        System.out.println("Nome igual encontrado!");	
        	    }
        	}
    } 
}


//4- 
import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        String senhaSecret = "python123";
        Scanner ler = new Scanner(System.in);
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite a senha: ");
            String senha = ler.nextLine();

            if (senha.equals(senhaSecret)) {
                System.out.println("Senha correta! Acesso concedido.");
                break;
            } else {
            System.out.println("Senha incorreta. Tentativa invalida. Tentativas restantes: " + (--tentativas));
            }
        }
        ler.close();

        if (tentativas == 0) {
            System.out.println("Voce excedeu o numero maximo de tentativas. Acesso negado.");
        }
    }
}


//5- 
import java.util.Scanner;
public class GerenciamentoNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantas materias voce tem no semestre? ");
        int numMateria = ler.nextInt();
        ler.nextLine();

        System.out.print("Qual e a media para ser aprovado(a)? ");
        double mediaAprovacao = ler.nextDouble();
        ler.nextLine();

        String[] nomesMateria = new String[numMateria];
        double[] notasP1 = new double[numMateria];
        double[] notasP2 = new double[numMateria];
        double[] notasTrabalho = new double[numMateria];

        for (int n = 0; n < numMateria; n++) {
            System.out.println("Disciplina " + (n + 1));

            System.out.print("Digite o nome da materia: ");
            nomesMateria[n] = ler.nextLine();

            System.out.print("Nota da P1: ");
            notasP1[n] =ler.nextDouble();

            System.out.print("Nota da P2: ");
            notasP2[n] = ler.nextDouble();

            System.out.print("Nota do trabalho: ");
            notasTrabalho[n] = ler.nextDouble();

            ler.nextLine(); 
        }

        System.out.println("\nBoletim ");
        for (int n = 0; n < numMateria; n++) {
            double mediaMateria = (notasP1[n] + notasP2[n] + notasTrabalho[n]) / 3.0;
            boolean aprovado = mediaMateria >= mediaAprovacao;

            System.out.println("Materia: " + nomesMateria[n]);
            
            System.out.println("Media: " + mediaMateria);
            
            
            System.out.println(aprovado ? "Aprovado" : "Reprovado");
            System.out.println();
        }

        ler.close();
    }
}