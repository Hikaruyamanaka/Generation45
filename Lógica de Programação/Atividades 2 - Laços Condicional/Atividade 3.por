/*


  3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, 
imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.


*/



programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		inteiro n1, n2, n3, n4, mat
				
		escreva("Digite o primeiro número: \n")
		leia(n1)

		escreva("\nDigite o segundo número: \n")
		leia(n2)

		escreva("\nDigite o terceiro número: \n")
		leia(n3)

		escreva("\nDigite o quarto número: \n")
		leia(n4)


		n1=mat.potencia(n1, 2)
		n2=mat.potencia(n2, 2)
		n3=mat.potencia(n3, 2)
		n4=mat.potencia(n4, 2)

		se (n3>=1000)
		{
			escreva("\nO resultado é: \n",n3)
		}

		senao
		{
			escreva("\nEste número está incorreto. \n", n1)
			
			escreva("\nEste número está incorreto. \n", n2)
			
			escreva("\nEste número está incorreto. \n", n3)
			
			escreva("\nEste número está incorreto. \n", n4)
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */