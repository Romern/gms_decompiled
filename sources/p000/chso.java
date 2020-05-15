package p000;

import java.util.Arrays;

/* renamed from: chso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chso {

    /* renamed from: a */
    public static final chso f189100a = new chso(null, chuv.f189215b, false);

    /* renamed from: b */
    public final chss f189101b;

    /* renamed from: c */
    public final chuv f189102c;

    /* renamed from: d */
    public final boolean f189103d;

    /* renamed from: e */
    private final chqy f189104e = null;

    private chso(chss chss, chuv chuv, boolean z) {
        this.f189101b = chss;
        bmxy.m108582a(chuv, "status");
        this.f189102c = chuv;
        this.f189103d = z;
    }

    /* renamed from: a */
    public static chso m149489a(chss chss) {
        bmxy.m108582a(chss, "subchannel");
        return new chso(chss, chuv.f189215b, false);
    }

    /* renamed from: a */
    public static chso m149490a(chuv chuv) {
        bmxy.m108589a(!chuv.mo85689a(), "error status shouldn't be OK");
        return new chso(null, chuv, false);
    }

    /* renamed from: b */
    public static chso m149491b(chuv chuv) {
        bmxy.m108589a(!chuv.mo85689a(), "drop status shouldn't be OK");
        return new chso(null, chuv, true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chso) {
            chso chso = (chso) obj;
            if (bmxi.m108538a(this.f189101b, chso.f189101b) && bmxi.m108538a(this.f189102c, chso.f189102c)) {
                chqy chqy = chso.f189104e;
                if (!bmxi.m108538a(null, null) || this.f189103d != chso.f189103d) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189101b, this.f189102c, null, Boolean.valueOf(this.f189103d)});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("subchannel", this.f189101b);
        a.mo66885a("streamTracerFactory", (Object) null);
        a.mo66885a("status", this.f189102c);
        a.mo66886a("drop", this.f189103d);
        return a.toString();
    }
}
