package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: uhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uhq {

    /* renamed from: a */
    public final uos f47655a;

    /* renamed from: b */
    public final uhs f47656b = new uhs();

    /* renamed from: c */
    public final Map f47657c = new HashMap();

    public uhq(uos uos) {
        sdo.m34959a(uos);
        this.f47655a = uos;
    }

    /* renamed from: a */
    public final void mo27487a(ujp ujp) {
        String str = ujp.f47810b;
        sdo.m34959a((Object) str);
        sdo.m34970a(this.f47657c.get(str) == null);
        this.f47657c.put(str, ujp);
    }

    /* renamed from: a */
    public final boolean mo27488a(String str) {
        return this.f47657c.containsKey(str);
    }
}
