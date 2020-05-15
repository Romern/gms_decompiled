package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class csb {

    /* renamed from: a */
    public final cte f11909a;

    /* renamed from: b */
    public final Map f11910b;

    public csb(Map map, cte cte) {
        this.f11909a = cte;
        this.f11910b = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final byte[] mo8203a(csx csx) {
        cta cta = (cta) this.f11910b.get(csx);
        return cta == null ? new byte[0] : cta.mo8237a();
    }
}
