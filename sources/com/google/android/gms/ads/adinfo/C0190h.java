package com.google.android.gms.ads.adinfo;

import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.gms.ads.adinfo.h */
final /* synthetic */ class C0190h implements bmxj {

    /* renamed from: a */
    private final String f7835a;

    public C0190h(String str) {
        this.f7835a = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(byte[], boolean):java.lang.String
     arg types: [byte[], int]
     candidates:
      dab.a(java.lang.String, boolean):byte[]
      dab.a(byte[], boolean):java.lang.String */
    public final Object apply(Object obj) {
        String str;
        String str2 = this.f7835a;
        bxvd da = C0152c.f7500Q.mo74144da();
        for (C0152c cVar : (List) obj) {
            if (cVar != null) {
                try {
                    da.mo73635b(cVar.mo73642k(), bxus.m123744c());
                } catch (bxwf e) {
                }
            }
        }
        byte[] a = dae.m8081a(str2, new String(((C0152c) da.mo74062i()).mo73642k(), Charset.forName("ISO-8859-1")));
        if (a != null) {
            str = dab.m8076a(a, true);
        } else {
            str = Integer.toString(7);
        }
        C0633h.m5664a("Merged client and gmscore signals");
        return str;
    }
}
