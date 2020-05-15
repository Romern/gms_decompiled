package p000;

import com.google.android.gms.feedback.PreviewChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: wur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wur implements Runnable {

    /* renamed from: a */
    final /* synthetic */ wut f51387a;

    public wur(wut wut) {
        this.f51387a = wut;
    }

    public final void run() {
        wut wut = this.f51387a;
        PreviewChimeraActivity previewChimeraActivity = wut.f51390a;
        HelpConfig helpConfig = previewChimeraActivity.f31617a;
        if (helpConfig != null) {
            helpConfig.mo43227c(previewChimeraActivity);
            if (helpConfig.f78807G) {
                List a = helpConfig.mo43217a(wut.f51390a);
                if (a != null) {
                    wut.mo29431a(a);
                }
                wut.f51391d = false;
                wut.mo171aJ();
                return;
            }
            wut.mo29432c();
            return;
        }
        throw new IllegalStateException("HelpConfig required but not available.");
    }
}
