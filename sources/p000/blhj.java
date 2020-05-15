package p000;

import java.util.Arrays;

/* renamed from: blhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhj {

    /* renamed from: a */
    public static final blhj f126532a = new blhj();

    /* renamed from: b */
    private final String f126533b = "";

    /* renamed from: c */
    private final int f126534c = 0;

    /* renamed from: d */
    private final String f126535d = "";

    /* renamed from: e */
    private final blgs f126536e = blgs.SHIFT_AFTER_DELETE;

    private blhj() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhj) {
            blhj blhj = (blhj) obj;
            if (bkwv.m106779a(this.f126533b, blhj.f126533b)) {
                int i = blhj.f126534c;
                return bkwv.m106779a(0, 0) && bkwv.m106779a(this.f126535d, blhj.f126535d) && bkwv.m106779a(this.f126536e, blhj.f126536e);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126536e, 0, this.f126535d, this.f126533b});
    }
}
