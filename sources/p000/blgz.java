package p000;

import java.util.Arrays;

/* renamed from: blgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgz {

    /* renamed from: a */
    public static final blgz f126485a = new blgz();

    /* renamed from: b */
    public String f126486b = "";

    /* renamed from: c */
    public int f126487c = 0;

    /* renamed from: d */
    public blgs f126488d = blgs.SHIFT_AFTER_DELETE;

    private blgz() {
    }

    /* renamed from: b */
    public static blgy m107154b() {
        return new blgy();
    }

    /* renamed from: a */
    public final blgy mo66517a() {
        return new blgy(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgz) {
            blgz blgz = (blgz) obj;
            return bkwv.m106779a(this.f126486b, blgz.f126486b) && bkwv.m106779a(Integer.valueOf(this.f126487c), Integer.valueOf(blgz.f126487c)) && bkwv.m106779a(this.f126488d, blgz.f126488d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126488d, this.f126486b, Integer.valueOf(this.f126487c)});
    }

    public blgz(blgy blgy) {
        this.f126486b = blgy.f126482a;
        this.f126487c = blgy.f126483b;
        this.f126488d = blgy.f126484c;
    }
}
