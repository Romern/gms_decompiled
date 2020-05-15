package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: anzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzw implements anuw {

    /* renamed from: a */
    final /* synthetic */ aoac f77966a;

    public anzw(aoac aoac) {
        this.f77966a = aoac;
    }

    /* renamed from: a */
    public final void mo42303a(ConnectionResult connectionResult, antb antb) {
        if (connectionResult.mo17671b() && antb != null) {
            aoac aoac = this.f77966a;
            aoac.f77997r = antb;
            aoac.f77995p.mo42315a(aoac.f78005z, aoac.f77949g);
            aoac aoac2 = this.f77966a;
            if (aoac2.f78002w) {
                aoac2.f77943a = false;
                aoac2.performClick();
                this.f77966a.f78002w = false;
            }
        }
    }
}
