package p000;

import android.net.ConnectivityManager;

/* renamed from: afbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbu implements ConnectivityManager.OnTetheringEntitlementResultListener {

    /* renamed from: a */
    final /* synthetic */ afbx f64159a;

    public afbu(afbx afbx) {
        this.f64159a = afbx;
    }

    public final void onTetheringEntitlementResult(int i) {
        int i2;
        afbx afbx = this.f64159a;
        if (!afbx.f64161a.isCancelled()) {
            afba afba = afbx.f64162b;
            long j = afan.f64089a;
            if (i != 0) {
                i2 = i != 11 ? i != 14 ? 0 : 3 : 2;
            } else {
                i2 = 1;
            }
            afba.mo34726d(i2);
            afbx.f64161a.mo69138b(Integer.valueOf(i));
        }
    }
}
