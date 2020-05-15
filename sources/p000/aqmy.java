package p000;

import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqmy implements bqfp {

    /* renamed from: a */
    final /* synthetic */ long f86382a;

    /* renamed from: b */
    final /* synthetic */ SignInChimeraActivity f86383b;

    public aqmy(SignInChimeraActivity signInChimeraActivity, long j) {
        this.f86383b = signInChimeraActivity;
        this.f86382a = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        SignInChimeraActivity signInChimeraActivity = this.f86383b;
        signInChimeraActivity.mo58980a(this.f86382a, signInChimeraActivity.f107680d, true);
        if (bmxv.mo66813a()) {
            this.f86383b.f107680d = ((Integer) bmxv.mo66814b()).intValue();
            this.f86383b.mo58981e();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        SignInChimeraActivity signInChimeraActivity = this.f86383b;
        signInChimeraActivity.mo58980a(this.f86382a, signInChimeraActivity.f107680d, false);
        this.f86383b.mo58979a(0, null);
    }
}
