package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bnyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyl extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private Object[] f132374a;

    /* renamed from: b */
    private int f132375b;

    public bnyl(int i) {
        this.f132374a = new Object[Math.max(1, i)];
    }

    public final boolean add(Object obj) {
        int i = this.f132375b;
        Object[] objArr = this.f132374a;
        if (i == objArr.length) {
            this.f132374a = Arrays.copyOf(objArr, i + i);
        }
        Object[] objArr2 = this.f132374a;
        int i2 = this.f132375b;
        this.f132375b = i2 + 1;
        objArr2[i2] = obj;
        return true;
    }

    public final Object get(int i) {
        return this.f132374a[i];
    }

    public final Object set(int i, Object obj) {
        Object[] objArr = this.f132374a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final int size() {
        return this.f132375b;
    }
}
