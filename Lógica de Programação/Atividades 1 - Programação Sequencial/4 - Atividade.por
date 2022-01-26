/*

	4. Escreva um sistema que leia três números inteiros e positivos
	(A, B, C) e
	calcule a seguinte expressão:
        
   D = R + S		     R = (A + 2)²
   	    2    , onde     S = (B + C)²


 */

programa
{
	inclua biblioteca Matematica -->mat
	
	
	funcao inicio()
	{
		inteiro A, B, C, D, R, S
		real pot1, pot2

		escreva("Insira o primeiro número ")
		leia(A)
				
		escreva("\nInsira o segundo número ")
		leia(B)

		escreva("\nInsira o terceiro número ")
		leia(C)

		pot1=mat.potencia(R=A+2, 2)
		pot2=mat.potencia(S=B+C, 2)

		escreva("\nResultado de R: ", R=pot1)
		
		escreva("\nResultado de S: ", S=pot2)
		
		
		escreva("\nResultado de D é: ",R+S/2)

		

 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 678; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */