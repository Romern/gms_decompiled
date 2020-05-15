package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cicz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cicz {

    /* renamed from: a */
    public final Map f189870a;

    /* renamed from: b */
    public final Map f189871b;

    /* renamed from: c */
    public final Object f189872c;

    /* renamed from: d */
    public final Map f189873d;

    public cicz(Map map, Map map2, Object obj, Map map3) {
        this.f189870a = Collections.unmodifiableMap(new HashMap(map));
        this.f189871b = Collections.unmodifiableMap(new HashMap(map2));
        this.f189872c = obj;
        this.f189873d = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cicz cicz = (cicz) obj;
            return bmxi.m108538a(this.f189870a, cicz.f189870a) && bmxi.m108538a(this.f189871b, cicz.f189871b) && bmxi.m108538a(null, null) && bmxi.m108538a(this.f189872c, cicz.f189872c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189870a, this.f189871b, null, this.f189872c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("serviceMethodMap", this.f189870a);
        a.mo66885a("serviceMap", this.f189871b);
        a.mo66885a("retryThrottling", (Object) null);
        a.mo66885a("loadBalancingConfig", this.f189872c);
        return a.toString();
    }
}
