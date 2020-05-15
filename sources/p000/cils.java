package p000;

/* renamed from: cils */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cils implements Runnable {

    /* renamed from: a */
    private final brep f190673a;

    /* renamed from: b */
    private final brgl f190674b;

    public cils(brgl brgl, brep brep) {
        this.f190674b = brgl;
        this.f190673a = brep;
    }

    public final void run() {
        this.f190674b.mo69516a(new cila(this.f190673a));
    }
}
