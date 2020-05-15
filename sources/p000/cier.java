package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: cier */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cier {

    /* renamed from: a */
    public final String f189976a;

    /* renamed from: b */
    public final Map f189977b;

    public cier(String str, Map map) {
        bmxy.m108582a(str, "policyName");
        this.f189976a = str;
        bmxy.m108582a(map, "rawConfigValue");
        this.f189977b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cier) {
            cier cier = (cier) obj;
            return this.f189976a.equals(cier.f189976a) && this.f189977b.equals(cier.f189977b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189976a, this.f189977b});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("policyName", this.f189976a);
        a.mo66885a("rawConfigValue", this.f189977b);
        return a.toString();
    }
}
