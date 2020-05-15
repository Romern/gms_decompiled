package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: dwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwf {

    /* renamed from: a */
    public final HashMap f14258a = new HashMap();

    /* renamed from: b */
    public final ego f14259b = new ego();

    /* renamed from: c */
    public final bnot f14260c = bnge.m109299s();

    /* renamed from: d */
    public final bnot f14261d = bnge.m109299s();

    /* renamed from: a */
    public final Collection mo9766a() {
        if (!this.f14258a.isEmpty()) {
            return this.f14258a.values();
        }
        return null;
    }

    /* renamed from: a */
    public final Set mo9767a(drb drb) {
        if (this.f14260c.mo67271d(drb)) {
            return this.f14260c.mo67361a(drb);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo9768a(int i) {
        return this.f14259b.get(i) != null;
    }

    /* renamed from: a */
    public final boolean mo9769a(dvz dvz) {
        return this.f14258a.containsKey(dvz);
    }
}
