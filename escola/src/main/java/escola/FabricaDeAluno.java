package escola;

public class FabricaDeAluno {
	
	private Aluno aluno;
	
	public FabricaDeAluno criarAluno(String cpf, String nome, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}

}
