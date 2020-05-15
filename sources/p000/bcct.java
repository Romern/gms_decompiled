package p000;

import java.util.HashMap;

/* renamed from: bcct */
final /* synthetic */ class bcct implements bmxj {

    /* renamed from: a */
    static final bmxj f103962a = new bcct();

    private bcct() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bcur f = bcus.m90057f();
            f.mo57572a(((Integer) hashMap.get("ID")).intValue());
            f.mo57576b((String) hashMap.get("TEXT"));
            f.mo57575a((String) hashMap.get("SECONDARY_TEXT"));
            if (hashMap.containsKey("LIGHTER_ICON")) {
                bbot.m88296a(bccb.m88792a((HashMap) hashMap.get("LIGHTER_ICON")), new bccv(f));
            }
            return bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION")), bccw.f103965a).mo66810a((bmxj) new bccx(f));
        } catch (IllegalStateException | NullPointerException e) {
            bbos.m88294d("ChipsListConverters", "failed to convert HashMap to Suggestion");
            return bmvz.f131120a;
        }
    }
}
