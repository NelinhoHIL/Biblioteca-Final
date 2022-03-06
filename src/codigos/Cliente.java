package codigos;

public class Cliente {

    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int  cpf;
    private String situacao;
    private int senha;
    
    public Cliente( int id, String nome, String email, int telefone, int cpf, String situacao, int senha ) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.situacao = situacao;
        this.senha = senha;
    }

    public Cliente() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf( int cpf) {
        this.cpf = cpf;
    }
    
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
    
	@SuppressWarnings("unused")
	private boolean verificar_telefone(String telefone) {
        
   telefone = telefone.replaceAll("\\D","");
   

   if (!(telefone.length() >= 10 && telefone.length() <= 11)) return false;

      if (telefone.length() == 11 && Integer.parseInt(telefone.substring(2, 3)) != 9) return false;
   
   java.util.regex.Pattern p = java.util.regex.Pattern.compile(telefone.charAt(0)+"{"+telefone.length()+"}");
   java.util.regex.Matcher m = p.matcher(telefone);
   if(m.find()) return false;
      Integer[] codigosDDD = {
       11, 12, 13, 14, 15, 16, 17, 18, 19,
       21, 22, 24, 27, 28, 31, 32, 33, 34,
       35, 37, 38, 41, 42, 43, 44, 45, 46,
       47, 48, 49, 51, 53, 54, 55, 61, 62,
       64, 63, 65, 66, 67, 68, 69, 71, 73,
       74, 75, 77, 79, 81, 82, 83, 84, 85,
       86, 87, 88, 89, 91, 92, 93, 94, 95,
       96, 97, 98, 99};
      
   if ( java.util.Arrays.asList(codigosDDD).indexOf(Integer.parseInt(telefone.substring(0, 2))) == -1) return false;
       
   Integer[] prefixos = {2, 3, 4, 5, 7};
   
   if (telefone.length() == 10 && java.util.Arrays.asList(prefixos).indexOf(Integer.parseInt(telefone.substring(2, 3))) == -1) return false;

     return true;
}
	
}


