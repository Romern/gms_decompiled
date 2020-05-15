package p000;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwf implements aubq {

    /* renamed from: a */
    final /* synthetic */ jwm f23397a;

    /* renamed from: b */
    final /* synthetic */ long f23398b;

    public jwf(jwm jwm, long j) {
        this.f23397a = jwm;
        this.f23398b = j;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        this.f23397a.mo14169a();
        PreAddAccountChimeraActivity.f11420a.mo25409a("Phenotype registration took %dms", Long.valueOf(System.currentTimeMillis() - this.f23398b));
    }
}
