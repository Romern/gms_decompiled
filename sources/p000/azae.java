package p000;

import java.util.Map;

@Deprecated
/* renamed from: azae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azae implements ayyi {

    /* renamed from: a */
    private final ayyi f98823a;

    /* renamed from: b */
    private final ayyi f98824b;

    /* renamed from: c */
    private final Map f98825c;

    public azae(ayyi ayyi, Map map) {
        ayyi ayyi2 = azad.f98822a;
        this.f98823a = ayyi2;
        this.f98824b = ayyi == null ? ayyi2 : ayyi;
        this.f98825c = map;
    }

    /* renamed from: d */
    private final ayyi m85128d(ayvw ayvw) {
        if (!(ayvw instanceof ayyd)) {
            return this.f98823a;
        }
        ayyd ayyd = (ayyd) ayvw;
        aywu b = ayyd.mo54526b();
        bxvj bxvj = azag.f98830a;
        Map map = bxvk.f164959aj;
        b.mo74135a(bxvj);
        if (!b.f164952m.mo73911a(bxvj.f164958d)) {
            return this.f98824b;
        }
        aywu b2 = ayyd.mo54526b();
        bxvj bxvj2 = azag.f98830a;
        b2.mo74135a(bxvj2);
        Object b3 = b2.f164952m.mo73913b(bxvj2.f164958d);
        if (b3 == null) {
            b3 = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b3);
        }
        String str = ((azaf) b3).f98828a;
        ayyi ayyi = (ayyi) this.f98825c.get(str);
        String valueOf = String.valueOf(str);
        bmxy.m108582a(ayyi, valueOf.length() == 0 ? new String("No config for: ") : "No config for: ".concat(valueOf));
        return ayyi;
    }

    /* renamed from: a */
    public final bqgg mo40446a(bqgg bqgg) {
        return this.f98824b.mo40446a(bqgg);
    }

    /* renamed from: b */
    public final bqgg mo40448b(ayvw ayvw) {
        return m85128d(ayvw).mo40448b(ayvw);
    }

    /* renamed from: c */
    public final bmxv mo40449c(ayvw ayvw) {
        return m85128d(ayvw).mo40449c(ayvw);
    }

    /* renamed from: a */
    public final String mo40447a(ayvw ayvw) {
        return m85128d(ayvw).mo40447a(ayvw);
    }
}
