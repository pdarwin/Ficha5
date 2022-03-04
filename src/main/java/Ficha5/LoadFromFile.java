package Ficha5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class LoadFromFile {
	
	public List<Pessoa> obterInformacaoFicheiro(String fileName)
	{
		
		return convertStringToPessoa(
				getFileContent(
						getFileAsIOStream(fileName)));
		
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
	
	private String getFileContent(InputStream is)
	{
		InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
		
        String line;
        String fileContents = "";
        try {
			while ((line = br.readLine()) != null) {
			    fileContents += line;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return fileContents;
	}
	
	private List<Pessoa> convertStringToPessoa(String fileContents)
	{
		JSONArray jArray = new JSONArray(fileContents);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for (int i = 0; i < jArray.length() ; i++)
		{
			Pessoa pessoa = new Pessoa(
						jArray.getJSONObject(i).getString("Primeiro_nome"),
						jArray.getJSONObject(i).getString("Ultimo_nome"), 
						jArray.getJSONObject(i).getInt("Idade"));
			pessoas.add(pessoa);
			
		}
		
		return pessoas;
			
	}

	
}
