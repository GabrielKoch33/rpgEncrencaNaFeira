package org.gabriel.classesMecanicas;
import java.util.HashMap;
import java.util.Map;

public class Loja {
    /**Integer: será como um índice do item, uma forma rápida de acessar o item desejado. <br>
     * Item: ao escolher um índice iremos escrever um quadro com Nome, Descrição entre outras informações úteis.
     * <br><br>
     * Como boa prática e legibilidade, iniciamos a variável como Map, depois instânciamos como HashMap**/
    private final Map<Integer, Item> estoque;
    private int ultimaChaveCriada = 1;

    public Loja() {
        this.estoque = new HashMap<>();
    }

    /** Java por debaixo dos panos converte int -> Integer dessa forma:<br>
     this.estoque.put(Integer.valueOf(this.ultimaChaveCriada), item);
     **/
    public Item adicionaItemEstoque(Item item) {
        this.estoque.put(this.ultimaChaveCriada, item);
        this.ultimaChaveCriada++;
        return item;
    }

    /**Em Sets, o método '.remove()' retorna um boolean. <br>
     * Já em Maps ou Lists, o retorno é o próprio Objeto (ou null caso a chave não exista).<br>
     * O parâmetro passado para o remove é a chave, o retorno do remove() é o valor associado.**/
    public Item removeItemEstoque(int id){
        return estoque.remove(id);
    }

    /**
     * Retorna um objeto para que métodos do inventário guardem o item
     * */
    public Item pegaItemDaLoja(int id) {
        if (!estaVazia() && contemItem(id)) {
            return estoque.get(id);
        }
        return null;
    }

    public boolean estaVazia(){
        return getEstoque().isEmpty();
    }

    public boolean contemItem(int id){
        return this.estoque.containsKey(id);
    }

    public Map<Integer, Item> getEstoque() {
        return estoque;
    }
}