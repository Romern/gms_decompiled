package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: rny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rny implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f43418a;

    /* renamed from: b */
    final /* synthetic */ String f43419b;

    /* renamed from: c */
    final /* synthetic */ rnz f43420c;

    public rny(rnz rnz, LifecycleCallback lifecycleCallback, String str) {
        this.f43420c = rnz;
        this.f43418a = lifecycleCallback;
        this.f43419b = str;
    }

    public final void run() {
        Bundle bundle;
        rnz rnz = this.f43420c;
        if (rnz.f43422b > 0) {
            LifecycleCallback lifecycleCallback = this.f43418a;
            Bundle bundle2 = rnz.f43423c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f43419b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo17724a(bundle);
        }
        if (this.f43420c.f43422b >= 2) {
            this.f43418a.mo17722a();
        }
        if (this.f43420c.f43422b >= 3) {
            this.f43418a.mo17728e();
        }
        if (this.f43420c.f43422b >= 4) {
            this.f43418a.mo17726b();
        }
        int i = this.f43420c.f43422b;
    }
}
