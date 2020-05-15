package p000;

import android.os.Handler;

/* renamed from: bfev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfev extends adzt {

    /* renamed from: a */
    public final bfgn f113606a;

    /* renamed from: b */
    public boolean f113607b = false;

    /* renamed from: c */
    private final Runnable f113608c;

    public bfev(bfgn bfgn, Handler handler) {
        this.f113606a = bfgn;
        int i = bfib.f113998b;
        this.f113608c = new bfel(this, bfgn, handler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61566a() {
        post(this.f113608c);
    }
}
