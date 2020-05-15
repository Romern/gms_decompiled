package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqcp extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final long[] f140481a;

    /* renamed from: b */
    final int f140482b;

    /* renamed from: c */
    final int f140483c;

    public bqcp(long[] jArr, int i, int i2) {
        this.f140481a = jArr;
        this.f140482b = i;
        this.f140483c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Long) && bqcr.m112592a(this.f140481a, ((Long) obj).longValue(), this.f140482b, this.f140483c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcp)) {
            return super.equals(obj);
        }
        bqcp bqcp = (bqcp) obj;
        int size = size();
        if (bqcp.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140481a[this.f140482b + i] != bqcp.f140481a[bqcp.f140482b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140482b; i2 < this.f140483c; i2++) {
            i = (i * 31) + bqcr.m112590a(this.f140481a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Long) || (a = bqcr.m112592a(this.f140481a, ((Long) obj).longValue(), this.f140482b, this.f140483c)) < 0) {
            return -1;
        }
        return a - this.f140482b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.f140481a;
            long longValue = ((Long) obj).longValue();
            int i = this.f140482b;
            int i2 = this.f140483c - 1;
            while (true) {
                if (i2 >= i) {
                    if (jArr[i2] == longValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140482b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Long l = (Long) obj;
        bmxy.m108584a(i, size());
        long[] jArr = this.f140481a;
        int i2 = this.f140482b + i;
        long j = jArr[i2];
        bmxy.m108581a(l);
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f140483c - this.f140482b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.f140481a;
        int i3 = this.f140482b;
        return new bqcp(jArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
        sb.append('[');
        sb.append(this.f140481a[this.f140482b]);
        int i = this.f140482b;
        while (true) {
            i++;
            if (i < this.f140483c) {
                sb.append(", ");
                sb.append(this.f140481a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Long.valueOf(this.f140481a[this.f140482b + i]);
    }
}
