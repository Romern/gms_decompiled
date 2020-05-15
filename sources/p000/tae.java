package p000;

import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: tae */
final /* synthetic */ class tae implements Runnable {

    /* renamed from: a */
    private final taf f45546a;

    public tae(taf taf) {
        this.f45546a = taf;
    }

    public final void run() {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45546a.f45547a;
        Logger Logger = ApiConsentChimeraActivity.f30509a;
        apiConsentChimeraActivity.f30512d = 7;
        apiConsentChimeraActivity.finish();
    }
}
