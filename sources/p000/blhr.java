package p000;

import java.util.Arrays;

/* renamed from: blhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhr {

    /* renamed from: a */
    public blht f126562a = blht.f126572a;

    /* renamed from: b */
    public blhg f126563b = blhg.f126521a;

    static {
        new blhr();
    }

    private blhr() {
    }

    /* renamed from: a */
    public static blhq m107180a() {
        return new blhq();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhr) {
            blhr blhr = (blhr) obj;
            return bkwv.m106779a(this.f126562a, blhr.f126562a) && bkwv.m106779a(this.f126563b, blhr.f126563b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126562a, this.f126563b});
    }

    public blhr(blhq blhq) {
        this.f126562a = blhq.f126560a;
        this.f126563b = blhq.f126561b;
    }
}
