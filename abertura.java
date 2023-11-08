import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    String entra, equipamento, info2, disponibilidade, infoCusto, infoPrazo, dispCliente, nome,causa;
    int TipoEquipamento,info, contato, plano, custoPrazo, causaChamado;
    infoCusto =" ";
    infoPrazo = " ";
    equipamento = " ";
    info2 = " ";
    causa = " ";
    entra = JOptionPane.showInputDialog("Informe qual equipamento do cliente \n 1.HG6143D \n 2.HG6245D \n 3.F4G \n 4.HG6145F \n 5.B7G \n 6.Outrou?");
    TipoEquipamento = Integer.parseInt(entra);
    switch(TipoEquipamento){
      case 1:
        equipamento ="HG6143D";
        break;
      case 2:
        equipamento ="HG6245D";
        break;
        case 3:
          equipamento ="F4G";
          break;
        case 4:
          equipamento ="HG6145F";
          break;
        case 5:
          equipamento ="B7G";
          break;
        case 6:
          equipamento = JOptionPane.showInputDialog("Qual seria o modelo não listado");
          break;
  }
    entra = JOptionPane.showInputDialog("Qual motivo do chamado? \n 1.Sem acesso/Sinal alto \n 2. Instrutivo \n 3.Troca de local fibra/ONU  \n 4.Rompimento externo \n 5.Cabeamento \n 6.Segundo Ponto");
    causaChamado = Integer.parseInt(entra);
    switch(causaChamado){
      case 1:
        causa = "Sem Acesso / Sinal Alto";
        break;
        case 2:
        causa = "Instrutivo";
        break;
        case 3:
        causa = "Troca de local fibra / ONU";
        break;
        case 4:
        causa = "Rompimento Externo";
        break;
        case 5:
        causa = "Cabeamento";
        break;
        case 6:
        causa = "Segundo Ponto";
        break;
    }
    entra = JOptionPane.showInputDialog("Qual Plano do cliente? \n 1.Prime \n 2.Premium \n 3.Max \n 4.Master \n 5.Home \n 6.Plus \n 7.Só internet");
    plano = Integer.parseInt(entra);
    entra = JOptionPane.showInputDialog("Existe mais alguma informação relevante sobre o chamado? \n 1.Sim \n 2.Não");
    info = Integer.parseInt(entra);
    if(info == 1){
      entra = JOptionPane.showInputDialog("Qual seria a informação extra?");
      info2= entra;
    }
    entra = JOptionPane.showInputDialog("Foi informado o prazo e custo para o cliente? \n 1.Sim \n 2.Não \n");
    custoPrazo = Integer.parseInt(entra);
    entra = JOptionPane.showInputDialog("Qual número para contato do cliente?");
    contato = Integer.parseInt(entra);
    entra = JOptionPane.showInputDialog("Qual nome do contato do cliente?");
    nome = entra;
    entra = JOptionPane.showInputDialog("Qual disponibilidade do cliente?");
        disponibilidade = entra;
    //RESULTADOS DAS PERGUNTAS
    if(causaChamado !=4){
    switch(plano){
      case 1 :
        infoCusto = "Ciente do custo dos materias";
        break;
      case 2 :
        infoCusto = "Ciente do custo dos materias";
        break;
        case 3: case 4: case 5: case 6 : 
          infoCusto= "Cliente ciente do custo do chamado/materiais";
        break;
    }
    }
  if(causaChamado==1 || causaChamado ==4){
    infoPrazo ="48 horas";
}
    else{
      infoPrazo ="10 dias";
    }
    if(info == 1 && custoPrazo ==1 ){
      System.out.println("-----------Técnico----------- \n"+equipamento+"\n"+causa+"\n"+info2+"\n"+infoCusto+" e do prazo de "+infoPrazo+"\n \n-----------AGENDA-----------\n"+nome+":"+contato+"\n"+disponibilidade);
    }
    else if(info == 1 && custoPrazo ==2 ){
      System.out.println("-----------Técnico----------- \n"+equipamento+"\n"+causa+"\n"+info2+"\n \n-----------AGENDA-----------\n"+nome+":"+contato+"\n"+disponibilidade);
    }
    else if(info == 2 && custoPrazo ==1 ){
      System.out.println("-----------Técnico----------- \n"+equipamento+"\n"+causa+"\n"+infoCusto+" e do prazo de "+infoPrazo+"\n \n-----------AGENDA-----------\n"+nome+":"+contato+"\n"+disponibilidade);
    }
    else if(info == 2 && custoPrazo ==2){
      System.out.println("-----------Técnico----------- \n"+equipamento+"\n"+causa+"\n \n-----------AGENDA-----------\n"+nome+":"+contato+"\n"+disponibilidade);
    }
}
}
