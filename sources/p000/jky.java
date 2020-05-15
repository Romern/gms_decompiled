package p000;

import java.util.Objects;

/* renamed from: jky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jky {

    /* renamed from: a */
    public final jkw f22725a;

    /* renamed from: b */
    public final jkw f22726b;

    public jky(jkw jkw, jkw jkw2) {
        boolean z = true;
        sdo.m34974b(true);
        sdo.m34974b(jkw.f22722a.length == 2);
        if (!(jkw2 == null || jkw2.f22722a.length == 2)) {
            z = false;
        }
        sdo.m34974b(z);
        this.f22725a = jkw;
        this.f22726b = jkw2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jky) {
            jky jky = (jky) obj;
            if (!this.f22725a.equals(jky.f22725a) || !Objects.equals(this.f22726b, jky.f22726b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22725a, this.f22726b);
    }
}
