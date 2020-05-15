package p000;

import android.app.PendingIntent;
import android.content.IntentSender;

/* renamed from: lma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lma implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lmf f26358a;

    public lma(lmf lmf) {
        this.f26358a = lmf;
    }

    /* renamed from: a */
    public final void mo6480a(bmxv bmxv) {
        if (bmxv.mo66813a()) {
            try {
                this.f26358a.f26159a.startIntentSenderForResult(((PendingIntent) bmxv.mo66814b()).getIntentSender(), 1, null, 0, 0, 0);
                this.f26358a.f26160b.putBoolean("api_resolution_started", true);
            } catch (IntentSender.SendIntentException e) {
                bnsl bnsl = (bnsl) lmf.f26366d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
                this.f26358a.mo15267h();
            }
        } else {
            this.f26358a.mo15267h();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lmf.f26366d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26358a.mo15267h();
    }
}
