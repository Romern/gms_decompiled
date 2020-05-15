package p000;

import android.content.pm.PackageInstaller;
import java.util.Iterator;

/* renamed from: oyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oyb extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    PackageInstaller.SessionInfo f38595a;

    /* renamed from: b */
    final /* synthetic */ oyc f38596b;

    public oyb(oyc oyc) {
        PackageInstaller.SessionInfo sessionInfo;
        this.f38596b = oyc;
        bnsn bnsn = oyc.f38597a;
        String str = oyc.f38598b;
        Iterator<PackageInstaller.SessionInfo> it = oyc.f38601e.getAllSessions().iterator();
        while (true) {
            if (!it.hasNext()) {
                sessionInfo = null;
                break;
            }
            sessionInfo = it.next();
            if (oyc.f38598b.equals(sessionInfo.getAppPackageName())) {
                break;
            }
        }
        if (sessionInfo != null) {
            String str2 = oyc.f38598b;
            this.f38595a = sessionInfo;
        }
    }

    public final void onActiveChanged(int i, boolean z) {
        bnsn bnsn = oyc.f38597a;
        PackageInstaller.SessionInfo sessionInfo = this.f38595a;
        if (sessionInfo != null && sessionInfo.getSessionId() == i && !z) {
            bnsi c = oyc.f38597a.mo68388c();
            c.mo68432a("oyb", "onActiveChanged", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Session goes inactive: %d", i);
            this.f38596b.mo22776a(5);
            this.f38596b.f38601e.unregisterSessionCallback(this);
        }
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
        bnsn bnsn = oyc.f38597a;
        PackageInstaller.SessionInfo sessionInfo = this.f38596b.f38601e.getSessionInfo(i);
        if (sessionInfo != null && this.f38596b.f38598b.equals(sessionInfo.getAppPackageName())) {
            this.f38595a = sessionInfo;
        }
    }

    public final void onFinished(int i, boolean z) {
        int i2;
        bnsn bnsn = oyc.f38597a;
        PackageInstaller.SessionInfo sessionInfo = this.f38595a;
        if (sessionInfo != null && sessionInfo.getSessionId() == i) {
            oyc oyc = this.f38596b;
            if (!z) {
                i2 = 5;
            } else {
                i2 = 1;
            }
            oyc.mo22776a(i2);
            this.f38596b.f38601e.unregisterSessionCallback(this);
        }
    }

    public final void onProgressChanged(int i, float f) {
        bnsn bnsn = oyc.f38597a;
        PackageInstaller.SessionInfo sessionInfo = this.f38595a;
        if (sessionInfo != null && sessionInfo.getSessionId() == i) {
            oyc oyc = this.f38596b;
            String str = oyc.f38598b;
            oyd oyd = (oyd) oyc.f38603g.mo2448b();
            bmxy.m108581a(oyd);
            oyd.f38605a = 4;
            oyd.mo22778a(f);
            oyc.f38603g.mo2453l(oyd);
        }
    }
}
