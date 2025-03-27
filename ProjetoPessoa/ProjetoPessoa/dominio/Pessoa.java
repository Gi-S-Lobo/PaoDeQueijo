package dominio;

import java.text.DecimalFormat;

public class Pessoa {
	   DecimalFormat df = new DecimalFormat("#.00");
	   private int id;
	   private String nome;
	   private int idade;
	   private double peso;
	   private double altura;
	   
	   public Pessoa(int id, String nome, int idade, double peso, double altura) {
	       super();
	       this.id = id;
	       this.nome = nome;
	       this.idade = idade;
	       this.peso = peso;
	       this.altura = altura;
	   }

	   public int getId() {
	       return id;
	   }

	   public void setId(int id) {
	       this.id = id;
	   }

	   public String getNome() {
	       return nome;
	   }

	   public void setNome(String nome) {
	       this.nome = nome;
	   }

	   public int getIdade() {
	       return idade;
	   }

	   public void setIdade(int idade) {
	       this.idade = idade;
	   }

	   public double getPeso() {
	       return peso;
	   }

	   public void setPeso(double peso) {
	       this.peso = peso;
	   }

	   public double getAltura() {
	       return altura;
	   }

	   public void setAltura(double altura) {
	       this.altura = altura;
	   }
	   
	   public void listarPessoa() {
	       System.out.println("\n"+id);
	       System.out.println(nome);
	       System.out.println(idade);
	       System.out.println(peso);
	       System.out.println(altura);
	   }
	   
	   public void calcularIMC() {
		   
		   double imc = peso / (altura*altura);
		   String classificacao;
		   
		   System.out.println("O IMC da pessoa é " + df.format(imc));
		   
		   if (imc < 18.5) {
	            classificacao = "Abaixo do peso";
	        } 
	        else if (imc < 25) {
	            classificacao = "Peso normal";
	        } 
	        else if (imc < 30) {
	            classificacao = "Sobrepeso";
	        } 
	        else if (imc < 35) {
	            classificacao = "Obesidade grau I";
	        } 
	        else if (imc < 40) {
	            classificacao = "Obesidade grau II";
	        } 
	        else {
	            classificacao = "Obesidade grau III (mórbida)";
	        }
		   System.out.print(classificacao);
	   }
	}