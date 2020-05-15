package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: bngm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bngm extends AbstractCollection implements Serializable {

    /* renamed from: DD */
    private static final Object[] f131598DD = new Object[0];

    /* renamed from: a */
    public int mo67630a(Object[] objArr, int i) {
        bnrd a = iterator();
        while (a.hasNext()) {
            objArr[i] = a.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract bnrd iterator();

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object[] mo67634b() {
        return null;
    }

    /* renamed from: c */
    public int mo67635c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* renamed from: f */
    public int mo67638f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public bngx mo67639g() {
        return !isEmpty() ? bngx.m109373b(toArray()) : bngx.m109376e();
    }

    /* renamed from: h */
    public abstract boolean mo67640h();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f131598DD);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bngv(toArray());
    }

    public final Object[] toArray(Object[] objArr) {
        bmxy.m108581a(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = mo67634b();
            if (b != null) {
                return Arrays.copyOfRange(b, mo67635c(), mo67638f(), objArr.getClass());
            }
            objArr = bnnz.m109924a(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo67630a(objArr, 0);
        return objArr;
    }
}
