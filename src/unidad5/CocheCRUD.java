package unidad5;
// Interfaz CocheCRUD
public interface CocheCRUD {
    void save();
    void findAll();
    void delete();
}
// Implementación CocheCRUDImpl
class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("save() method called");
    }@Override
    public void findAll() {
        System.out.println("findAll() method called");
    }
    @Override
    public void delete() {
        System.out.println("delete() method called");
    }
}// Clase Main
class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
