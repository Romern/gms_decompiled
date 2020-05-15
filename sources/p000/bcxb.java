package p000;

import java.util.HashMap;

/* renamed from: bcxb */
final /* synthetic */ class bcxb implements bmxj {

    /* renamed from: a */
    static final bmxj f105094a = new bcxb();

    private bcxb() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bczm h = bczn.m90361h();
            if (hashMap.containsKey("LIGHTER_ICON")) {
                bbot.m88296a(bccb.m88792a((HashMap) hashMap.get("LIGHTER_ICON")), new bcxc(h));
            }
            h.mo57795a((String) hashMap.get("TEXT"));
            h.mo57793a((bcov) bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION")), bcxd.f105096a).mo66814b());
            h.mo57798c(((Integer) hashMap.get("TEXT_COLOR")).intValue());
            h.mo57792a(((Integer) hashMap.get("BACKGROUND_COLOR")).intValue());
            h.mo57797b(((Integer) hashMap.get("BORDER_COLOR")).intValue());
            h.mo57796a(((Boolean) hashMap.get("ENABLED")).booleanValue());
            return bmxv.m108566b(h.mo57791a());
        } catch (IllegalStateException | NullPointerException e) {
            bbos.m88292b("RCButtonsConverters", "failed to convert Map to RichCardButton", e);
            return bmvz.f131120a;
        }
    }
}
