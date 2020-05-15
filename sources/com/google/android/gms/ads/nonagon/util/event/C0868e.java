package com.google.android.gms.ads.nonagon.util.event;

import com.google.android.gms.ads.nonagon.clearcut.C0762k;
import com.google.android.gms.ads.nonagon.clearcut.C0763l;
import com.google.android.gms.ads.nonagon.p013ad.event.C0749b;
import com.google.android.gms.ads.nonagon.util.concurrent.C0856i;

/* renamed from: com.google.android.gms.ads.nonagon.util.event.e */
public final /* synthetic */ class C0868e implements C0749b {

    /* renamed from: a */
    private final C0856i f9403a;

    public C0868e(C0856i iVar) {
        this.f9403a = iVar;
    }

    /* renamed from: a */
    public final void mo7043a(Object obj) {
        C0763l lVar = (C0763l) obj;
        Object obj2 = this.f9403a.f9357a;
        if (lVar.f9176a.containsKey(obj2)) {
            lVar.f9177b.mo6566a(((C0762k) lVar.f9176a.get(obj2)).f9174b);
        }
    }
}
