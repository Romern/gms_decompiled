package p000;

import android.os.Handler;

/* renamed from: cilq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilq implements Runnable {

    /* renamed from: a */
    private final Handler f190659a;

    /* renamed from: b */
    private final brhc f190660b;

    /* renamed from: c */
    private final String f190661c;

    /* renamed from: d */
    private final String f190662d;

    /* renamed from: e */
    private final brep f190663e;

    /* renamed from: f */
    private final breo f190664f;

    /* renamed from: g */
    private final brgl f190665g;

    /* renamed from: h */
    private final brgz f190666h;

    public cilq(Handler handler, brhc brhc, brgl brgl, brgz brgz, String str, String str2, brep brep, breo breo) {
        this.f190659a = handler;
        this.f190660b = brhc;
        this.f190665g = brgl;
        this.f190666h = brgz;
        this.f190661c = str;
        this.f190662d = str2;
        this.f190663e = brep;
        this.f190664f = breo;
    }

    public final void run() {
        this.f190665g.mo69516a(new cikw(this.f190659a, this.f190661c, this.f190662d, this.f190660b, this.f190665g, this.f190666h, this.f190663e, this.f190664f));
    }
}
