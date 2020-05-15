package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnr {

    /* renamed from: a */
    public static final long f39872a = ccxy.f180226a.mo6606a().mo77039a();

    /* renamed from: b */
    public pnm f39873b;

    /* renamed from: c */
    public final Map f39874c = new HashMap();

    /* renamed from: d */
    public final Map f39875d = new HashMap();

    /* renamed from: a */
    public final Collection mo23505a() {
        return Collections.unmodifiableCollection(this.f39875d.values());
    }

    /* renamed from: a */
    public final void mo23506a(String str, pnm pnm) {
        this.f39875d.put(str.replace(":", ""), pnm);
    }

    /* renamed from: a */
    public final void mo23507a(pnp pnp) {
        this.f39874c.put(pnp.f39862a, pnp);
    }
}
