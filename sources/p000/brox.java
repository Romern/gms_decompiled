package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brox implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143105a;

    /* renamed from: b */
    final /* synthetic */ brph f143106b;

    public brox(brph brph, brpj brpj) {
        this.f143106b = brph;
        this.f143105a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brqb brqb = new brqb(((GetTokenResponse) obj).f152527b);
        brpw brpw = this.f143106b.f143125b;
        brow brow = new brow(this, this);
        brpw.m114444a(brpw.f143143c, brpw.f143141a, brpw.mo69776a(brpw.mo69777a(cdxz.m135248c(), "deleteAccount"), brqb.mo69786a().serializeToBytes(), (String) null), (bxxk) null).mo50382b(new brlw()).mo50371a(new brln(brow));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143105a.mo69680a(brrv.m114516a(str));
    }
}
