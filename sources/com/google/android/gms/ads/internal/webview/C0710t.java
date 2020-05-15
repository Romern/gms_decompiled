package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.clearcut.C0326a;
import com.google.android.gms.ads.internal.clearcut.C0332g;
import com.google.android.gms.ads.internal.clearcut.C0333h;

/* renamed from: com.google.android.gms.ads.internal.webview.t */
final /* synthetic */ class C0710t implements C0326a {

    /* renamed from: a */
    private final boolean f9065a;

    /* renamed from: b */
    private final int f9066b;

    public C0710t(boolean z, int i) {
        this.f9065a = z;
        this.f9066b = i;
    }

    /* renamed from: a */
    public final void mo6565a(bxvd bxvd) {
        boolean z = this.f9065a;
        int i = this.f9066b;
        int i2 = C0712v.f9068a;
        bxvd da = C0333h.f8108d.mo74144da();
        if (((C0333h) da.f164949b).f8111b != z) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0333h hVar = (C0333h) da.f164949b;
            hVar.f8110a |= 1;
            hVar.f8111b = z;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0333h hVar2 = (C0333h) da.f164949b;
        hVar2.f8110a |= 2;
        hVar2.f8112c = i;
        C0333h hVar3 = (C0333h) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0332g gVar = (C0332g) bxvd.f164949b;
        C0332g gVar2 = C0332g.f8102e;
        hVar3.getClass();
        gVar.f8107d = hVar3;
        gVar.f8104a |= 1024;
    }
}
