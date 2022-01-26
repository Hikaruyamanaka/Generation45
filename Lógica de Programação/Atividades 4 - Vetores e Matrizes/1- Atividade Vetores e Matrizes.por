/*



1.	Faça um programa que crie um vetor por leitura com 5 
valores de pontuação de uma atividade e o escreva em seguida. 
Encontre após a maior pontuação e a apresente. 



*/



programa
{
	
	funcao inicio()
	{	

		inteiro vet[5], x = 0, maior = 0

				
		para(x=0; x<5; x++)
		{

			escreva("Insira as suas notas: \n")
			
			leia(vet[x])
			
			escreva("\n")

		se(vet[x]>maior)
		{
			
			maior=vet[x]
			
		}

			
		}

		escreva("A sua maior nota é: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */