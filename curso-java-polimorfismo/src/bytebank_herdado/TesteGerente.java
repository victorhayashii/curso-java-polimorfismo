package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		
		g1.setNome("Pedro");
		g1.setCpf("0000000");
		g1.setSalario(5000.0);
		g1.setSenha(123);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.autentica(123));
		System.out.println(g1.getBonificacao());
	}

}
