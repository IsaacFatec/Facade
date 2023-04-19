import java.util.ArrayList;

public class Combo {
    
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;
    private ArrayList<Produto> itensCombo;
    
    public Combo() {
        itensCombo = new ArrayList<>();
    }
    
    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burguer = new Burguer();
                burguer.setDescricao("Combo Master - Burguer");
                burguer.setPreco("R$ 25,00");
                burguer.setGramas(200);
                
                sobremesa = new Sobremesa();
                sobremesa.setDescricao("Combo Master - Sobremesa");
                sobremesa.setPreco("R$ 8,00");
                sobremesa.setTamanho("Médio");
                
                bebida = new Bebida();
                bebida.setDescricao("Combo Master - Bebida");
                bebida.setPreco("R$ 5,00");
                bebida.setMl(350);
                
                itensCombo.add(burguer);
                itensCombo.add(sobremesa);
                itensCombo.add(bebida);
                break;
                
            case 2:
                burguer = new Burguer();
                burguer.setDescricao("Super Combo - Burguer");
                burguer.setPreco("R$ 20,00");
                burguer.setGramas(150);
                
                sobremesa = new Sobremesa();
                sobremesa.setDescricao("Super Combo - Sobremesa");
                sobremesa.setPreco("R$ 6,00");
                sobremesa.setTamanho("Pequeno");
                
                bebida = new Bebida();
                bebida.setDescricao("Super Combo - Bebida");
                bebida.setPreco("R$ 4,00");
                bebida.setMl(250);
                
                itensCombo.add(burguer);
                itensCombo.add(sobremesa);
                itensCombo.add(bebida);
                break;
                
            default:
                System.out.println("Combo inválido");
        }
    }
    
    public void MostrarItens() {
        for (Produto item : itensCombo) {
            System.out.println(item.getDescricao() + " - " + item.getPreco());
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens do Combo:\n");
        for (Produto item : itensCombo) {
            sb.append(item.getDescricao() + " - " + item.getPreco() + "\n");
        }
        return sb.toString();
    }
}
