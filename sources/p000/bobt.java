package p000;

import java.util.Arrays;

/* renamed from: bobt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bobt extends bobv {

    /* renamed from: a */
    final int f132516a;

    /* renamed from: b */
    final int f132517b;

    /* renamed from: c */
    final double f132518c;

    public bobt(int i, double d, int i2) {
        boolean z;
        bobv.m111054c(i2);
        this.f132516a = i2;
        bobv.m111054c(i);
        this.f132517b = i;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f132518c = d;
    }

    /* renamed from: a */
    public final boolean mo68890a(int i) {
        bmxy.m108588a(i >= 0);
        return i < this.f132516a;
    }

    /* renamed from: b */
    public final int mo68891b(int i) {
        if (i == 0) {
            return 0;
        }
        if (!mo68890a(i)) {
            return -1;
        }
        double d = (double) this.f132517b;
        double pow = Math.pow(this.f132518c, (double) (i - 1));
        Double.isNaN(d);
        return bobv.m111053a(d * pow);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bobt) {
            bobt bobt = (bobt) obj;
            return this.f132517b == bobt.f132517b && this.f132518c == bobt.f132518c && this.f132516a == bobt.f132516a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f132516a), Integer.valueOf(this.f132517b), Double.valueOf(this.f132518c)});
    }
}
