package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.Service;

/* renamed from: sjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjt {

    /* renamed from: a */
    public int f44590a;

    /* renamed from: b */
    public final Object f44591b = new Object();

    /* renamed from: c */
    public Intent f44592c;

    /* renamed from: d */
    public final Service f44593d;

    /* renamed from: e */
    public final bmzu f44594e;

    public sjt(Service service) {
        bmzz a = bmzz.m108708a();
        a.mo66952a(4);
        a.mo66963e();
        this.f44594e = a.mo66962d();
        this.f44593d = service;
    }

    /* renamed from: a */
    public final void mo25652a() {
        synchronized (this.f44591b) {
            int i = this.f44590a;
            if (i > 0) {
                int i2 = i - 1;
                this.f44590a = i2;
                if (i2 == 0) {
                    for (sjs sjs : ((bnbb) this.f44594e).f131333a.keySet()) {
                        try {
                            sjs.mo25648a();
                        } catch (RuntimeException e) {
                            Log.e("LifecycleSync", "Failed to execute a callback", e);
                        }
                    }
                    this.f44593d.stopSelf();
                }
            }
        }
    }
}
