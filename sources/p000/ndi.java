package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ndi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndi {

    /* renamed from: a */
    public static final lvn f35336a = new lvn("BlacklistedInfoRequestProcessor");

    /* renamed from: b */
    public final Map f35337b = new HashMap();

    /* renamed from: c */
    private final lvp f35338c;

    public ndi(lvp lvp) {
        this.f35338c = lvp;
    }

    /* renamed from: a */
    public final void mo20490a(ltq ltq) {
        sdo.m34959a(ltq);
        bxwc bxwc = ltq.f32980h;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ltj ltj = (ltj) bxwc.get(i);
            this.f35337b.put(ltj.f32943a, ltj);
            if (ssw.m36269a()) {
                bngs j = bngx.m109377j();
                j.mo67666b((Iterable) ltj.f32944b);
                j.mo67666b((Iterable) ltj.f32945c);
                bngx a = j.mo67664a();
                lvn lvn = f35336a;
                String valueOf = String.valueOf(ltj.f32943a);
                lvn.mo25414c(valueOf.length() == 0 ? new String("Excluding keys with backup manager for package: ") : "Excluding keys with backup manager for package: ".concat(valueOf), new Object[0]);
                this.f35338c.f33054a.excludeKeysFromRestore(ltj.f32943a, a);
            }
        }
    }
}
