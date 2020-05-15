package p000;

import android.content.pm.PackageInstaller;

/* renamed from: kpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PackageInstaller f24764a;

    /* renamed from: b */
    final /* synthetic */ kpw f24765b;

    public kpu(PackageInstaller packageInstaller, kpw kpw) {
        this.f24764a = packageInstaller;
        this.f24765b = kpw;
    }

    public final void run() {
        this.f24764a.registerSessionCallback(this.f24765b);
    }
}
