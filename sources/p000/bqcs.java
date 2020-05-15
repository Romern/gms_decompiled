package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcs extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final short[] f140485a;

    /* renamed from: b */
    final int f140486b;

    /* renamed from: c */
    final int f140487c;

    public bqcs(short[] sArr, int i, int i2) {
        this.f140485a = sArr;
        this.f140486b = i;
        this.f140487c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Short) && bqct.m112600a(this.f140485a, ((Short) obj).shortValue(), this.f140486b, this.f140487c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcs)) {
            return super.equals(obj);
        }
        bqcs bqcs = (bqcs) obj;
        int size = size();
        if (bqcs.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140485a[this.f140486b + i] != bqcs.f140485a[bqcs.f140486b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140486b; i2 < this.f140487c; i2++) {
            i = (i * 31) + this.f140485a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Short) || (a = bqct.m112600a(this.f140485a, ((Short) obj).shortValue(), this.f140486b, this.f140487c)) < 0) {
            return -1;
        }
        return a - this.f140486b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Short) {
            short[] sArr = this.f140485a;
            short shortValue = ((Short) obj).shortValue();
            int i = this.f140486b;
            int i2 = this.f140487c - 1;
            while (true) {
                if (i2 >= i) {
                    if (sArr[i2] == shortValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140486b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Short sh = (Short) obj;
        bmxy.m108584a(i, size());
        short[] sArr = this.f140485a;
        int i2 = this.f140486b + i;
        short s = sArr[i2];
        bmxy.m108581a(sh);
        sArr[i2] = sh.shortValue();
        return Short.valueOf(s);
    }

    public final int size() {
        return this.f140487c - this.f140486b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        short[] sArr = this.f140485a;
        int i3 = this.f140486b;
        return new bqcs(sArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 6);
        sb.append('[');
        sb.append((int) this.f140485a[this.f140486b]);
        int i = this.f140486b;
        while (true) {
            i++;
            if (i < this.f140487c) {
                sb.append(", ");
                sb.append((int) this.f140485a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Short.valueOf(this.f140485a[this.f140486b + i]);
    }
}
