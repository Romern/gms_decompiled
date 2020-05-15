package p000;

import android.content.pm.PackageInstaller;
import java.util.concurrent.Executor;

/* renamed from: kpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpw extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    private final kpn f24771a;

    /* renamed from: b */
    private final PackageInstaller f24772b;

    public kpw(kpn kpn, PackageInstaller packageInstaller) {
        this.f24771a = kpn;
        this.f24772b = packageInstaller;
    }

    public final void onActiveChanged(int i, boolean z) {
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
        String appPackageName;
        PackageInstaller.SessionInfo sessionInfo = this.f24772b.getSessionInfo(i);
        if (sessionInfo != null && (appPackageName = sessionInfo.getAppPackageName()) != null) {
            kpn kpn = this.f24771a;
            if (ccip.m129867g() && ccip.m129868h()) {
                kpt kpt = (kpt) kpn;
                ((aeeh) kpt.f24762c.mo6445a()).mo34089g(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD).mo34066a(new kpo(kpt, appPackageName), 1, (Executor) kpt.f24763d.mo6445a());
                return;
            }
            bnre i2 = ((kpt) kpn).f24760a.listIterator();
            while (i2.hasNext()) {
                ((kzn) i2.next()).mo14950a(bngx.m109356a(appPackageName), true);
            }
        }
    }

    public final void onFinished(int i, boolean z) {
    }

    public final void onProgressChanged(int i, float f) {
    }
}
