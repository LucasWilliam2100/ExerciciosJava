/*5. Implemente a classe Operario como subclasse da classe Pessoa. 
 * Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
 *  valorProducao (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) 
 * e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio). 
 */
package DesafioPOO;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaComissao(double valorProducao, double comissao) {
		return (valorProducao*comissao);
	}

}
