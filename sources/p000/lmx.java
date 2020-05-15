package p000;

import android.app.PendingIntent;
import android.content.IntentSender;

/* renamed from: lmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lnb f26422a;

    public lmx(lnb lnb) {
        this.f26422a = lnb;
    }

    /* renamed from: a */
    public final void mo6480a(bmxv bmxv) {
        if (bmxv.mo66813a()) {
            try {
                this.f26422a.f26159a.startIntentSenderForResult(((PendingIntent) bmxv.mo66814b()).getIntentSender(), 1, null, 0, 0, 0);
                this.f26422a.f26160b.putBoolean("api_resolution_started", true);
            } catch (IntentSender.SendIntentException e) {
                bnsl bnsl = (bnsl) lnb.f26430d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
                this.f26422a.mo15284h();
            }
        } else {
            this.f26422a.mo15284h();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lnb.f26430d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26422a.mo15284h();
    }
}
