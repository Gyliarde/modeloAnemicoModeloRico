package modeloAnemico;


public class ClienteModeloAnemico {

    public static void main(String[] args) {
        // Homenagem a miha cachorra
        Cao pacoca = new Cao("Ouro","Golden");

        ServiceCao serviceCao = new ServiceCao();
        serviceCao.andar(pacoca);
        serviceCao.latir(pacoca);
        serviceCao.morderSandalia(pacoca);
        serviceCao.morderSandalia(pacoca);
        serviceCao.morderSandalia(pacoca);
    }
}
