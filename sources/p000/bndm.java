package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bndm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bndm extends AbstractCollection implements bnnn {

    /* renamed from: a */
    private transient Set f131492a;

    /* renamed from: b */
    private transient Set f131493b;

    /* renamed from: a */
    public int mo67286a(Object obj, int i) {
        throw null;
    }

    /* renamed from: a */
    public abstract Iterator mo67287a();

    public final boolean add(Object obj) {
        mo67290b(obj, 1);
        return true;
    }

    /* renamed from: b */
    public abstract Iterator mo67289b();

    /* renamed from: b */
    public void mo67290b(Object obj, int i) {
        throw null;
    }

    /* renamed from: c */
    public abstract int mo67291c();

    /* renamed from: c */
    public boolean mo67292c(Object obj, int i) {
        throw null;
    }

    public final boolean contains(Object obj) {
        return mo67285a(obj) > 0;
    }

    /* renamed from: d */
    public final Set mo67323d() {
        Set set = this.f131492a;
        if (set != null) {
            return set;
        }
        bnnp bnnp = new bnnp(this);
        this.f131492a = bnnp;
        return bnnp;
    }

    /* renamed from: e */
    public final Set mo67324e() {
        Set set = this.f131493b;
        if (set != null) {
            return set;
        }
        bnnq bnnq = new bnnq(this);
        this.f131493b = bnnq;
        return bnnq;
    }

    public final boolean equals(Object obj) {
        return bnns.m109873a(this, obj);
    }

    public final int hashCode() {
        return mo67324e().hashCode();
    }

    public final boolean isEmpty() {
        return mo67324e().isEmpty();
    }

    public final boolean remove(Object obj) {
        return mo67286a(obj, 1) > 0;
    }

    public final String toString() {
        return mo67324e().toString();
    }

    public final boolean addAll(Collection collection) {
        bmxy.m108581a(this);
        bmxy.m108581a(collection);
        if (collection instanceof bnnn) {
            bnnn bnnn = (bnnn) collection;
            if (bnnn instanceof bndh) {
                bndh bndh = (bndh) bnnn;
                if (bndh.isEmpty()) {
                    return false;
                }
                bmxy.m108581a(this);
                for (int a = bndh.f131485a.mo68146a(); a >= 0; a = bndh.f131485a.mo68147a(a)) {
                    mo67290b(bndh.f131485a.mo68152b(a), bndh.f131485a.mo68153c(a));
                }
                return true;
            } else if (bnnn.isEmpty()) {
                return false;
            } else {
                for (bnno bnno : bnnn.mo67324e()) {
                    mo67290b(bnno.f131866a, bnno.mo68118a());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return bnjr.m109612a(this, collection.iterator());
        }
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof bnnn) {
            collection = ((bnnn) collection).mo67323d();
        }
        return mo67323d().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        bmxy.m108581a(collection);
        if (collection instanceof bnnn) {
            collection = ((bnnn) collection).mo67323d();
        }
        return mo67323d().retainAll(collection);
    }
}
