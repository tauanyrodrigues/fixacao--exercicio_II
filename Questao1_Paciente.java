public class Questao1_Paciente {

    private int codigo;
    private String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    public Questao1_Paciente( int codigo, String nome, String dataNascimento, String sexo, String alergia, String saude, String tipoSanguineo){

        this.codigo = codigo;
        this.planoSaude = saude;
        this.alergia = alergia;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;

    }

    public int getCodigo(){

        return this.codigo;

    }
    public void setCodigo(int cod){

        this.codigo = cod;

    }

    public String getNome (){

        return this.nome;

    }
    public void setNome (String nome) {

        this.nome = nome;

    }

    public String getDataNascimento (){

        return this.dataNascimento;

    }
    public void setDataNascimento (String data) {

        this.dataNascimento = data;

    }

    public String getSexo (){

        return this.dataNascimento;

    }
    public void setSexo (String sexo) {

        this.sexo = sexo;

    }

    public String getPlanoSaude (){

        return this.planoSaude;

    }
    public void setPlanoSaude(String plano){

        this.planoSaude = plano;

    }

    public String getAlergia (){

        return this.alergia;

    }
    public void setAlergia (String alergia) {

        this.alergia = alergia;

    }

    public String getTipoSanguineo (){

        return this.tipoSanguineo;

    }
    public void setTipoSanguineo (String letra) {

        this.tipoSanguineo = letra;

    }

}
