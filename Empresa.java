
public class Empresa {
	public static void main(String[] args) {
		Empregado func1;
		Empregado func2;
		Empregado func3;

		func1 = new Empregado();
		func2 = new Empregado();
		func3 = new Empregado();

		func1.nome = "Alex";
		func1.cargo = "Analista";
		func1.salario = 2000.90;

		func2.nome = "Maria";
		func2.cargo = "Analista 2";
		func2.salario = 3000.90;

		func3.nome = "Jos?";
		func3.cargo = "Cozinheiro";
		func3.salario = 1500.90;
		
		System.out.println("Dado(s) do(s) empregado(s): ");
		System.out.println("");
		
		func1.imprimir();
		func1.aumentarSalario(8);
		func2.imprimir();
		func2.aumentarSalario(8);
		func3.imprimir();
		func3.aumentarSalario(8);

	}

}
