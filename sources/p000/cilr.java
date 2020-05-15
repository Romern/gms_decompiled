package p000;

import android.os.Handler;

/* renamed from: cilr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilr implements Runnable {

    /* renamed from: a */
    private final brhc f190667a;

    /* renamed from: b */
    private final brep f190668b;

    /* renamed from: c */
    private final Handler f190669c;

    /* renamed from: d */
    private final String f190670d;

    /* renamed from: e */
    private final String f190671e;

    /* renamed from: f */
    private final brgl f190672f;

    public cilr(brhc brhc, brgl brgl, brep brep, Handler handler, String str, String str2) {
        this.f190667a = brhc;
        this.f190672f = brgl;
        this.f190668b = brep;
        this.f190669c = handler;
        this.f190670d = str;
        this.f190671e = str2;
    }

    public final void run() {
        this.f190672f.mo69516a(new cikz(this.f190667a, this.f190672f, this.f190668b, this.f190669c, this.f190670d, this.f190671e));
    }
}
