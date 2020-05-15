package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: rlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rlr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f43240a;

    /* renamed from: b */
    final /* synthetic */ String f43241b;

    /* renamed from: c */
    final /* synthetic */ rls f43242c;

    public rlr(rls rls, LifecycleCallback lifecycleCallback, String str) {
        this.f43242c = rls;
        this.f43240a = lifecycleCallback;
        this.f43241b = str;
    }

    public final void run() {
        Bundle bundle;
        rls rls = this.f43242c;
        if (rls.f43244b > 0) {
            LifecycleCallback lifecycleCallback = this.f43240a;
            Bundle bundle2 = rls.f43245c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f43241b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo17724a(bundle);
        }
        if (this.f43242c.f43244b >= 2) {
            this.f43240a.mo17722a();
        }
        if (this.f43242c.f43244b >= 3) {
            this.f43240a.mo17728e();
        }
        if (this.f43242c.f43244b >= 4) {
            this.f43240a.mo17726b();
        }
        int i = this.f43242c.f43244b;
    }
}
