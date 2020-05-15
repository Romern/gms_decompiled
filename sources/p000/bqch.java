package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqch extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final double[] f140470a;

    /* renamed from: b */
    final int f140471b;

    /* renamed from: c */
    final int f140472c;

    public bqch(double[] dArr, int i, int i2) {
        this.f140470a = dArr;
        this.f140471b = i;
        this.f140472c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Double) && bqci.m112568a(this.f140470a, ((Double) obj).doubleValue(), this.f140471b, this.f140472c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqch)) {
            return super.equals(obj);
        }
        bqch bqch = (bqch) obj;
        int size = size();
        if (bqch.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140470a[this.f140471b + i] != bqch.f140470a[bqch.f140471b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140471b; i2 < this.f140472c; i2++) {
            i = (i * 31) + bqci.m112567a(this.f140470a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Double) || (a = bqci.m112568a(this.f140470a, ((Double) obj).doubleValue(), this.f140471b, this.f140472c)) < 0) {
            return -1;
        }
        return a - this.f140471b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            double[] dArr = this.f140470a;
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f140471b;
            int i2 = this.f140472c - 1;
            int i3 = bqci.f140473a;
            while (true) {
                if (i2 >= i) {
                    if (dArr[i2] == doubleValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140471b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Double d = (Double) obj;
        bmxy.m108584a(i, size());
        double[] dArr = this.f140470a;
        int i2 = this.f140471b + i;
        double d2 = dArr[i2];
        bmxy.m108581a(d);
        dArr[i2] = d.doubleValue();
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f140472c - this.f140471b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        double[] dArr = this.f140470a;
        int i3 = this.f140471b;
        return new bqch(dArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.f140470a[this.f140471b]);
        int i = this.f140471b;
        while (true) {
            i++;
            if (i < this.f140472c) {
                sb.append(", ");
                sb.append(this.f140470a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Double.valueOf(this.f140470a[this.f140471b + i]);
    }
}
