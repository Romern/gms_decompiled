package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: adyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyn {

    /* renamed from: a */
    public int f62912a;

    /* renamed from: b */
    public int f62913b;

    /* renamed from: c */
    public int f62914c;

    /* renamed from: d */
    public double[] f62915d;

    public adyn(int i, int i2) {
        this.f62912a = i;
        this.f62913b = i2;
        int i3 = i * i2;
        this.f62914c = i3;
        this.f62915d = new double[i3];
    }

    /* renamed from: a */
    public static adyn m51430a(int i) {
        adyn adyn = new adyn(i, i);
        int i2 = 0;
        while (i2 < adyn.f62914c) {
            adyn.f62915d[i2] = 1.0d;
            i2 += i + 1;
        }
        return adyn;
    }

    /* renamed from: b */
    public final void mo33934b(int i, int i2) {
        int i3 = i * i2;
        if (i3 > this.f62915d.length) {
            this.f62915d = new double[i3];
        }
        this.f62912a = i;
        this.f62913b = i2;
        this.f62914c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adyn) {
            adyn adyn = (adyn) obj;
            if (this.f62912a == adyn.f62912a && this.f62913b == adyn.f62913b) {
                for (int i = 0; i < this.f62914c; i++) {
                    if (this.f62915d[i] != adyn.f62915d[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f62912a;
        int i2 = 1;
        if (this.f62913b * i != this.f62914c) {
            for (int i3 = 0; i3 < this.f62914c; i3++) {
                long doubleToLongBits = Double.doubleToLongBits(this.f62915d[i3]);
                i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            }
            return (((i2 * 31) + this.f62912a) * 31) + this.f62913b;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.f62913b), Integer.valueOf(Arrays.hashCode(this.f62915d))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f62912a; i++) {
            for (int i2 = 0; i2 < this.f62913b; i2++) {
                sb.append(String.format(Locale.US, "%8f", Double.valueOf(mo33930a(i, i2))));
                sb.append("    ");
            }
            sb.append(10);
        }
        return sb.toString();
    }

    public adyn(double[][] dArr) {
        this(dArr.length, dArr[0].length);
        int i = 0;
        for (int i2 = 0; i2 < this.f62913b; i2++) {
            for (int i3 = 0; i3 < this.f62912a; i3++) {
                this.f62915d[i] = dArr[i3][i2];
                i++;
            }
        }
    }

    /* renamed from: a */
    public final double mo33930a(int i, int i2) {
        int i3;
        if (i >= 0 && i < (i3 = this.f62912a) && i2 >= 0 && i2 < this.f62913b) {
            return this.f62915d[(i2 * i3) + i];
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", Integer.valueOf(i), Integer.valueOf(this.f62912a - 1), Integer.valueOf(i2), Integer.valueOf(this.f62913b - 1)));
    }

    /* renamed from: a */
    public final void mo33931a() {
        for (int i = 0; i < this.f62914c; i++) {
            this.f62915d[i] = 0.0d;
        }
    }

    /* renamed from: a */
    public final void mo33932a(int i, int i2, double d) {
        int i3 = this.f62912a;
        if (i >= i3 || i2 >= this.f62913b) {
            throw new IllegalArgumentException(String.format(Locale.US, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", Integer.valueOf(i), Integer.valueOf(this.f62912a - 1), Integer.valueOf(i2), Integer.valueOf(this.f62913b - 1)));
        }
        this.f62915d[(i2 * i3) + i] = d;
    }

    /* renamed from: a */
    public final void mo33933a(adyn adyn) {
        if (adyn.f62912a == this.f62912a && adyn.f62913b == this.f62913b) {
            for (int i = 0; i < this.f62914c; i++) {
                this.f62915d[i] = adyn.f62915d[i];
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Size of this matrix is %d x %d but size of other is %d x %d", Integer.valueOf(this.f62912a), Integer.valueOf(this.f62913b), Integer.valueOf(adyn.f62912a), Integer.valueOf(adyn.f62913b)));
    }
}
