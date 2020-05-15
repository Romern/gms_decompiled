package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: toz */
final /* synthetic */ class toz implements Callable {

    /* renamed from: a */
    private final tph f46430a;

    /* renamed from: b */
    private final PackageManager f46431b;

    public toz(tph tph, PackageManager packageManager) {
        this.f46430a = tph;
        this.f46431b = packageManager;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    public final Object call() {
        tph tph = this.f46430a;
        PackageManager packageManager = this.f46431b;
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        if (installedApplications == null) {
            return bngx.m109376e();
        }
        return bngx.m109369a((Comparator) bnny.m109908a(String.CASE_INSENSITIVE_ORDER).mo68159a(tpd.f46436a), (Iterable) bnfi.m109235a(installedApplications).mo67502a(new tpb(tph)).mo67501a(new tpc(packageManager)).mo67505b());
    }
}
