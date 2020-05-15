package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: yfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfz {

    /* renamed from: a */
    private final Map f53746a;

    public yfz(Map map) {
        this.f53746a = map;
    }

    /* renamed from: a */
    public final Set mo30454a() {
        return this.f53746a.keySet();
    }

    /* renamed from: a */
    public final yhe mo30455a(caae caae) {
        yhe yhe = (yhe) this.f53746a.get(caae);
        bmxy.m108605b(yhe != null, "Asking for limit for unused data source: %s", caae);
        bmzs.m108696a(yhe);
        return yhe;
    }
}
