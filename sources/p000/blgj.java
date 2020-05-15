package p000;

import java.util.Arrays;

/* renamed from: blgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgj {

    /* renamed from: a */
    public static final blgj f126431a = new blgj();

    /* renamed from: b */
    public long f126432b = 0;

    /* renamed from: c */
    public int f126433c = 0;

    private blgj() {
    }

    /* renamed from: a */
    public static blgi m107128a() {
        return new blgi();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgj) {
            blgj blgj = (blgj) obj;
            return bkwv.m106779a(Long.valueOf(this.f126432b), Long.valueOf(blgj.f126432b)) && bkwv.m106779a(Integer.valueOf(this.f126433c), Integer.valueOf(blgj.f126433c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f126432b), Integer.valueOf(this.f126433c)});
    }

    public blgj(blgi blgi) {
        this.f126432b = blgi.f126429a;
        this.f126433c = blgi.f126430b;
    }
}
