/*





2) Elabore um sistema que leia as variáveis C e N, respectivamente 
código e número de horas trabalhadas de um operário. E calcule o salário sabendo-se 
que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento 
imprimir o salário total e o salário excedente.



*/



programa
{
	
	funcao inicio()
	{
		
		real horas, salario, salario_inicial, salario_extra

		
		escreva("Digite a quantidade de horas que você trabalhou?\n")
		leia(horas)


		se (horas>50)

		{
		    salario_extra=(horas-50)*20
		    
		    salario=50.00*10.00
		    
		    salario_inicial = salario_extra + salario

		    escreva("\nO salário é de R$ ", salario_inicial)
		
		}


		senao 
		
		{
			salario=horas*10.00

			escreva("O salário é de R$ ", salario)
		}


	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */