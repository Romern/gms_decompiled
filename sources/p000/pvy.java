package p000;

/* renamed from: pvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pvy implements Runnable {

    /* renamed from: a */
    private final String f40416a;

    /* renamed from: b */
    private final int f40417b;

    /* renamed from: c */
    private final pvw f40418c;

    public pvy(String str, int i, pvw pvw) {
        this.f40416a = str;
        this.f40417b = i;
        this.f40418c = pvw;
    }

    public final void run() {
        this.f40418c.mo23699a(this.f40416a, this.f40417b);
    }
}
