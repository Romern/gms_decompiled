package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgx {

    /* renamed from: a */
    public List f126480a = Collections.emptyList();

    /* renamed from: b */
    private blhp f126481b = blhp.f126557a;

    static {
        new blgx();
    }

    private blgx() {
    }

    /* renamed from: a */
    public static blgw m107152a() {
        return new blgw();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgx) {
            blgx blgx = (blgx) obj;
            return bkwv.m106779a(this.f126480a, blgx.f126480a) && bkwv.m106779a(this.f126481b, blgx.f126481b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126481b, this.f126480a});
    }

    public blgx(blgw blgw) {
        this.f126480a = Collections.unmodifiableList(blgw.f126478a);
        this.f126481b = blgw.f126479b;
    }
}
