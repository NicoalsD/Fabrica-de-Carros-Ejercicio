import java.util.ArrayList;
import java.util.List;

public class Planta {
    private float tamañoLlanta;
    private TipoLlanta tipoLlanta;
    private float pesoChasis;
    private MaterialChasis materialChasis;
    private Colores colores;

    public Planta(float tamañoLlanta, TipoLlanta tipoLlanta, float pesoChasis, MaterialChasis materialChasis, Colores colores) {
        this.tipoLlanta = tipoLlanta;
        this.tamañoLlanta = tamañoLlanta;
        this.materialChasis = materialChasis;
        this.pesoChasis = pesoChasis;
        this.colores = colores;
    }

    public Carro fabricar() {
        List<Llanta> nuevasLlantas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            nuevasLlantas.add(new Llanta(this.tamañoLlanta, this.tipoLlanta));
        }
        Chasis nuevoChasis = new Chasis(this.pesoChasis, this.materialChasis);
        return new Carro(this.colores, nuevoChasis, nuevasLlantas);
    }

    public float getTamañoLlanta() {
        return tamañoLlanta;
    }

    public void setTamañoLlanta(float tamañoLlanta) {
        this.tamañoLlanta = tamañoLlanta;
    }

    public TipoLlanta getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(TipoLlanta tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public float getPesoChasis() {
        return pesoChasis;
    }

    public void setPesoChasis(float pesoChasis) {
        this.pesoChasis = pesoChasis;
    }

    public MaterialChasis getMaterialChasis() {
        return materialChasis;
    }

    public void setMaterialChasis(MaterialChasis materialChasis) {
        this.materialChasis = materialChasis;
    }

    public Colores getColores() {
        return colores;
    }

    public void setColores(Colores colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return "Planta{tamañoLlanta=" + tamañoLlanta + ", tipoLlanta=" + tipoLlanta + ", pesoChasis=" + pesoChasis + ", materialChasis=" + materialChasis + ", colores=" + colores + '}';
    }
}
