package p000;

import android.os.Handler;

/* renamed from: nwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwn extends nwm {

    /* renamed from: b */
    public final Handler f36814b;

    /* renamed from: c */
    public final Runnable f36815c;

    /* renamed from: a */
    public final void mo21755a() {
        this.f36814b.post(this.f36815c);
    }

    public nwn(Handler handler, Runnable runnable) {
        this.f36814b = handler;
        this.f36815c = runnable;
    }
}
