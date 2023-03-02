public class TestStudent
{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Angel Gabriel");
        System.out.println("Nombre:"+student.getName());

        student.setLastName("Salgado Alquisira");
        System.out.println("Apellidos:"+student.getLastName());

        student.setControlNumber(Long.valueOf("22670092"));
        System.out.println("Numero de control:"+student.getControlNumber());

        student.setCareer("Ingenieria Informatica");
        System.out.println("Carrera:"+student.getCareer());

        student.setSemester(Integer.parseInt("2"));
        System.out.println("Semestre:"+student.getSemester());
        
    }
}
