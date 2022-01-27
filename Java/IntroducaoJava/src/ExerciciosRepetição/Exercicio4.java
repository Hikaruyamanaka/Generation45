/*


4-	Uma empresa desenvolveu uma pesquisa 
para saber as características psicológicas 
dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era 
perguntado: idade, sexo 
(1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 
2, se a pessoa era nervosa e 3, se a pessoa 
era agressiva). Pede-se para elaborar um 
sistema que permita ler os dados de 150 pessoas,
 calcule e mostre: (WHILE)

•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.



*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{

		int idade, sexo, humor, cont = 0, entradas = 2;
		int pes_cal = 0, mul_ner = 0, hom_agre = 0, out_cal = 0, pes_ner40 = 0, pes_cal18 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(cont!=entradas)
		{
			
			System.out.println("------PESQUISA Nº"+cont+"------");
			
            System.out.println("Qual a sua idade:");
            idade = leia.nextInt();
            
            System.out.println("Qual o seu sexo: \n(Digite 1 - Feminino / 2 - Masculino / 3 - Outros) ");
            sexo = leia.nextInt();
            
            System.out.println("Qual o seu humor predominante: \n(1 - Calmo(a); 2 - Nervoso(a) e 3 - Agressivo(a)");
            humor = leia.nextInt();
			
            
            if(humor==1)
            {
                pes_cal ++;
            }
            
            
            if(sexo==1 && humor==2) 
            {
                mul_ner ++;
            }
            
            
            if(sexo==2 && humor==3) 
            {
                hom_agre ++;
            }
            
            
            if(sexo==3 && humor==1) 
            {
                out_cal ++;
            }
            
            
            if(idade>40 && humor==2) 
            {
                pes_ner40 ++;
            }
            
            
            if(idade<18 && humor==1) 
            {
                pes_cal18 ++;
            }
                     
            cont++;
                          
		}
		
		 System.out.println("---------------RESULTADOS DE "+cont+" ENTRADAS -------------------");
	       
		 System.out.println("O número de pessoas calmas é "+pes_cal+ " pessoas");
	               
		 System.out.println("O número de mulheres nervosas é : "+mul_ner+ " mulheres");
	       
		 System.out.println("O número de homens agressivos é : "+hom_agre+ " homens");
	       
		 System.out.println("O número do sexo 'Outros' e calmos é : "+out_cal+ " pessoas");
	              
		 System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+pes_ner40+ " pessoas");
	       
		 System.out.println("O número de pessoas calmas com menos de 18 anos é: "+pes_cal18+ " pessoas");

		 leia.close();
			
	}
		
}