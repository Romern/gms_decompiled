package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzu implements anus {

    /* renamed from: a */
    final /* synthetic */ aoac f77965a;

    public anzu(aoac aoac) {
        this.f77965a = aoac;
    }

    /* renamed from: a */
    public final void mo42299a(ConnectionResult connectionResult, anta anta) {
        aoac aoac = this.f77965a;
        if (aoac.f77943a) {
            aoac.f77943a = false;
            aoac.f77945c.refreshDrawableState();
        }
        if (connectionResult.mo17671b() && anta != null) {
            aoac aoac2 = this.f77965a;
            aoac2.f77998s = anta;
            aoac2.mo42495a(aoac2.f77998s);
            this.f77965a.mo42494a();
        } else {
            Log.w("PlusOneButtonView", "PlusOne failed to load");
            this.f77965a.mo42497b();
        }
        this.f77965a.f78001v = false;
    }
}
