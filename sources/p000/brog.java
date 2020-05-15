package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brog implements brpv {

    /* renamed from: a */
    final /* synthetic */ brrp f143066a;

    /* renamed from: b */
    final /* synthetic */ Context f143067b;

    /* renamed from: c */
    final /* synthetic */ brpj f143068c;

    /* renamed from: d */
    final /* synthetic */ brph f143069d;

    public brog(brph brph, brrp brrp, Context context, brpj brpj) {
        this.f143069d = brph;
        this.f143066a = brrp;
        this.f143067b = context;
        this.f143068c = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrp brrp = this.f143066a;
        brrp.f143266g = ((GetTokenResponse) obj).f152527b;
        this.f143069d.f143125b.mo69778a(this.f143067b, brrp, new brof(this, this));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143068c.mo69680a(brrv.m114516a(str));
    }
}
