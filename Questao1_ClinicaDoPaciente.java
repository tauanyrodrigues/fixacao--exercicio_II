public class Questao1_ClinicaDoPaciente {

    public static void main(String[] args){

        Questao1_Paciente paci_1 = new Questao1_Paciente( 89, "Karlla Tauany da Silva Rodrigues", "19/05/2004", "Feminina", "Abelha", "Plus ultra", "AB+");
        System.out.println("\n\nCodigo: "+paci_1.getCodigo());
        System.out.println("Nome: "+ paci_1.getNome());
        System.out.println("Sexo: "+ paci_1.getSexo());
        System.out.println("Data de Nascimento: "+ paci_1.getDataNascimento());
        System.out.println("Tipo Sanguíneo: "+ paci_1.getTipoSanguineo());
        System.out.println("Plano de saude: "+ paci_1.getPlanoSaude());
        System.out.println("Alergia: "+ paci_1.getAlergia());

        paci_1.setNome("Carla Cássia Correia da Silva Rodrigues");
        paci_1.setDataNascimento("22/12/1985");
        paci_1.setSexo("Feminino");
        paci_1.setAlergia("Abelha");
        paci_1.setPlanoSaude("Plus ultra");
        paci_1.setTipoSanguineo("AB-");
        paci_1.setCodigo(90);

        System.out.println("\n\nCodigo: "+paci_1.getCodigo());
        System.out.println("Nome: "+ paci_1.getNome());
        System.out.println("Sexo: "+ paci_1.getSexo());
        System.out.println("Data de Nascimento: "+ paci_1.getDataNascimento());
        System.out.println("Tipo Sanguíneo: "+ paci_1.getTipoSanguineo());
        System.out.println("Plano de saude: "+ paci_1.getPlanoSaude());
        System.out.println("Alergia: "+ paci_1.getAlergia());

    }

}
