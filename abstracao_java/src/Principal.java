public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setAutor("Machado");
        livro.setExemplares(3);
        livro.setTitulo("Memórias de Brás Cubas.");
        System.out.print(livro.getAutor());
        System.out.println("\n"+livro.getTitulo());
    }
}
