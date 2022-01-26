/*

	
	5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.


 */

programa
{
	
	funcao inicio()
	{	
		
		
		
		real n1, n2, n3, p1=2, p2=3, p3=5, media_final

		escreva("Programa para ler 3 notas e calcular a media final\n")

		escreva("\nDigite a primeira nota: \n")
		leia(n1)

		escreva("\nDigite a segunda nota: \n")
		leia(n2)

		escreva("\nDigite a terceira nota: \n")
		leia(n3)

		media_final = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3)

		escreva("A média final deste aluno será: \n",media_final)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */