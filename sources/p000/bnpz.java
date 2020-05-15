package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bnpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnpz extends bnpy implements List {
    private static final long serialVersionUID = 0;

    public final void add(int i, Object obj) {
        synchronized (this.f131984g) {
            mo68281a().add(i, obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        boolean addAll;
        synchronized (this.f131984g) {
            addAll = mo68281a().addAll(i, collection);
        }
        return addAll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo68281a() {
        return (List) super.mo68281a();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f131984g) {
            equals = mo68281a().equals(obj);
        }
        return equals;
    }

    public final Object get(int i) {
        Object obj;
        synchronized (this.f131984g) {
            obj = mo68281a().get(i);
        }
        return obj;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f131984g) {
            hashCode = mo68281a().hashCode();
        }
        return hashCode;
    }

    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f131984g) {
            indexOf = mo68281a().indexOf(obj);
        }
        return indexOf;
    }

    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f131984g) {
            lastIndexOf = mo68281a().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    public final ListIterator listIterator() {
        return mo68281a().listIterator();
    }

    public final Object remove(int i) {
        Object remove;
        synchronized (this.f131984g) {
            remove = mo68281a().remove(i);
        }
        return remove;
    }

    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.f131984g) {
            obj2 = mo68281a().set(i, obj);
        }
        return obj2;
    }

    public final List subList(int i, int i2) {
        List a;
        synchronized (this.f131984g) {
            a = bnqh.m110113a(mo68281a().subList(i, i2), this.f131984g);
        }
        return a;
    }

    public bnpz(List list, Object obj) {
        super(list, obj);
    }

    public final ListIterator listIterator(int i) {
        return mo68281a().listIterator(i);
    }
}
