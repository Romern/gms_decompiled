package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfu {

    /* renamed from: a */
    public final caaw f53736a;

    public yfu(caaw caaw) {
        int i = caaw.f172381a;
        boolean z = true;
        if (!((i & 1) == 0 || (i & 2) == 0)) {
            z = false;
        }
        bmxy.m108596a(z, "Value must contain one and only one field, depending on the format of the data type: %s", caaw);
        this.f53736a = caaw;
    }

    /* renamed from: a */
    public final int mo30434a() {
        boolean z = true;
        if ((this.f53736a.f172381a & 1) == 0) {
            z = false;
        }
        bmxy.m108588a(z);
        return this.f53736a.f172382b;
    }

    /* renamed from: b */
    public final double mo30435b() {
        bmxy.m108588a((this.f53736a.f172381a & 2) != 0);
        return this.f53736a.f172383c;
    }

    /* renamed from: c */
    public final Map mo30436c() {
        bmxy.m108588a(!Collections.unmodifiableMap(this.f53736a.f172385e).isEmpty());
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : Collections.unmodifiableMap(this.f53736a.f172385e).entrySet()) {
            caar caar = (caar) entry.getValue();
            hashMap.put((String) entry.getKey(), (caar.f172367a & 1) != 0 ? Float.valueOf((float) caar.f172368b) : null);
        }
        return hashMap;
    }

    /* renamed from: d */
    public final boolean mo30437d() {
        return (this.f53736a.f172381a & 2) != 0;
    }

    /* renamed from: e */
    public final byte[] mo30438e() {
        bmxy.m108588a((this.f53736a.f172381a & 8) != 0);
        return this.f53736a.f172388h.getKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f53736a.equals(((yfu) obj).f53736a);
    }

    public final int hashCode() {
        caaw caaw = this.f53736a;
        int i = caaw.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(caaw).mo74216a(caaw);
        caaw.f164758ag = a;
        return a;
    }

    public final String toString() {
        return yyp.m45049a(this.f53736a);
    }
}
