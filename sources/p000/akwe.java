package p000;

import android.content.pm.PackageManager;

/* renamed from: akwe */
final /* synthetic */ class akwe implements bmzi {

    /* renamed from: a */
    private final PackageManager f72990a;

    public akwe(PackageManager packageManager) {
        this.f72990a = packageManager;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        PackageManager packageManager = this.f72990a;
        Logger Logger = akwg.f72993b;
        return packageManager.getInstalledPackages(4224);
    }
}
