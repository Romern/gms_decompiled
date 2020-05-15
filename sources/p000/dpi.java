package p000;

import java.util.Arrays;

/* renamed from: dpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpi {

    /* renamed from: a */
    public final String f13742a;

    /* renamed from: b */
    public final String f13743b;

    public dpi(String str, String str2) {
        this.f13742a = str;
        this.f13743b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dpi) {
            dpi dpi = (dpi) obj;
            return this.f13742a.equals(dpi.f13742a) && this.f13743b.equals(dpi.f13743b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13742a, this.f13743b});
    }
}
