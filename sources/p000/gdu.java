package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: gdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdu implements Map {

    /* renamed from: a */
    public int f17982a = 0;

    /* renamed from: b */
    private final HashMap f17983b = new HashMap();

    /* renamed from: c */
    private final HashMap f17984c = new HashMap();

    /* renamed from: a */
    private final int m12999a() {
        int i = 0;
        while (this.f17983b.values().contains(Integer.valueOf(i))) {
            i++;
        }
        return i;
    }

    public final void clear() {
        this.f17984c.clear();
        this.f17983b.clear();
        this.f17982a = 0;
    }

    public final boolean containsKey(Object obj) {
        return this.f17984c.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f17984c.containsValue(obj);
    }

    public final Set entrySet() {
        return this.f17984c.entrySet();
    }

    public final Object get(Object obj) {
        return this.f17984c.get(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17983b, this.f17984c, Integer.valueOf(this.f17982a)});
    }

    public final boolean isEmpty() {
        return this.f17984c.isEmpty();
    }

    public final Set keySet() {
        return this.f17984c.keySet();
    }

    public final Object put(Object obj, Object obj2) {
        boolean containsKey = containsKey(obj);
        Object put = this.f17984c.put(obj, obj2);
        if (!containsKey) {
            this.f17983b.put(obj, Integer.valueOf(this.f17982a));
        }
        this.f17982a = m12999a();
        return put;
    }

    public final void putAll(Map map) {
        for (Object obj : map.keySet()) {
            put(obj, map.get(obj));
        }
    }

    public final Object remove(Object obj) {
        Object remove = this.f17984c.remove(obj);
        this.f17983b.remove(obj);
        this.f17982a = m12999a();
        return remove;
    }

    public final int size() {
        return this.f17984c.size();
    }

    public final Collection values() {
        return this.f17984c.values();
    }
}
