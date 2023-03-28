package personExemplo;

/* Definindo os atributos como "private": Isso significa que qualquer outra classe
só pode chamar getUserName ou isSamePerson e parecerá que esses são os únicos 2 métodos
fornecidos pela classe Person

Métodos de ações - público (recomendado)
Métodos auxiliares - privado (recomendado)
 */
public class Person {
    private String userName;
    private String SSN;
    private String getId() {
        return SSN + "-" + userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isSamePerson(Person p) {
        if (p.getId().equals(this.getId())){
            return true;
        } else {
            return false;
        }
    }
}
