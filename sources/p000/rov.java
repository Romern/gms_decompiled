package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: rov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rov implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f43463a;

    /* renamed from: b */
    final /* synthetic */ String f43464b;

    /* renamed from: c */
    final /* synthetic */ row f43465c;

    public rov(row row, LifecycleCallback lifecycleCallback, String str) {
        this.f43465c = row;
        this.f43463a = lifecycleCallback;
        this.f43464b = str;
    }

    public final void run() {
        Bundle bundle;
        row row = this.f43465c;
        if (row.f43468b > 0) {
            LifecycleCallback lifecycleCallback = this.f43463a;
            Bundle bundle2 = row.f43469c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f43464b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo17724a(bundle);
        }
        if (this.f43465c.f43468b >= 2) {
            this.f43463a.mo17722a();
        }
        if (this.f43465c.f43468b >= 3) {
            this.f43463a.mo17728e();
        }
        if (this.f43465c.f43468b >= 4) {
            this.f43463a.mo17726b();
        }
        int i = this.f43465c.f43468b;
    }
}
