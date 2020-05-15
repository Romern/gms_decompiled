package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpb implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143111a;

    /* renamed from: b */
    final /* synthetic */ brph f143112b;

    public brpb(brph brph, brpj brpj) {
        this.f143112b = brph;
        this.f143111a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrd brrd = (brrd) obj;
        this.f143112b.m114351a(new GetTokenResponse(brrd.f143221b, brrd.f143220a, Long.valueOf(brrd.f143222c), "Bearer"), null, null, true, null, this.f143111a, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143111a.mo69680a(brrv.m114516a(str));
    }
}
