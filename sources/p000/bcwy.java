package p000;

import java.util.HashMap;

/* renamed from: bcwy */
final /* synthetic */ class bcwy implements bmxj {

    /* renamed from: a */
    static final bmxj f105091a = new bcwy();

    private bcwy() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bczb e = bczc.m90312e();
            bmxv a = bccb.m88792a((HashMap) hashMap.get("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON"));
            bmxv a2 = bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION")), bcww.f105089a);
            bcoo j = bcov.m89535j();
            j.mo57094c();
            e.mo57774a((bcov) a2.mo66812a(j.mo57085a()));
            e.mo57776a((String) hashMap.get("DISPLAY_TEXT"));
            e.mo57777a((byte[]) hashMap.get("ICON"));
            e.mo57775a(a.mo66813a() ? (bcsz) a.mo66814b() : bcsz.m89873h());
            return bmxv.m108566b(e.mo57773a());
        } catch (IllegalStateException | NullPointerException e2) {
            bbos.m88292b("HrzntlytBtnConverter", "failed to convert Map to VerticalLayoutButton", e2);
            return bmvz.f131120a;
        }
    }
}
