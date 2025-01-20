public class UsuarioSistema implements Autentica,Autorizar{
    private String usuario;
    private String senha;
    private String[] permissoes;

    public UsuarioSistema(String usuario,String senha, String[] permissoes){
        this.usuario = usuario;
        this.senha = senha;
        this.permissoes = permissoes;
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    @Override
    public boolean verificarPermissao(String acao) {
        for(String permissao : permissoes){
            if(permissao.equals(acao)){
                return true;
            }
        }
        return false;
    }
}
