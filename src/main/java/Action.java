//Dette er et interface der køre execute. som det eneste. Man kender den her slags kode på at de kun indeholder metoder uden kode inden i,
//da metoden bliver kodet et andet sted, dette gør at man kan tilføje kode til klasser uden at skrive i mere i klassen.
public interface Action {
    void execute();
}
