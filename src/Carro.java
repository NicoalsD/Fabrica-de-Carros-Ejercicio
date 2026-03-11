import java.util.List;

public class Carro {
    private Colores color;
    private Chasis chasis;
    private List<Llanta> llantas;

    public Carro(Colores color, Chasis chasis, List<Llanta> llantas) {
        this.color = color;
        this.chasis = chasis;
        this.llantas = llantas;
    }

    public Colores getColor() {
        return this.color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Chasis getChasis() {
        return this.chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public List<Llanta> getLlantas() {
        return this.llantas;
    }

    public void setLlantas(List<Llanta> llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Carro{color= "+this.color+", chasis= "+this.chasis+", llantas= "+this.llantas+"}";
    }
}
