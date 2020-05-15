package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bcxg */
final /* synthetic */ class bcxg implements bmxj {

    /* renamed from: a */
    static final bmxj f105099a = new bcxg();

    private bcxg() {
    }

    public final Object apply(Object obj) {
        bmxv bmxv;
        bmxv bmxv2;
        HashMap hashMap = (HashMap) obj;
        try {
            bczv bczv = bczv.STACK_COMPONENT;
            int ordinal = ((bczv) hashMap.get("TYPE")).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    bmxv = bmvz.f131120a;
                } else {
                    bmxv = bmxv.m108566b(bcyd.m90238a((bdad) bcxl.m90209a((HashMap) hashMap.get("UI_ELEMENT")).mo66814b()));
                }
                return (bczy) bmxv.mo66814b();
            }
            HashMap hashMap2 = (HashMap) hashMap.get("STACK_COMPONENT");
            try {
                bczw b = bczx.m90397b();
                b.mo57811a(bbow.m88303c((ArrayList) hashMap2.get("ELEMENTS"), bcxk.f105102a));
                bmxv2 = bmxv.m108566b(b.mo57810a());
            } catch (Exception e) {
                bbos.m88292b("UiComponentConverters", "failed to convert HashMap to StackComponent", e);
                bmxv2 = bmvz.f131120a;
            }
            bmxv = bmxv.m108566b(bcyd.m90237a((bczx) bmxv2.mo66814b()));
            return (bczy) bmxv.mo66814b();
        } catch (Exception e2) {
            bbos.m88292b("UiComponentConverters", "failed to convert HashMap to UiComponent", e2);
            bmxv = bmvz.f131120a;
        }
    }
}
