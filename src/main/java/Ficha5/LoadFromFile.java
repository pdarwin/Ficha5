package Ficha5;

import java.io.File;
import java.io.InputStream;

public class LoadFromFile {

	public void obterInformacaoFicheiro(String fileName)
	{
		getFileAsIOStream(fileName);
		
	}
	
	private InputStream getFileAsIOStream(String fileName)
	{
		//String basePath = new File("").getAbsolutePath(); // Vai buscar o caminho relativo da pasta
		
		InputStream ioStream = this.getClass()
		        .getClassLoader()
		        .getResourceAsStream(fileName);
		    
		    if (ioStream == null) {
		        throw new IllegalArgumentException(fileName + " is not found");
		    }
		    return ioStream;
	}
	
	private void getFileContent()
	{
		
	}
	
	private void convertStringToPessoa()
	{
		
	}
	
}
