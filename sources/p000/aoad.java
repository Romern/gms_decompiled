package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: aoad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoad implements anus {

    /* renamed from: a */
    final /* synthetic */ aoah f78006a;

    public aoad(aoah aoah) {
        this.f78006a = aoah;
    }

    /* renamed from: a */
    public final void mo42299a(ConnectionResult connectionResult, anta anta) {
        Activity activity = this.f78006a.getActivity();
        if (activity == null) {
            return;
        }
        if (anta != null && connectionResult.mo17671b()) {
            this.f78006a.f78014e = anta.mo42212b();
            aoah aoah = this.f78006a;
            aoah.f78018i = false;
            aoah.f78015f.mo42316a(aoah.f78024o, aoah.f78011b, aoah.f78014e);
            return;
        }
        activity.showDialog(1);
        activity.setResult(0);
    }
}
