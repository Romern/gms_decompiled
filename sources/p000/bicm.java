package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bicm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicm {

    /* renamed from: a */
    public final Map f120221a = new HashMap();

    /* renamed from: b */
    private final Map f120222b = new HashMap();

    /* renamed from: a */
    public final void mo64519a(bico bico) {
        if (!this.f120222b.containsKey(bico)) {
            bjdg bjdg = new bjdg(bico.f120224a.f119280b, bico.f120225b, bico.f120226c, bico.mo62993a().f79574d, 2, -1, bico);
            bjdg.mo64158b();
            bjdg.f122543f.mo64538a();
            this.f120222b.put(bico, bjdg);
        }
    }

    /* renamed from: b */
    public final void mo64520b(bico bico) {
        bjdg bjdg = (bjdg) this.f120222b.remove(bico);
        if (bjdg != null) {
            bjdg.mo64159c();
            bjdg.f122543f.mo64538a();
        }
    }
}
