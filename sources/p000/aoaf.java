package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: aoaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoaf implements anus {

    /* renamed from: a */
    final /* synthetic */ aoah f78008a;

    public aoaf(aoah aoah) {
        this.f78008a = aoah;
    }

    /* renamed from: a */
    public final void mo42299a(ConnectionResult connectionResult, anta anta) {
        aoah aoah = this.f78008a;
        aoah.f78019j = false;
        Activity activity = aoah.getActivity();
        if (activity != null) {
            aoah aoah2 = this.f78008a;
            aoah2.mo42512a(aoah2.f78022m);
            if (!connectionResult.mo17671b()) {
                activity.showDialog(1);
                activity.setResult(0);
                return;
            }
            activity.setResult(-1);
        }
    }
}
