package p000;

import java.util.Arrays;

/* renamed from: chxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chxw {

    /* renamed from: a */
    public String f189498a = "unknown-authority";

    /* renamed from: b */
    public chqh f189499b = chqh.f188999b;

    /* renamed from: c */
    public String f189500c;

    /* renamed from: d */
    public chrw f189501d;

    public final boolean equals(Object obj) {
        if (obj instanceof chxw) {
            chxw chxw = (chxw) obj;
            if (!this.f189498a.equals(chxw.f189498a) || !this.f189499b.equals(chxw.f189499b) || !bmxi.m108538a(this.f189500c, chxw.f189500c) || !bmxi.m108538a(this.f189501d, chxw.f189501d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189498a, this.f189499b, this.f189500c, this.f189501d});
    }
}
