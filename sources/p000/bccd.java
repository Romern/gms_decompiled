package p000;

import android.util.Base64;
import java.util.HashMap;

/* renamed from: bccd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bccd {
    /* renamed from: a */
    public static HashMap m88794a(bctb bctb) {
        HashMap hashMap = new HashMap();
        hashMap.put("MENU_NAME", bctb.mo57348a());
        hashMap.put("ACTION", bcbk.m88754a(bctb.mo57349b()));
        if (bctb.mo57350c().mo66813a()) {
            hashMap.put("ICON", Base64.encodeToString((byte[]) bctb.mo57350c().mo66814b(), 2));
        }
        return hashMap;
    }
}
