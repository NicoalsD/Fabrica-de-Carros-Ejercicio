package FabricaCarros;

public class Chasis {
    private float peso;
    private MaterialChasis material;

    public Chasis(float peso, MaterialChasis material) {
        this.peso = peso;
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public MaterialChasis getMaterial() {
        return material;
    }

    public void setMaterial(MaterialChasis material) {
        this.material = material;
    }

    @Override
    public String toString(){
        return "Chasis{peso= "+this.peso+", MaterialChasis= "+this.material+"}";
    }
}