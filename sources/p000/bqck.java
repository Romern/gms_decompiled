package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqck extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final float[] f140474a;

    /* renamed from: b */
    final int f140475b;

    /* renamed from: c */
    final int f140476c;

    public bqck(float[] fArr, int i, int i2) {
        this.f140474a = fArr;
        this.f140475b = i;
        this.f140476c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Float) && bqcl.m112572a(this.f140474a, ((Float) obj).floatValue(), this.f140475b, this.f140476c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqck)) {
            return super.equals(obj);
        }
        bqck bqck = (bqck) obj;
        int size = size();
        if (bqck.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140474a[this.f140475b + i] != bqck.f140474a[bqck.f140475b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140475b; i2 < this.f140476c; i2++) {
            i = (i * 31) + Float.valueOf(this.f140474a[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Float) || (a = bqcl.m112572a(this.f140474a, ((Float) obj).floatValue(), this.f140475b, this.f140476c)) < 0) {
            return -1;
        }
        return a - this.f140475b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f140474a;
            float floatValue = ((Float) obj).floatValue();
            int i = this.f140475b;
            int i2 = this.f140476c - 1;
            while (true) {
                if (i2 >= i) {
                    if (fArr[i2] == floatValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140475b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        bmxy.m108584a(i, size());
        float[] fArr = this.f140474a;
        int i2 = this.f140475b + i;
        float f2 = fArr[i2];
        bmxy.m108581a(f);
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f140476c - this.f140475b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.f140474a;
        int i3 = this.f140475b;
        return new bqck(fArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.f140474a[this.f140475b]);
        int i = this.f140475b;
        while (true) {
            i++;
            if (i < this.f140476c) {
                sb.append(", ");
                sb.append(this.f140474a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Float.valueOf(this.f140474a[this.f140475b + i]);
    }
}
