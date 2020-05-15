package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiat extends buqn {

    /* renamed from: a */
    final /* synthetic */ DiscoveryChimeraService f68579a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiat(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.f68579a = discoveryChimeraService;
    }

    public final void run() {
        srn srn = ahsd.f67925a;
        ahsa ahsa = this.f68579a.f80531b;
        synchronized (ahsa.f67915e) {
            ahsa.f67916f.add(ahrz.SUBSCRIBE_BACKGROUND);
        }
        ahsa.f67912b.mo72987c(ahsa.f67913c);
        this.f68579a.f80533d.mo37366a();
        ahsh ahsh = this.f68579a.f80537h;
        ahsh.f67932b.mo72984b();
        if (ahsh.f67935e.mo73039c().getBoolean("has_pending_app_install", false)) {
            ahsh.f67935e.mo73037b(false);
            for (ahsu ahsu : ahsh.f67933c.mo37048c()) {
                if (ahsu.mo37074b(ahsu.f67968a.mo20505a())) {
                    String str = ahsh.f67936f.mo37330a(ahsu.mo37095t(), ahsu).f68558c;
                    if (str == null) {
                        ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("error parsing actionUrl for app install %s", ahsu.mo37095t());
                    } else {
                        long j = Long.MAX_VALUE;
                        try {
                            PackageInfo packageInfo = ahsh.f67937g.f154771a.getPackageManager().getPackageInfo(str, 0);
                            if (packageInfo != null) {
                                j = packageInfo.firstInstallTime;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            busr busr = busr.f154819a;
                        }
                        if (ahsu.mo37074b(j)) {
                            ahsh.f67931a.mo37012a(bvin.APP_INSTALLED, ahsu);
                            ahsu.mo37069a((Long) null);
                        }
                    }
                }
            }
        }
    }
}
