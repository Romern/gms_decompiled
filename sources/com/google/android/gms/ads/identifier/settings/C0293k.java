package com.google.android.gms.ads.identifier.settings;

import java.util.HashMap;

/* renamed from: com.google.android.gms.ads.identifier.settings.k */
final /* synthetic */ class C0293k implements bqeh {

    /* renamed from: a */
    private final C0299q f8033a;

    public C0293k(C0299q qVar) {
        this.f8033a = qVar;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        C0299q qVar = this.f8033a;
        bqgy c = bqgy.m112818c();
        byte[] k = ((bsug) obj).mo73642k();
        bsuh bsuh = bsuh.f147125b;
        c.getClass();
        C0295m mVar = new C0295m(c);
        c.getClass();
        sia sia = new sia(1, "https://deviceintegritytokens-pa.googleapis.com/v1/getAdEventToken?alt=PROTO&key=AIzaSyA8mcvQcsqT5QLTUyhjjH_DeDkTqP9u2_w", k, bsuh, mVar, new C0296n(c), null, null, false, new HashMap(), 22272, -1);
        c.mo741a(new C0297o(c, sia), qVar.f8042b);
        qVar.f8041a.add(sia);
        return c;
    }
}
