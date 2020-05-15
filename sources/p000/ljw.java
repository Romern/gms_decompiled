package p000;

import android.app.PendingIntent;
import android.content.IntentSender;

/* renamed from: ljw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ ljz f26230a;

    public ljw(ljz ljz) {
        this.f26230a = ljz;
    }

    /* renamed from: a */
    public final void mo6480a(bmxv bmxv) {
        if (bmxv.mo66813a()) {
            try {
                this.f26230a.f26159a.startIntentSenderForResult(((PendingIntent) bmxv.mo66814b()).getIntentSender(), 1, null, 0, 0, 0);
                this.f26230a.f26160b.putBoolean("api_resolution_started", true);
            } catch (IntentSender.SendIntentException e) {
                bnsl bnsl = (bnsl) ljz.f26233d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
                this.f26230a.mo15210h();
            }
        } else {
            this.f26230a.mo15210h();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) ljz.f26233d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26230a.mo15210h();
    }
}
