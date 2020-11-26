package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void ValorAlterado(String novoValor);
}
