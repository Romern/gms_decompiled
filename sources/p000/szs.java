package p000;

import android.widget.ProgressBar;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: szs */
final /* synthetic */ class szs implements Runnable {

    /* renamed from: a */
    private final szt f45530a;

    public szs(szt szt) {
        this.f45530a = szt;
    }

    public final void run() {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45530a.f45531a;
        Logger Logger = ApiConsentChimeraActivity.f30509a;
        if (!apiConsentChimeraActivity.f30522n) {
            apiConsentChimeraActivity.f30524p.schedule(new szv(apiConsentChimeraActivity), 200);
            apiConsentChimeraActivity.f30523o = true;
            ProgressBar progressBar = apiConsentChimeraActivity.f30515g;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }
}
