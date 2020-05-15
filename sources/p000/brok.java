package p000;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: brok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brok implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpv f143077a;

    /* renamed from: b */
    final /* synthetic */ GetTokenResponse f143078b;

    /* renamed from: c */
    final /* synthetic */ brol f143079c;

    public brok(brol brol, brpv brpv, GetTokenResponse getTokenResponse) {
        this.f143079c = brol;
        this.f143077a = brpv;
        this.f143078b = getTokenResponse;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        List b = ((GetAccountInfoResponse) obj).mo72410b();
        if (b == null || b.isEmpty()) {
            this.f143077a.mo69750a("No users.");
            return;
        }
        GetAccountInfoUser getAccountInfoUser = (GetAccountInfoUser) b.get(0);
        brra brra = new brra();
        brra.mo69812c(this.f143078b.f152527b);
        String str = this.f143079c.f143080a;
        sdo.m34977c(str);
        brra.f143207e.f152555b.add(str);
        brol brol = this.f143079c;
        brol.f143082c.mo69752a(brol.f143081b, this.f143078b, getAccountInfoUser, brra, this.f143077a);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143079c.f143081b.mo69680a(brrv.m114516a(str));
    }
}
