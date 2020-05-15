package p000;

/* renamed from: pvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pvx implements Runnable {

    /* renamed from: a */
    private final String f40413a;

    /* renamed from: b */
    private final int f40414b;

    /* renamed from: c */
    private final pvw f40415c;

    public pvx(String str, int i, pvw pvw) {
        this.f40413a = str;
        this.f40414b = i;
        this.f40415c = pvw;
    }

    public final void run() {
        this.f40415c.mo23703b(this.f40413a, this.f40414b);
    }
}
