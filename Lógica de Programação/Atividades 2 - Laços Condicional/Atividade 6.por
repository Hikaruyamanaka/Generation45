/*



6) Elabore um sistema que dada a idade de um nadador classifique-o
em uma das seguintes + categorias:

Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos



*/


programa
{
	
	funcao inicio()
	{

		inteiro idade
		
		escreva("Digite a sua idade: \n")
		leia(idade)

		se (idade >=5 e idade<=7)
		
		{
			escreva("\nVocê é do Infantil A.\n")
		}

		
		senao se (idade >=8 e idade<=11)
		
		{
			escreva("\nVocê é do Infantil B.\n")
		}
		

		senao se (idade >=12 e idade <=13)
		
		{
			escreva("\nVocê é do Juvenil A.\n")
		}


		senao se (idade >=14 e idade <=17)
		
		{
			escreva("\nVocê é do Juvenil B.\n")
		}


		senao
			
			escreva("\nVocê é da categoria Adultos.")
		

			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */