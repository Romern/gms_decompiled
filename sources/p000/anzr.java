package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzr implements anus {

    /* renamed from: a */
    final /* synthetic */ anzs f77960a;

    public anzr(anzs anzs) {
        this.f77960a = anzs;
    }

    /* renamed from: a */
    public final void mo42299a(ConnectionResult connectionResult, anta anta) {
        anzs anzs = this.f77960a;
        if (anzs.f77943a) {
            anzs.f77943a = false;
            anzs.f77945c.refreshDrawableState();
        }
        if (connectionResult.mo17671b() && anta != null) {
            this.f77960a.mo42495a(anta);
            this.f77960a.mo42494a();
            this.f77960a.setTag((Intent) anta.f77709a.getParcelable("intent"));
            return;
        }
        Log.w("PlusOneButtonView", "PlusOne failed to load");
        this.f77960a.mo42497b();
    }
}
