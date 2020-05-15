package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bccr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bccr {
    /* renamed from: a */
    public static bmxv m88800a(HashMap hashMap) {
        try {
            bngx c = bbow.m88303c((ArrayList) hashMap.get("FORMATTED_LINES"), bccm.f103956a);
            if (c.isEmpty()) {
                return bmvz.f131120a;
            }
            bctz c2 = bcuo.m90042c();
            c2.mo57558a(c);
            return bmxv.m108566b(c2.mo57557a());
        } catch (Exception e) {
            bbos.m88294d("RichTextConverters", "failed to convert HashMap to RichText");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static HashMap m88801a(bcuo bcuo) {
        HashMap hashMap = new HashMap();
        hashMap.put("FORMATTED_LINES", bbow.m88302b(bcuo.mo57034a(), bcch.f103951a));
        return hashMap;
    }
}
