package p000;

import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;
import java.util.TimerTask;

/* renamed from: szv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szv extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ApiConsentChimeraActivity f45533a;

    public szv(ApiConsentChimeraActivity apiConsentChimeraActivity) {
        this.f45533a = apiConsentChimeraActivity;
    }

    public final void run() {
        this.f45533a.runOnUiThread(new szu(this));
    }
}
