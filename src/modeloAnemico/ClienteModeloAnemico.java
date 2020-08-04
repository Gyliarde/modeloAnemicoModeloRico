package modeloAnemico;


public class ClienteModeloAnemico {

    public static void main(String[] args) {
        // Homenagem a miha cachorra
        Cao pacoca = new Cao("Ouro","Golden");

        ServiceCao serviceCao = new ServiceCao();
        serviceCao.servicoAndar(pacoca);
        serviceCao.servicoLatir(pacoca);
        serviceCao.servicoMorderSandalia(pacoca);
        serviceCao.servicoMorderSandalia(pacoca);
        serviceCao.servicoMorderSandalia(pacoca);
    }
}
