package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: actb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actb {

    /* renamed from: a */
    private final Map f60716a = new HashMap();

    /* renamed from: b */
    private final Map f60717b = new HashMap();

    public actb(abqe abqe) {
        bxwc bxwc = abqe.f57955e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abqd abqd = (abqd) bxwc.get(i);
            Map map = this.f60716a;
            abqo abqo = abqd.f57948d;
            map.put((abqo == null ? abqo.f57975r : abqo).f57978b, abqd);
            Map map2 = this.f60717b;
            abqo abqo2 = abqd.f57948d;
            if (abqo2 == null) {
                abqo2 = abqo.f57975r;
            }
            map2.put(abqo2.f57988m, abqd);
        }
    }

    /* renamed from: a */
    public final String mo33067a(String str) {
        abqd abqd = (abqd) this.f60716a.get(str);
        return abqd != null ? abqd.f57947c.mo73781l() : "";
    }

    /* renamed from: b */
    public final String mo33068b(String str) {
        return mo33069c(str).mo73781l();
    }

    /* renamed from: c */
    public final bxtx mo33069c(String str) {
        abqd abqd = (abqd) this.f60717b.get(str);
        return abqd == null ? bxtx.f164797b : abqd.f57947c;
    }
}
