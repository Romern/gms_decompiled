package p000;

import org.json.JSONObject;

/* renamed from: azsq */
final /* synthetic */ class azsq implements bmxj {

    /* renamed from: a */
    private final azto f99986a;

    /* renamed from: b */
    private final String f99987b;

    public azsq(azto azto, String str) {
        this.f99986a = azto;
        this.f99987b = str;
    }

    public final Object apply(Object obj) {
        azto azto = this.f99986a;
        String str = this.f99987b;
        azqf.m86130a(azto.f99942a);
        bmxv a = azqf.m86131a((bdar) obj);
        if (a.mo66813a() && ((bmxv) a.mo66814b()).mo66813a()) {
            new Object[1][0] = str;
            bmxv a2 = azbj.m85193a(azto.f99942a).mo54564d().mo56315a((bctr) ((bmxv) a.mo66814b()).mo66814b());
            if (a2.mo66813a()) {
                azqf.m86130a(azto.f99942a);
                return azqf.m86140a((JSONObject) a2.mo66814b());
            }
        }
        azoj.m85933c("LTWebAppInterface", "Could not get message for %s", str);
        azph.m85998a(azto.f99942a).mo55173d(1556, 63, str);
        azqf.m86130a(azto.f99942a);
        return azqf.m86138a("Could not get message for %s", str);
    }
}
