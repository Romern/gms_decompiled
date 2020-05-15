package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: anzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzz implements rka {

    /* renamed from: a */
    final /* synthetic */ aoac f77969a;

    public anzz(aoac aoac) {
        this.f77969a = aoac;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        int i = connectionResult.f30065c;
        if (i == 6 || i == 4) {
            aoac aoac = this.f77969a;
            aoac.f78003x = true;
            aoac.f77996q.mo42332x();
            this.f77969a.f77999t = connectionResult;
        }
    }
}
