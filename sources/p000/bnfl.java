package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bnfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfl extends bnfj implements List {
    protected bnfl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List mo9242a();

    public final void add(int i, Object obj) {
        mo9242a().add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        return mo9242a().addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo9243b() {
        throw null;
    }

    public boolean equals(Object obj) {
        return obj == this || mo9242a().equals(obj);
    }

    public final Object get(int i) {
        return mo9242a().get(i);
    }

    public int hashCode() {
        return mo9242a().hashCode();
    }

    public final int indexOf(Object obj) {
        return mo9242a().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return mo9242a().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        return mo9242a().listIterator();
    }

    public final Object remove(int i) {
        return mo9242a().remove(i);
    }

    public final Object set(int i, Object obj) {
        return mo9242a().set(i, obj);
    }

    public final List subList(int i, int i2) {
        return mo9242a().subList(i, i2);
    }

    public final ListIterator listIterator(int i) {
        return mo9242a().listIterator(i);
    }
}
