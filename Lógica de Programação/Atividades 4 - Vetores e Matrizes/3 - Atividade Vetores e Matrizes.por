/*



3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

a) Uma matriz M1 cujos elementos serão as somas dos elementos 
de mesma posição das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos
de mesma posição das matrizes N1 e N2.




*/





programa
{

    funcao inicio()
    {


        inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna, x=0, y=0


        para (linha = 0; linha< 4; linha ++)
        {
        	
            para (coluna = 0; coluna < 6; coluna ++)
            {
            	
                escreva("Digite um número da primeira matriz: \n")
                leia(n1[linha][coluna])
                
                x = n1[linha][coluna]
                              
         
                escreva("Digite um número da segunda matriz: \n")
                leia(n2[linha][coluna])
                
                y = n2[linha][coluna]
                
                m1[linha][coluna] = x + y
                m2[linha][coluna] = x - y
        
            }

        }
        			
        		 limpa()

        		   
        para (linha = 0; linha < 4; linha ++)
        {
        	
            para (coluna = 0; coluna < 6; coluna ++)
            {
            	
                escreva("\t" + m1[linha][coluna])
          
            }
            
            	 escreva("\n")
        
        }


        para (linha = 0; linha < 4; linha ++)
        {

            para (coluna = 0; coluna < 6; coluna ++)
            {
            
                escreva("\t" + m2[linha][coluna])
            
            }
            
            	 escreva("\n")        
        }
    
    }

} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */