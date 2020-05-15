package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcb extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final boolean[] f140461a;

    /* renamed from: b */
    final int f140462b;

    /* renamed from: c */
    final int f140463c;

    public bqcb(boolean[] zArr, int i, int i2) {
        this.f140461a = zArr;
        this.f140462b = i;
        this.f140463c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Boolean) && bqcc.m112557a(this.f140461a, ((Boolean) obj).booleanValue(), this.f140462b, this.f140463c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcb)) {
            return super.equals(obj);
        }
        bqcb bqcb = (bqcb) obj;
        int size = size();
        if (bqcb.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140461a[this.f140462b + i] != bqcb.f140461a[bqcb.f140462b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140462b; i2 < this.f140463c; i2++) {
            i = (i * 31) + (!this.f140461a[i2] ? 1237 : 1231);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Boolean) || (a = bqcc.m112557a(this.f140461a, ((Boolean) obj).booleanValue(), this.f140462b, this.f140463c)) < 0) {
            return -1;
        }
        return a - this.f140462b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean[] zArr = this.f140461a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f140462b;
            int i2 = this.f140463c - 1;
            while (true) {
                if (i2 >= i) {
                    if (zArr[i2] == booleanValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140462b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Boolean bool = (Boolean) obj;
        bmxy.m108584a(i, size());
        boolean[] zArr = this.f140461a;
        int i2 = this.f140462b + i;
        boolean z = zArr[i2];
        bmxy.m108581a(bool);
        zArr[i2] = bool.booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f140463c - this.f140462b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.f140461a;
        int i3 = this.f140462b;
        return new bqcb(zArr, i + i3, i3 + i2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(size() * 7);
        if (!this.f140461a[this.f140462b]) {
            str = "[false";
        } else {
            str = "[true";
        }
        sb.append(str);
        int i = this.f140462b;
        while (true) {
            i++;
            if (i < this.f140463c) {
                sb.append(!this.f140461a[i] ? ", false" : ", true");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Boolean.valueOf(this.f140461a[this.f140462b + i]);
    }
}
