package p000;

import java.util.Arrays;

/* renamed from: blhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhm {

    /* renamed from: a */
    public static final blhm f126543a = new blhm();

    /* renamed from: b */
    private final String f126544b = "";

    /* renamed from: c */
    private final String f126545c = "";

    private blhm() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhm) {
            blhm blhm = (blhm) obj;
            return bkwv.m106779a(this.f126544b, blhm.f126544b) && bkwv.m106779a(this.f126545c, blhm.f126545c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126544b, this.f126545c});
    }
}
