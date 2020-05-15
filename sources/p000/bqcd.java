package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bqcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqcd extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final byte[] f140464a;

    /* renamed from: b */
    final int f140465b;

    /* renamed from: c */
    final int f140466c;

    public bqcd(byte[] bArr, int i, int i2) {
        this.f140464a = bArr;
        this.f140465b = i;
        this.f140466c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Byte) && bqce.m112559a(this.f140464a, ((Byte) obj).byteValue(), this.f140465b, this.f140466c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcd)) {
            return super.equals(obj);
        }
        bqcd bqcd = (bqcd) obj;
        int size = size();
        if (bqcd.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f140464a[this.f140465b + i] != bqcd.f140464a[bqcd.f140465b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f140465b; i2 < this.f140466c; i2++) {
            i = (i * 31) + this.f140464a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Byte) || (a = bqce.m112559a(this.f140464a, ((Byte) obj).byteValue(), this.f140465b, this.f140466c)) < 0) {
            return -1;
        }
        return a - this.f140465b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.f140464a;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.f140465b;
            int i2 = this.f140466c - 1;
            while (true) {
                if (i2 >= i) {
                    if (bArr[i2] == byteValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f140465b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Byte b = (Byte) obj;
        bmxy.m108584a(i, size());
        byte[] bArr = this.f140464a;
        int i2 = this.f140465b + i;
        byte b2 = bArr[i2];
        bmxy.m108581a(b);
        bArr[i2] = b.byteValue();
        return Byte.valueOf(b2);
    }

    public final int size() {
        return this.f140466c - this.f140465b;
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        byte[] bArr = this.f140464a;
        int i3 = this.f140465b;
        return new bqcd(bArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append((int) this.f140464a[this.f140465b]);
        int i = this.f140465b;
        while (true) {
            i++;
            if (i < this.f140466c) {
                sb.append(", ");
                sb.append((int) this.f140464a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        return Byte.valueOf(this.f140464a[this.f140465b + i]);
    }
}
