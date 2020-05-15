package p000;

import java.util.Arrays;

/* renamed from: blgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgr {

    /* renamed from: a */
    public static final blgr f126463a = new blgr();

    /* renamed from: b */
    public blgq f126464b = blgq.KIND_NOT_SET;

    /* renamed from: c */
    private Object f126465c = null;

    private blgr() {
    }

    /* renamed from: b */
    public static blgp m107146b() {
        return new blgp();
    }

    /* renamed from: a */
    public final blhi mo66505a() {
        return this.f126464b == blgq.CUSTOM ? (blhi) this.f126465c : blhi.f126528a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgr) {
            blgr blgr = (blgr) obj;
            return bkwv.m106779a(this.f126465c, blgr.f126465c) && this.f126464b == blgr.f126464b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126465c, this.f126464b});
    }

    public blgr(blgp blgp) {
        this.f126465c = blgp.f126455b;
        this.f126464b = blgp.f126454a;
    }
}
