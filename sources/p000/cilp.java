package p000;

/* renamed from: cilp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilp implements Runnable {

    /* renamed from: a */
    private final brhc f190654a;

    /* renamed from: b */
    private final String f190655b;

    /* renamed from: c */
    private final String f190656c;

    /* renamed from: d */
    private final brep f190657d;

    /* renamed from: e */
    private final brgl f190658e;

    public cilp(String str, String str2, brhc brhc, brgl brgl, brep brep) {
        this.f190654a = brhc;
        this.f190658e = brgl;
        this.f190655b = str;
        this.f190656c = str2;
        this.f190657d = brep;
    }

    public final void run() {
        this.f190658e.mo69517a(this.f190655b, new ciky(this.f190656c, this.f190654a, this.f190657d));
    }
}
