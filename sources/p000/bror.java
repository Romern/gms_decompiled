package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: bror */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bror implements brpv {

    /* renamed from: a */
    final /* synthetic */ brqe f143091a;

    /* renamed from: b */
    final /* synthetic */ Context f143092b;

    /* renamed from: c */
    final /* synthetic */ brpj f143093c;

    /* renamed from: d */
    final /* synthetic */ brph f143094d;

    public bror(brph brph, brqe brqe, Context context, brpj brpj) {
        this.f143094d = brph;
        this.f143091a = brqe;
        this.f143092b = context;
        this.f143093c = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brqe brqe = this.f143091a;
        brqe.f143161a = ((GetTokenResponse) obj).f152527b;
        brpw brpw = this.f143094d.f143125b;
        brpw.mo69774a(brqe, new brqf(), cdyc.m135275c(), "mfaEnrollment:finalize").mo50371a(new brlq(brpw, this.f143092b, new broq(this), brqe));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143093c.mo69680a(brrv.m114516a(str));
    }
}
