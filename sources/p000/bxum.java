package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bxum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxum extends bxtc implements RandomAccess, bxvo, bxxl {

    /* renamed from: b */
    public static final bxum f164858b;

    /* renamed from: c */
    private double[] f164859c;

    /* renamed from: d */
    private int f164860d;

    static {
        bxum bxum = new bxum(new double[0], 0);
        f164858b = bxum;
        bxum.mo73671b();
    }

    public bxum() {
        this(new double[10], 0);
    }

    /* renamed from: b */
    private final void m123733b(int i) {
        if (i < 0 || i >= this.f164860d) {
            throw new IndexOutOfBoundsException(m123734d(i));
        }
    }

    /* renamed from: d */
    private final String m123734d(int i) {
        int i2 = this.f164860d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final bxvo mo73731c(int i) {
        if (i >= this.f164860d) {
            return new bxum(Arrays.copyOf(this.f164859c, i), this.f164860d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo73672c();
        if (i < 0 || i > (i2 = this.f164860d)) {
            throw new IndexOutOfBoundsException(m123734d(i));
        }
        double[] dArr = this.f164859c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f164859c, i, dArr2, i + 1, this.f164860d - i);
            this.f164859c = dArr2;
        }
        this.f164859c[i] = doubleValue;
        this.f164860d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo73672c();
        bxwd.m124083a(collection);
        if (!(collection instanceof bxum)) {
            return super.addAll(collection);
        }
        bxum bxum = (bxum) collection;
        int i = bxum.f164860d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f164860d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f164859c;
            if (i3 > dArr.length) {
                this.f164859c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(bxum.f164859c, 0, this.f164859c, this.f164860d, bxum.f164860d);
            this.f164860d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxum)) {
            return super.equals(obj);
        }
        bxum bxum = (bxum) obj;
        if (this.f164860d != bxum.f164860d) {
            return false;
        }
        double[] dArr = bxum.f164859c;
        for (int i = 0; i < this.f164860d; i++) {
            if (Double.doubleToLongBits(this.f164859c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f164860d; i2++) {
            i = (i * 31) + bxwd.m124079a(Double.doubleToLongBits(this.f164859c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f164860d;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f164859c[i2] == doubleValue) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo73672c();
        if (i2 >= i) {
            double[] dArr = this.f164859c;
            System.arraycopy(dArr, i2, dArr, i, this.f164860d - i2);
            this.f164860d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo73672c();
        m123733b(i);
        double[] dArr = this.f164859c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f164860d;
    }

    private bxum(double[] dArr, int i) {
        this.f164859c = dArr;
        this.f164860d = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m123733b(i);
        return Double.valueOf(this.f164859c[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        m123733b(i);
        double[] dArr = this.f164859c;
        double d = dArr[i];
        int i2 = this.f164860d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f164860d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo73894a(double d) {
        mo73672c();
        int i = this.f164860d;
        double[] dArr = this.f164859c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f164859c = dArr2;
        }
        double[] dArr3 = this.f164859c;
        int i2 = this.f164860d;
        this.f164860d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean remove(Object obj) {
        mo73672c();
        for (int i = 0; i < this.f164860d; i++) {
            if (obj.equals(Double.valueOf(this.f164859c[i]))) {
                double[] dArr = this.f164859c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f164860d - i) - 1);
                this.f164860d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo73894a(((Double) obj).doubleValue());
        return true;
    }
}
