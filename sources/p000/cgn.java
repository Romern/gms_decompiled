package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgn {

    /* renamed from: a */
    private boolean f6814a;

    /* renamed from: b */
    private final Handler f6815b = new Handler(Looper.getMainLooper(), new cgm());

    /* renamed from: a */
    public final synchronized void mo3864a(cgj cgj, boolean z) {
        if (!this.f6814a) {
            if (!z) {
                this.f6814a = true;
                cgj.mo3844d();
                this.f6814a = false;
                return;
            }
        }
        this.f6815b.obtainMessage(1, cgj).sendToTarget();
    }
}
