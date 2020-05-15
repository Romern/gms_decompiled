package p000;

import java.util.Arrays;

/* renamed from: bfbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbe {

    /* renamed from: a */
    public final double f113291a;

    /* renamed from: b */
    public final double f113292b;

    public bfbe(double d, double d2) {
        this.f113291a = d;
        this.f113292b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bfbe bfbe = (bfbe) obj;
            return Double.compare(bfbe.f113291a, this.f113291a) == 0 && Double.compare(bfbe.f113292b, this.f113292b) == 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new double[]{this.f113291a, this.f113292b});
    }
}
