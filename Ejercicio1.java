import java.util.Scanner;

public class Persona {
    private String nombre;
    private String correo;
    private String telefono;

    public Persona(String nombre, String correo, String telefono) {
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Empleo extends Persona {
    private String numEmpleado;
    private double sueldo;

    public Empleo(String nombre, String numEmpleado, String correo, String telefono, double sueldo) {
        super(nombre, correo, telefono);
        setNumEmpleado(numEmpleado);
        setSueldo(sueldo);
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}

public class Alumno extends Persona {
    private String matricula;
    private double promedio;

    public Alumno(String nombre, String matricula, String correo, String telefono, double promedio) {
        super(nombre, correo, telefono);
        setMatricula(matricula);
        setPromedio(promedio);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}

public class Ejercicio1 {
    public static class capturaEntrada {
        public static int capturarEntero(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg + ": ");
            return sc.nextInt();
        }

        public static double capturarDoble(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg + ": ");
            return sc.nextDouble();
        }

        public static String capturarCadena(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg + ": ");
            return sc.nextLine();
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\nIngresar datos (alumno)");
        Alumno al1 = new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de matricula"), capturaEntrada.capturarCadena("Introduce correo"), capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
        System.out.println();
        System.out.println("\n\nIngresar datos (empleo)");
        Empleo em1 = new Empleo(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de empleado"), capturaEntrada.capturarCadena("Introduce correo"), capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce sueldo"));
        System.out.println();

        // Imprimir datos de alumno
        System.out.println("\n\n Datos del alumno");
        System.out.println("Nombre:" + al1.getNombre());
        System.out.println("Matricula:" + al1.getMatricula());
        System.out.println("Correo:" + al1.getCorreo());
        System.out.println("Telefono:" + al1.getTelefono());
        System.out.println("Promedio:" + al1.getPromedio());

        // Imprimir datos de Empleado
        System.out.println("\nDatos de empleado");
        System.out.println("Nombre empleado: " + em1.getNombre());
        System.out.println("Num. de empleado: " + em1.getNumEmpleado()); // Corregido el método
        System.out.println("Correo: " + em1.getCorreo());
        System.out.println("Sueldo: " + em1.getSueldo());
    }
}
