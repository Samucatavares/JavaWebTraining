package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();

	public static void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
	
	return Banco.lista;
	
}


}