package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: rnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rnk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionResult f43383a;

    /* renamed from: b */
    final /* synthetic */ rnl f43384b;

    public rnk(rnl rnl, ConnectionResult connectionResult) {
        this.f43384b = rnl;
        this.f43383a = connectionResult;
    }

    public final void run() {
        rnl rnl = this.f43384b;
        rnm rnm = rnl.f43390f;
        Status status = rnm.f43391a;
        rni rni = (rni) rnm.f43402l.get(rnl.f43386b);
        if (rni == null) {
            return;
        }
        if (this.f43383a.mo17671b()) {
            rnl rnl2 = this.f43384b;
            rnl2.f43389e = true;
            if (!rnl2.f43385a.mo12787g()) {
                try {
                    rjm rjm = this.f43384b.f43385a;
                    rjm.mo24647a((scb) null, rjm.mo16786u());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f43384b.f43385a.mo14032j();
                    rni.mo7249a(new ConnectionResult(10));
                }
            } else {
                this.f43384b.mo24942a();
            }
        } else {
            rni.mo7249a(this.f43383a);
        }
    }
}
