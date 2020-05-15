package p000;

import java.util.Arrays;

/* renamed from: blhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhd {

    /* renamed from: a */
    public static final blhd f126499a = new blhd();

    /* renamed from: b */
    public int f126500b = 0;

    /* renamed from: c */
    public int f126501c = 0;

    /* renamed from: d */
    public String f126502d = "";

    private blhd() {
    }

    /* renamed from: a */
    public static blhc m107162a() {
        return new blhc();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhd) {
            blhd blhd = (blhd) obj;
            return bkwv.m106779a(Integer.valueOf(this.f126500b), Integer.valueOf(blhd.f126500b)) && bkwv.m106779a(Integer.valueOf(this.f126501c), Integer.valueOf(blhd.f126501c)) && bkwv.m106779a(this.f126502d, blhd.f126502d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f126501c), Integer.valueOf(this.f126500b), this.f126502d});
    }

    public blhd(blhc blhc) {
        this.f126500b = blhc.f126496a;
        this.f126501c = blhc.f126497b;
        this.f126502d = blhc.f126498c;
    }
}
