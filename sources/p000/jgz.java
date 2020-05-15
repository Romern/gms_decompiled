package p000;

import android.content.pm.PackageInstaller;

/* renamed from: jgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jgz extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    final /* synthetic */ jhb f22459a;

    public jgz(jhb jhb) {
        this.f22459a = jhb;
    }

    public final void onActiveChanged(int i, boolean z) {
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
    }

    public final void onFinished(int i, boolean z) {
    }

    public final void onProgressChanged(int i, float f) {
        jhb jhb = this.f22459a;
        Logger Logger = jhb.f22465a;
        PackageInstaller.SessionInfo sessionInfo = jhb.f22471f.getSessionInfo(i);
        if (sessionInfo != null && this.f22459a.f22470e.equals(sessionInfo.getAppPackageName())) {
            this.f22459a.mo13730a(Integer.valueOf((int) (f * 100.0f)));
        }
    }
}
