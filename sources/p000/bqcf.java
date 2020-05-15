package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqcf extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final char[] f140467a;

    /* renamed from: b */
    final int f140468b;

    /* renamed from: c */
    final int f140469c;

    public bqcf(char[] cArr, int i, int i2) {
        this.f140467a = cArr;
        this.f140468b = i;
        this.f140469c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Character) && bqcg.m112563a(this.f140467a, ((Character) obj).charValue(), this.f140468b, this.f140469c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcf)) {
            return super.equals(obj);
        }
        bqcf bqcf = (bqcf) obj;
        int size = size();
        if (bqcf.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140467a[this.f140468b + i] != bqcf.f140467a[bqcf.f140468b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140468b; i2 < this.f140469c; i2++) {
            i = (i * 31) + this.f140467a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Character) || (a = bqcg.m112563a(this.f140467a, ((Character) obj).charValue(), this.f140468b, this.f140469c)) < 0) {
            return -1;
        }
        return a - this.f140468b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Character) {
            char[] cArr = this.f140467a;
            char charValue = ((Character) obj).charValue();
            int i = this.f140468b;
            int i2 = this.f140469c - 1;
            while (true) {
                if (i2 >= i) {
                    if (cArr[i2] == charValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140468b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Character ch = (Character) obj;
        bmxy.m108584a(i, size());
        char[] cArr = this.f140467a;
        int i2 = this.f140468b + i;
        char c = cArr[i2];
        bmxy.m108581a(ch);
        cArr[i2] = ch.charValue();
        return Character.valueOf(c);
    }

    public final int size() {
        return this.f140469c - this.f140468b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        char[] cArr = this.f140467a;
        int i3 = this.f140468b;
        return new bqcf(cArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 3);
        sb.append('[');
        sb.append(this.f140467a[this.f140468b]);
        int i = this.f140468b;
        while (true) {
            i++;
            if (i < this.f140469c) {
                sb.append(", ");
                sb.append(this.f140467a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Character.valueOf(this.f140467a[this.f140468b + i]);
    }
}
