package p000;

import java.util.HashMap;

/* renamed from: bcbg */
final /* synthetic */ class bcbg implements bmxj {

    /* renamed from: a */
    static final bmxj f103931a = new bcbg();

    private bcbg() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        bcor c = bcos.m89522c();
        if (hashMap.containsKey("REACTION_OVERLAY_HEADER")) {
            bmxv a = bbot.m88295a(bbqu.m88420a(hashMap.get("REACTION_OVERLAY_HEADER")), bcbi.f103933a);
            if (!a.mo66813a()) {
                return bmvz.f131120a;
            }
            c.mo57106a((bctn) a.mo66814b());
        }
        if (hashMap.containsKey("STACKED_REACTION_WEB_VIEW")) {
            bmxv a2 = bbqu.m88420a(hashMap.get("STACKED_REACTION_WEB_VIEW"));
            if (a2.mo66813a()) {
                bmxv a3 = bbot.m88295a(bbqu.m88420a(((HashMap) a2.mo66814b()).get("WEB_VIEW_HEADER")), bcbj.f103934a);
                if (!a3.mo66813a()) {
                    return bmvz.f131120a;
                }
                bcsw c2 = bcsx.m89862c();
                c2.mo57486a((String) ((HashMap) a2.mo66814b()).get("URL"));
                c2.mo57485a((bctn) a3.mo66814b());
                c.mo57105a(c2.mo57484a());
            }
        }
        return bmxv.m108566b(c.mo57104a());
    }
}
