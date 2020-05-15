package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bcxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcxi {
    /* renamed from: a */
    public static bmxv m90208a(HashMap hashMap) {
        bmxv bmxv;
        try {
            int i = bczj.STACK_CARD.f105184d;
            if (hashMap.containsKey("TYPE")) {
                i = ((Integer) hashMap.get("TYPE")).intValue();
            }
            bczj a = bczj.m90341a(i);
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                bmxv a2 = bbqu.m88420a(hashMap.get("STACK_CARD"));
                if (a2.mo66813a()) {
                    HashMap hashMap2 = (HashMap) a2.mo66814b();
                    try {
                        bczp b = bczq.m90376b();
                        b.mo57800a(bbow.m88301a((ArrayList) hashMap2.get("COMPONENTS"), bcxg.f105099a));
                        bmxv = bmxv.m108566b(b.mo57799a());
                    } catch (Exception e) {
                        bbos.m88292b("RichCardConverters", "failed to convert HashMap to StackCard", e);
                        bmxv = bmvz.f131120a;
                    }
                    return bmxv.m108566b(bczk.m90343a((bczq) bmxv.mo66814b()));
                }
                bbos.m88294d("RichCardConverters", "failed to convert HashMap to RichCard");
            } else if (ordinal == 1) {
                bmxv a3 = bczs.m90382a((String) hashMap.get("STANDALONE_CARD"));
                if (a3.mo66813a()) {
                    return bmxv.m108566b(bczk.m90344a((bczs) a3.mo66814b()));
                }
                bbos.m88294d("RichCardConverters", "failed to convert HashMap to RichCard");
            } else if (ordinal == 2) {
                bmxv a4 = bcyz.m90299a((String) hashMap.get("CARD_CAROUSEL"));
                if (a4.mo66813a()) {
                    return bmxv.m108566b(bczk.m90342a((bcyz) a4.mo66814b()));
                }
                bbos.m88294d("RichCardConverters", "failed to convert HashMap to RichCard");
            }
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append("failed to convert HashMap to RichCard, unsupported type: ");
            sb.append(valueOf);
            bbos.m88294d("RichCardConverters", sb.toString());
            return bmvz.f131120a;
        } catch (Exception e2) {
            bbos.m88292b("RichCardConverters", "failed to convert HashMap to RichCard", e2);
            return bmvz.f131120a;
        }
    }
}
