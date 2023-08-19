package br.com.alura.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NaoExisteConteudo extends VerificaConteudo{

	public NaoExisteConteudo(VerificaConteudo proximo) {
		super(proximo);
	}

	@Override
	public void verificar(String gson, List<Conta> contas) {
		
		Gson builder = new GsonBuilder().setPrettyPrinting().create();
		
		Path filePath = Path.of("C:\\Users\\Cristian\\eclipse-projetos-pessoais\\banco\\src\\main\\resources\\data.json");
		
		try {	
			
			String content = Files.readString(filePath);

			Conta[] contaArray = builder.fromJson(content, Conta[].class); 
			
			for (Conta conta : contaArray) {
				contas.add(conta);
			}
			
			String newGson = builder.toJson(contas);
			
			try (FileWriter writer = new FileWriter("C:\\Users\\Cristian\\eclipse-projetos-pessoais\\banco\\src\\main\\resources\\data.json")) {
				writer.write(newGson);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean deveExecutar(File arquivo) {
		return arquivo.length() > 0;
	}


}
