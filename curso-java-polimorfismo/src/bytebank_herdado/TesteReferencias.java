package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setSalario(5000.00);

		EditorVideo e = new EditorVideo();
		e.setSalario(5000.00);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);
		System.out.println(controle.getSoma());
	}

}
