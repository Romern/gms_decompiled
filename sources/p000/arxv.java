package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arxv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BootstrapProgressResult f88425a;

    /* renamed from: b */
    final /* synthetic */ arxx f88426b;

    public arxv(arxx arxx, BootstrapProgressResult bootstrapProgressResult) {
        this.f88426b = arxx;
        this.f88425a = bootstrapProgressResult;
    }

    public final void run() {
        this.f88426b.mo48903a(this.f88425a);
    }
}
