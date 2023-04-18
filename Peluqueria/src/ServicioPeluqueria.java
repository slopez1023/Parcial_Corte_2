public enum ServicioPeluqueria {
    CORTE("Degradada","Más degradada más volumen pero menos densidad",55000,"La peluquera especialista en degradado se encargará de su corte, en el que cortará el cabello con diferentes longitudes de forma progresiva, y más o menos marcada, para dar volumen y movimiento a la melena"),
    UNAS("Acrílicas","Uñas detamaño largo,proporcionan una capa protectora dura y resistente",88500,"Nuestro especialista  realizará una mezcla de polvo acrílico (polímero) y un agente líquido (monómero), que al combinarse, forman una pasta que se aplica sobre la uña natural con la ayuda de un molde o un tip"),
    TINTE("Coloración permanente","El color aparece en la primera aplicación. Suele provocar una decoloración del color natural del cabello y una tinción artificial que ocurren simultáneamente.",25000,"Nuestro especialista, utilizará siempre guantes para proceder a tintar tu cabello. Lo separará en mechones y teñirá por secciones. Se enfocará en las raíces para que el color penetre intensamente.");

    private String Nombre;
    private String Descripcion;
    private int precio;
    private String DescripcionServicio;

    ServicioPeluqueria(String Nombre, String Descripcion, int precio, String DescripcionServicio){
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.DescripcionServicio = DescripcionServicio;
    }
    public String getNombre(){return Nombre;}
    public String getDescripcion(){return Descripcion;}
    public int getPrecio(){return precio;}
    public String getDescripcionServicio(){return DescripcionServicio;}

    public static void main(String[] args) {
        ServicioPeluqueria servicioPeluqueria = ServicioPeluqueria.CORTE;
        System.out.println("El corte que eligió es: " + servicioPeluqueria.getNombre() + " La descripción del corte: " + servicioPeluqueria.getDescripcion() + " El precio del corte es de: " + servicioPeluqueria.getPrecio() + " La descripción de nuestro servicio: " + servicioPeluqueria.getDescripcionServicio());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        servicioPeluqueria = ServicioPeluqueria.UNAS;
        System.out.println("Las uñas que eligió son: " + servicioPeluqueria.getNombre() + " La descripción de las uñas: " + servicioPeluqueria.getDescripcion() + " El precio de las uñas son: " + servicioPeluqueria.getPrecio() + " La descripción de nuestro servicio: " + servicioPeluqueria.getDescripcionServicio());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        servicioPeluqueria = ServicioPeluqueria.TINTE;
        System.out.println("El tinte que eligió es: " + servicioPeluqueria.getNombre() + " La descripción del tinte: " + servicioPeluqueria.getDescripcion() + " El precio del tinte es de: " + servicioPeluqueria.getPrecio() + " La descripción de nuestro servicio: " + servicioPeluqueria.getDescripcionServicio());
    }

}
