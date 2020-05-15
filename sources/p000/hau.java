package p000;

import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: hau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hau implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hav f19361a;

    public hau(hav hav) {
        this.f19361a = hav;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f19361a.f19363b.mo12368a(haz.m14156a((SignInCredential) obj));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f19361a.f19363b.mo12368a(haz.m14158b("Unable to get token."));
    }
}
