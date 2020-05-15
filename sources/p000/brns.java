package p000;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brns implements brpv {

    /* renamed from: a */
    final /* synthetic */ EmailAuthCredential f143030a;

    /* renamed from: b */
    final /* synthetic */ brpj f143031b;

    /* renamed from: c */
    final /* synthetic */ brph f143032c;

    public brns(brph brph, EmailAuthCredential emailAuthCredential, brpj brpj) {
        this.f143032c = brph;
        this.f143030a = emailAuthCredential;
        this.f143031b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        this.f143032c.mo69753a(new brqc(this.f143030a, ((GetTokenResponse) obj).f152527b), this.f143031b);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143031b.mo69680a(brrv.m114516a(str));
    }
}
