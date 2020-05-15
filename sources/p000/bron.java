package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: bron */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bron implements brpv {

    /* renamed from: a */
    final /* synthetic */ String f143084a;

    /* renamed from: b */
    final /* synthetic */ brpj f143085b;

    /* renamed from: c */
    final /* synthetic */ brph f143086c;

    public bron(brph brph, String str, brpj brpj) {
        this.f143086c = brph;
        this.f143084a = str;
        this.f143085b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrr brrr = new brrr(((GetTokenResponse) obj).f152527b, this.f143084a);
        this.f143086c.f143125b.mo69774a(brrr, new brrs(), cdyc.m135275c(), "mfaEnrollment:withdraw").mo50371a(new brlr(new brom(this)));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143085b.mo69680a(brrv.m114516a(str));
    }
}
