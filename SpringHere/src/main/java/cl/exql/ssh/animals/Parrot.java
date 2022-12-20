package cl.exql.ssh.animals;

/**
 * The <code>Parrot</code> class simulates a Parrot
 * <p>
 * Parrots have a name.
 *
 * @author Exequiel Venegas
 * @since 2022-12-17 ssh v1.0
 *
 */
public class Parrot {

    /** The value stores parrot's name. */
    private String name;

    /** Create a parrot with no nome. */
    public Parrot() {
    }

    /** Get the parrot's name.
     *
     * @return String The name of the parrot.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the parrot's name.
     * @param name This value set a name for the parrot.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " +
                "name='" + name + '\'' +
                '}';
    }
}
