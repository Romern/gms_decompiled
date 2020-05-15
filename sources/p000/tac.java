package p000;

import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: tac */
final /* synthetic */ class tac implements Runnable {

    /* renamed from: a */
    private final tad f45544a;

    public tac(tad tad) {
        this.f45544a = tad;
    }

    public final void run() {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45544a.f45545a;
        apiConsentChimeraActivity.f30512d = 0;
        apiConsentChimeraActivity.finish();
    }
}
