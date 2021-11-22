/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Alfre
 */
public class chunks {
    
    public static String[] generarchunk(int cantidad) {
		String[] chunks = new String[cantidad];

		String[] chunk = { "0", "1", "2", "3", "4", "5", "6", "7",
				"8", "9", "10", "11", "12", "13", "14", "15", "16",
				"Caritina", "Carlota", "Baltazar"};
		String[] direccion = { "GFS/Master/c1", "GFS/Master/c2", "GFS/Master/c3", "GFS/Master/c4", "GFS/Master/c4", "GFS/Master/c5", "GFS/Master/c6", "GFS/Master/c7",
				"GFS/Master/c8", "GFS/Master/c9", "GFS/Master/c10", "GFS/Master/c11", "GFS/Master/c12", "GFS/Master/c13", "GFS/Master/c14", "GFS/Master/c15", "GFS/Master/c16",
				"GFS/Master/c17" };

		for (int i = 0; i < cantidad; i++) {
			chunks[i] = chunk[(int) (Math.floor(Math.random() * ((chunk.length - 1) - 0 + 1) + 0))] + " "
					+ direccion[(int) (Math.floor(Math.random() * ((direccion.length - 1) - 0 + 1) + 0))];
		}
		return chunks;
	}

	/**
	 * Imprime un arreglo de String
	 * 
	 * @param chunks
	 *            arreglo con los nombres generados
	 */
	public static void imprimir(String[] chunks) {
		for (int i = 0; i < chunks.length; i++) {
			System.out.println(chunks[i]);
		}
	}

	public static void main(String[] args) {
		imprimir(generarchunk(200));
	}
}

