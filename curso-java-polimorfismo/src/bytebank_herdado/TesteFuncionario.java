package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Gerente();
		
		funcionario1.setNome("Nico");
		funcionario1.setCpf("111-111-111-11");
		funcionario1.setSalario(1000.00);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getBonificacao());

	}

}
