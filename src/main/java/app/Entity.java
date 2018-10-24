package app;


import lombok.Data;

@Data
public abstract class Entity {

    private long id;

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Entity))
            return false;
        final Entity other = (Entity) o;
        if (!other.canEqual(this))
            return false;
        if (this.id == 0 || other.id == 0)
            return false;
        return this.id == other.id;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.id;
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Entity;
    }
}
