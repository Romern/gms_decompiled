package p000;

/* renamed from: cile */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cile implements Runnable {

    /* renamed from: a */
    private final brhc f190595a;

    /* renamed from: b */
    private final brep f190596b;

    /* renamed from: c */
    private final brgl f190597c;

    public cile(brhc brhc, brgl brgl, brep brep) {
        this.f190595a = brhc;
        this.f190597c = brgl;
        this.f190596b = brep;
    }

    public final void run() {
        this.f190597c.mo69516a(new ciko(this.f190596b));
    }
}
