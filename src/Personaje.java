public class Personaje {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;


    public Personaje(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Tu nombre de personaje es" + this.getNombre());
        System.out.println("Tu nivel actual es:" + this.getNivel());
        System.out.println("Tu cantidad  de experencia acumulada es:" + this.getExperiencia());
        System.out.println("Tu vida actual es:" + this.getVida());
        System.out.println("Tu estado  actual es:" + this.isVivo());
    }
    public String name(double nomb){
        return name(nombre = nomb);
    }
    public int nivel(double n1) {
        return nivel(nivel = n1);
    }
    public double ganarexp(int experiencia){
        if(this.experiencia >= experiencia){
            return 60+10;

        }else{
            return experiencia;

        }
        public boolean estadot(){
            return (this.vivo);
        }
        public void asignarestado(boolean v1){
            this.vivo = v1;
        }
        public int ganarexperiencia(int exp){


        }
        public void   estadodelP(boolean v1){
            if(this.vivo);{
                return "VIVO";
            }else{
                return "Estas muerto";


            }




    }




