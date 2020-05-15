package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: aoag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoag implements anuw {

    /* renamed from: a */
    final /* synthetic */ aoah f78009a;

    public aoag(aoah aoah) {
        this.f78009a = aoah;
    }

    /* renamed from: a */
    public final void mo42303a(ConnectionResult connectionResult, antb antb) {
        aoah aoah = this.f78009a;
        aoah.f78021l = false;
        Activity activity = aoah.getActivity();
        if (activity != null) {
            if (connectionResult.mo17671b() && antb != null) {
                this.f78009a.f78017h = antb;
            } else if (this.f78009a.f78017h == null) {
                activity.showDialog(1);
                activity.setResult(0);
            }
            aoah aoah2 = this.f78009a;
            aoah2.mo42514a(aoah2.f78017h);
            aoah aoah3 = this.f78009a;
            aoah3.mo42512a(aoah3.f78022m);
        }
    }
}
