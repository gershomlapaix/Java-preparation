package DDDAbolish;

/**
 * Interfaces rescues us from Deadly Diamond of Death.
 *
 * Deadly diamond of death happens when a class is inheriting from more than one classes
 * with some similar methods. Thus, at runtime, the class does not know which proper method
 * to call.
 * */
public interface Pet {
    public abstract void beFriendly();
    public abstract void play();
}
