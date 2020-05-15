package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bnpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpv extends bnqf {
    private static final long serialVersionUID = 0;

    public bnpv(Set set, Object obj) {
        super(set, obj);
    }

    public final boolean contains(Object obj) {
        boolean z;
        synchronized (this.f131984g) {
            Set b = mo68281a();
            if (obj instanceof Map.Entry) {
                z = b.contains(bnmt.m109798a((Map.Entry) obj));
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, java.util.Collection):boolean
     arg types: [java.util.Set, java.util.Collection]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, bmxz):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean */
    public final boolean containsAll(Collection collection) {
        boolean a;
        synchronized (this.f131984g) {
            a = bnec.m109119a((Collection) mo68281a(), collection);
        }
        return a;
    }

    public final boolean equals(Object obj) {
        boolean a;
        if (obj == this) {
            return true;
        }
        synchronized (this.f131984g) {
            a = bnpf.m110052a(mo68281a(), obj);
        }
        return a;
    }

    public final Iterator iterator() {
        return new bnpu(this, super.iterator());
    }

    public final boolean remove(Object obj) {
        boolean z;
        synchronized (this.f131984g) {
            Set b = mo68281a();
            if (obj instanceof Map.Entry) {
                z = b.remove(bnmt.m109798a((Map.Entry) obj));
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean removeAll(Collection collection) {
        boolean a;
        synchronized (this.f131984g) {
            a = bnjr.m109615a(mo68281a().iterator(), collection);
        }
        return a;
    }

    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.f131984g) {
            Iterator it = mo68281a().iterator();
            bmxy.m108581a(collection);
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.f131984g) {
            Set b = mo68281a();
            objArr = new Object[b.size()];
            bnnw.m109883a(b, objArr);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        synchronized (this.f131984g) {
            Set b = mo68281a();
            int size = b.size();
            if (objArr.length < size) {
                objArr = bnnz.m109924a(objArr, size);
            }
            bnnw.m109883a(b, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }
}
