package au.com.mineauz.minigames.script;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class ScriptCollection implements ScriptReference {
	public abstract ScriptReference getValue(String key) throws IllegalArgumentException, NoSuchElementException;
	public abstract Collection<String> getKeys();
	
	public static <E extends ScriptReference> ScriptCollection of(Collection<E> collection) {
		return new ScriptCollectionImpl<E>(collection);
	}
	
	public static <E extends ScriptReference> ScriptCollection of(Map<String, E> map) {
		return new ScriptCollectionMapImpl<E>(map);
	}
}
