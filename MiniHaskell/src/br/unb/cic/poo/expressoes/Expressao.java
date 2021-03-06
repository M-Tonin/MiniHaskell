package br.unb.cic.poo.expressoes;

import br.unb.cic.poo.valores.Tipo;
import br.unb.cic.poo.valores.Valor;
import br.unb.cic.poo.visitor.Visitor;

/**
 * @author LSantos06
 * 
 * Uma expressao possui:
 * 		- Um tipo (Booleano ou Inteiro).
 * 		- Uma funcao que checa o tipo da expressao.
 * 		- Uma funcao que avalia a expressao.
 */
public interface Expressao {
	
	public Tipo tipo(); 
	public boolean checarTipo();
	public Valor avaliar();
	
	public void aceitar(Visitor visitor);
}
