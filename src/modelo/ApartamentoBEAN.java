package modelo;

public class ApartamentoBEAN {

    private int codigo;
    private String nome;
    private int numero;
    private int numCamaCasal;
    private int numCamaSolteiro;
    private float precoDiaria;
    private int andar;
    private boolean arCondicionado;
    private boolean ventilador;
    private boolean banheiraHidromassagem;
    private int numHospedes;
    private String tipoQuarto;
    private boolean frigobar;
    private String obs;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumCamaCasal() {
        return numCamaCasal;
    }

    public void setNumCamaCasal(int numCamaCasal) {
        this.numCamaCasal = numCamaCasal;
    }

    public int getNumCamaSolteiro() {
        return numCamaSolteiro;
    }

    public void setNumCamaSolteiro(int numCamaSolteiro) {
        this.numCamaSolteiro = numCamaSolteiro;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isVentilador() {
        return ventilador;
    }

    public void setVentilador(boolean ventilador) {
        this.ventilador = ventilador;
    }

    public boolean isBanheiraHidromassagem() {
        return banheiraHidromassagem;
    }

    public void setBanheiraHidromassagem(boolean banheiraHidromassagem) {
        this.banheiraHidromassagem = banheiraHidromassagem;
    }

    public int getNumHospedes() {
        return numHospedes;
    }

    public void setNumHospedes(int numHospedes) {
        this.numHospedes = numHospedes;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public boolean isFrigobar() {
        return frigobar;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}