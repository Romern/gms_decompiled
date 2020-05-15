package p000;

import java.util.Arrays;

/* renamed from: blhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhx {

    /* renamed from: a */
    public static final blhx f126588a = new blhx();

    /* renamed from: b */
    public String f126589b = "";

    /* renamed from: c */
    public blhp f126590c = blhp.f126557a;

    private blhx() {
    }

    /* renamed from: a */
    public static blhw m107186a() {
        return new blhw();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhx) {
            blhx blhx = (blhx) obj;
            return bkwv.m106779a(this.f126589b, blhx.f126589b) && bkwv.m106779a(this.f126590c, blhx.f126590c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126589b, this.f126590c});
    }

    public blhx(blhw blhw) {
        this.f126589b = blhw.f126586a;
        this.f126590c = blhw.f126587b;
    }
}
