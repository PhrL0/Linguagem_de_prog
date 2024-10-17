public class TesteUsuarioSistem {
    public static void main(String[] args) {
        UsuarioSistema sys = new UsuarioSistema("Pedro","jhulia123", new String[]{"amar"});

        System.out.println(sys.autenticar("Pedro","jhulia123"));
        System.out.println(sys.verificarPermissao("amar"));



    }
}
