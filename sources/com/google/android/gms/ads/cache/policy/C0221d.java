package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.C0195a;
import com.google.android.gms.ads.cache.C0217p;

/* renamed from: com.google.android.gms.ads.cache.policy.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0221d implements C0222e {

    /* renamed from: a */
    private final C0217p f7922a;

    public C0221d(C0217p pVar) {
        this.f7922a = pVar;
    }

    /* renamed from: a */
    public final void mo6428a(C0195a aVar) {
        aVar.f7838a.mo6389a(this.f7922a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0221d) {
            return sdg.m34949a(this.f7922a, ((C0221d) obj).f7922a);
        }
        return false;
    }

    public final int hashCode() {
        C0217p pVar = this.f7922a;
        int i = pVar.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(pVar).mo74216a(pVar);
        pVar.f164758ag = a;
        return a;
    }
}
