package p000;

import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: tad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ApiConsentChimeraActivity f45545a;

    public tad(ApiConsentChimeraActivity apiConsentChimeraActivity) {
        this.f45545a = apiConsentChimeraActivity;
    }

    public final void run() {
        try {
            this.f45545a.f30514f.await(cdfk.f180651a.mo6606a().mo77394d(), TimeUnit.SECONDS);
            if (this.f45545a.f30514f.getCount() <= 0) {
                this.f45545a.f30513e.post(new tab(this));
            } else {
                this.f45545a.f30513e.post(new taa(this));
            }
        } catch (InterruptedException e) {
            ApiConsentChimeraActivity.f30509a.mo25417e("Couldn't complete initial ToS setup task", e, new Object[0]);
            this.f45545a.f30513e.post(new tac(this));
        }
    }
}
