package p000;

import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;
import java.util.TimerTask;

/* renamed from: szt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szt extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ApiConsentChimeraActivity f45531a;

    public szt(ApiConsentChimeraActivity apiConsentChimeraActivity) {
        this.f45531a = apiConsentChimeraActivity;
    }

    public final void run() {
        this.f45531a.runOnUiThread(new szs(this));
    }
}
