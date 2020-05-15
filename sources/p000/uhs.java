package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: uhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uhs {

    /* renamed from: a */
    public final Map f47660a = new HashMap();

    /* renamed from: b */
    public final Map f47661b = new HashMap();

    /* renamed from: a */
    public final void mo27491a(ujx ujx) {
        boolean z;
        boolean z2 = true;
        if (ujx != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        String i = ujx.mo27616i();
        sdo.m34959a((Object) i);
        sdo.m34970a(this.f47660a.get(i) == null);
        if (this.f47661b.get(ujx.mo27582b()) != null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        this.f47660a.put(i, ujx);
        this.f47661b.put(ujx.mo27582b(), ujx);
    }

    /* renamed from: a */
    public final boolean mo27492a(String str) {
        return this.f47660a.containsKey(str);
    }
}
