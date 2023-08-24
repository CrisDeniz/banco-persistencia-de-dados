package br.com.alura.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import br.com.alura.conta.Conta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NaoExisteConteudo extends VerificaConteudo{

	public NaoExisteConteudo(VerificaConteudo proximo) {
		super(proximo);
	}

	@Override
	public void verificar(String gson, List<Conta> contas) {

		Gson builder = new GsonBuilder().setPrettyPrinting().create();

		Path filePath = Path.of(new DataPath().getPath());

		try {

			String content = Files.readString(filePath);

			Conta[] contaArray = builder.fromJson(content, Conta[].class);

			contas.addAll(Arrays.asList(contaArray));

			String novoGson = builder.toJson(contas);

			try (FileWriter writer = new FileWriter(new DataPath().getPath())) {
				writer.write(novoGson);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public boolean deveExecutar(File arquivo) {
		return arquivo.length() > 0;
	}


}
