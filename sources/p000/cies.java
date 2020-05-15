package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: cies */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cies {

    /* renamed from: a */
    final chsw f189978a;
    @Deprecated

    /* renamed from: b */
    final Map f189979b;

    /* renamed from: c */
    final Object f189980c;

    public cies(chsw chsw, Map map, Object obj) {
        bmxy.m108582a(chsw, "provider");
        this.f189978a = chsw;
        this.f189979b = map;
        this.f189980c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cies cies = (cies) obj;
            return bmxi.m108538a(this.f189978a, cies.f189978a) && bmxi.m108538a(this.f189979b, cies.f189979b) && bmxi.m108538a(this.f189980c, cies.f189980c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189978a, this.f189979b, this.f189980c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("provider", this.f189978a);
        a.mo66885a("rawConfig", this.f189979b);
        a.mo66885a("config", this.f189980c);
        return a.toString();
    }
}
