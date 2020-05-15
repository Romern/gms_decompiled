package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqcm extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final int[] f140477a;

    /* renamed from: b */
    final int f140478b;

    /* renamed from: c */
    final int f140479c;

    public bqcm(int[] iArr, int i, int i2) {
        this.f140477a = iArr;
        this.f140478b = i;
        this.f140479c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && bqcn.m112581a(this.f140477a, ((Integer) obj).intValue(), this.f140478b, this.f140479c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcm)) {
            return super.equals(obj);
        }
        bqcm bqcm = (bqcm) obj;
        int size = size();
        if (bqcm.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140477a[this.f140478b + i] != bqcm.f140477a[bqcm.f140478b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140478b; i2 < this.f140479c; i2++) {
            i = (i * 31) + this.f140477a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Integer) || (a = bqcn.m112581a(this.f140477a, ((Integer) obj).intValue(), this.f140478b, this.f140479c)) < 0) {
            return -1;
        }
        return a - this.f140478b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f140477a;
            int intValue = ((Integer) obj).intValue();
            int i = this.f140478b;
            int i2 = this.f140479c - 1;
            while (true) {
                if (i2 >= i) {
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140478b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        bmxy.m108584a(i, size());
        int[] iArr = this.f140477a;
        int i2 = this.f140478b + i;
        int i3 = iArr[i2];
        bmxy.m108581a(num);
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f140479c - this.f140478b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.f140477a;
        int i3 = this.f140478b;
        return new bqcm(iArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.f140477a[this.f140478b]);
        int i = this.f140478b;
        while (true) {
            i++;
            if (i < this.f140479c) {
                sb.append(", ");
                sb.append(this.f140477a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Integer.valueOf(this.f140477a[this.f140478b + i]);
    }
}
