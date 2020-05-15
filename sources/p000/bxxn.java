package p000;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bxxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxxn extends bxtc implements RandomAccess {

    /* renamed from: b */
    public static final bxxn f165040b;

    /* renamed from: c */
    private Object[] f165041c;

    /* renamed from: d */
    private int f165042d;

    static {
        bxxn bxxn = new bxxn(new Object[0], 0);
        f165040b = bxxn;
        bxxn.mo73671b();
    }

    public bxxn() {
        this(new Object[10], 0);
    }

    /* renamed from: a */
    private final void m124253a(int i) {
        if (i < 0 || i >= this.f165042d) {
            throw new IndexOutOfBoundsException(m124254b(i));
        }
    }

    /* renamed from: b */
    private final String m124254b(int i) {
        int i2 = this.f165042d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo73672c();
        if (i < 0 || i > (i2 = this.f165042d)) {
            throw new IndexOutOfBoundsException(m124254b(i));
        }
        Object[] objArr = this.f165041c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f165041c, i, objArr2, i + 1, this.f165042d - i);
            this.f165041c = objArr2;
        }
        this.f165041c[i] = obj;
        this.f165042d++;
        this.modCount++;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxwc mo73731c(int i) {
        if (i >= this.f165042d) {
            return new bxxn(Arrays.copyOf(this.f165041c, i), this.f165042d);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i) {
        m124253a(i);
        return this.f165041c[i];
    }

    public final Object remove(int i) {
        mo73672c();
        m124253a(i);
        Object[] objArr = this.f165041c;
        Object obj = objArr[i];
        int i2 = this.f165042d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f165042d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo73672c();
        m124253a(i);
        Object[] objArr = this.f165041c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f165042d;
    }

    private bxxn(Object[] objArr, int i) {
        this.f165041c = objArr;
        this.f165042d = i;
    }

    public final boolean add(Object obj) {
        mo73672c();
        int i = this.f165042d;
        Object[] objArr = this.f165041c;
        if (i == objArr.length) {
            this.f165041c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f165041c;
        int i2 = this.f165042d;
        this.f165042d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
