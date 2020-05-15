package p000;

import java.util.Arrays;

/* renamed from: blht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blht {

    /* renamed from: a */
    public static final blht f126572a = new blht();

    /* renamed from: b */
    public String f126573b = "";

    /* renamed from: c */
    public String f126574c = "";

    /* renamed from: d */
    public String f126575d = "";

    /* renamed from: e */
    public boolean f126576e = false;

    /* renamed from: f */
    public String f126577f = "";

    /* renamed from: g */
    public String f126578g = "";

    /* renamed from: h */
    public blgj f126579h = blgj.f126431a;

    /* renamed from: i */
    public int f126580i = 0;

    private blht() {
    }

    /* renamed from: a */
    public static blhs m107181a() {
        return new blhs();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blht) {
            blht blht = (blht) obj;
            return bkwv.m106779a(this.f126573b, blht.f126573b) && bkwv.m106779a(this.f126574c, blht.f126574c) && bkwv.m106779a(this.f126575d, blht.f126575d) && bkwv.m106779a(Boolean.valueOf(this.f126576e), Boolean.valueOf(blht.f126576e)) && bkwv.m106779a(this.f126577f, blht.f126577f) && bkwv.m106779a(this.f126578g, blht.f126578g) && bkwv.m106779a(this.f126579h, blht.f126579h) && bkwv.m106779a(Integer.valueOf(this.f126580i), Integer.valueOf(blht.f126580i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126577f, this.f126578g, Boolean.valueOf(this.f126576e), this.f126575d, this.f126573b, this.f126574c, this.f126579h, Integer.valueOf(this.f126580i)});
    }

    public blht(blhs blhs) {
        this.f126573b = blhs.f126564a;
        this.f126574c = blhs.f126565b;
        this.f126575d = blhs.f126566c;
        this.f126576e = blhs.f126567d;
        this.f126577f = blhs.f126568e;
        this.f126578g = blhs.f126569f;
        this.f126579h = blhs.f126570g;
        this.f126580i = blhs.f126571h;
    }
}
