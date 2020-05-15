package p000;

import android.widget.ProgressBar;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: tab */
final /* synthetic */ class tab implements Runnable {

    /* renamed from: a */
    private final tad f45543a;

    public tab(tad tad) {
        this.f45543a = tad;
    }

    public final void run() {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45543a.f45545a;
        apiConsentChimeraActivity.f30522n = true;
        ProgressBar progressBar = apiConsentChimeraActivity.f30515g;
        if (progressBar != null && apiConsentChimeraActivity.f30517i != null && apiConsentChimeraActivity.f30516h != null && !apiConsentChimeraActivity.f30523o) {
            progressBar.setVisibility(8);
            apiConsentChimeraActivity.f30517i.setVisibility(0);
            apiConsentChimeraActivity.f30516h.setVisibility(0);
        }
    }
}
