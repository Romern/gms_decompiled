package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brod implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143058a;

    /* renamed from: b */
    final /* synthetic */ brph f143059b;

    public brod(brph brph, brpj brpj) {
        this.f143059b = brph;
        this.f143058a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrq brrq = (brrq) obj;
        this.f143059b.m114351a(new GetTokenResponse(brrq.f143270b, brrq.f143269a, Long.valueOf(brrq.f143271c), "Bearer"), null, null, Boolean.valueOf(brrq.f143272d), null, this.f143058a, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143058a.mo69680a(brrv.m114516a(str));
    }
}
