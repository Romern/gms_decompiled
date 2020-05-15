package p000;

/* renamed from: bruy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bruy extends Exception {
    public bruy(String str, Throwable th) {
        super(str, th);
        bmxy.m108582a(th, "Must provide cause");
    }

    public bruy(Throwable th) {
        super(th);
        bmxy.m108582a(th, "Must provide cause");
    }
}
