package com.jaybee291998.loxl

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.uitl.List;

public class Lox {
	public static void main(String[] args) {
		if (args.length > 1) {
			System.out.println("Usage: jlox [script]");
			System.exit(64);
		} else if (args.length == 1) {
			runFile(args[0]);
		} else {
			runPrompt();
		}
	}

	public static void runPrompt(String path) throws IOException {
		byte[] bytes = Files.readAllBytes(Path.get(path));
		return (new String(bytes, Charset.defaultCharset()));
	}

	public static void runPrompt() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);

		for(;;) {
			System.out.print("> ");
			String line = reader.readLine();
			if (line == null) break;
			run(line);	
		}
	}
}
