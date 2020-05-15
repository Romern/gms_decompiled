package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfj extends bnfo implements Collection {
    protected bnfj() {
    }

    public boolean add(Object obj) {
        return mo9243b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return mo9243b().addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Collection mo9243b();

    public final void clear() {
        mo9243b().clear();
    }

    public boolean contains(Object obj) {
        return mo9243b().contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return mo9243b().containsAll(collection);
    }

    public final boolean isEmpty() {
        return mo9243b().isEmpty();
    }

    public final Iterator iterator() {
        return mo9243b().iterator();
    }

    public boolean remove(Object obj) {
        return mo9243b().remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return mo9243b().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return mo9243b().retainAll(collection);
    }

    public final int size() {
        return mo9243b().size();
    }

    public final Object[] toArray() {
        return mo9243b().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return mo9243b().toArray(objArr);
    }
}
