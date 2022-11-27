package entidades;
/**
 * @author User
 * @version 1.0
 * @created 17-nov.-2022 8:38:36
 */
public class Libro {

	private String isbn;
	private String title;
	private int editionNumber;
	private String copyright;
	public Autor m_Autor;

	public Libro(){

	}

	public void finalize() throws Throwable {

	}
}//end Libro