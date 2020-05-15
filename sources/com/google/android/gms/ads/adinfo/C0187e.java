package com.google.android.gms.ads.adinfo;

import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: com.google.android.gms.ads.adinfo.e */
final /* synthetic */ class C0187e implements bmxj {

    /* renamed from: a */
    static final bmxj f7831a = new C0187e();

    private C0187e() {
    }

    public final Object apply(Object obj) {
        C0271c cVar = (C0271c) obj;
        bxvd da = C0152c.f7500Q.mo74144da();
        String str = cVar.f7985a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0152c cVar2 = (C0152c) da.f164949b;
        str.getClass();
        int i = cVar2.f7520c | 128;
        cVar2.f7520c = i;
        cVar2.f7513L = str;
        boolean z = cVar.f7986b;
        cVar2.f7520c = i | 512;
        cVar2.f7515N = z;
        C0152c cVar3 = (C0152c) da.f164949b;
        cVar3.f7514M = 5;
        cVar3.f7520c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return (C0152c) da.mo74062i();
    }
}
