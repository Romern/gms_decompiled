package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: beah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beah {

    /* renamed from: a */
    private final Map f106738a;

    /* renamed from: b */
    private final bdyw f106739b;

    public beah(bdyw bdyw, Map map) {
        this.f106738a = new ConcurrentHashMap(map);
        this.f106739b = bdyw;
    }

    /* renamed from: a */
    public final Object mo58476a(String str, Object obj, bdyv bdyv) {
        bdyx bdyx = (bdyx) this.f106738a.get(str);
        if (bdyx == null) {
            bdyx = bdyx.m91608a(this.f106739b, str, obj, bdyv);
            this.f106738a.put(str, bdyx);
        }
        return bdyx.mo58455c();
    }
}
