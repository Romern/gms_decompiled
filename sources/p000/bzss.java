package p000;

/* renamed from: bzss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzss extends Exception {

    /* renamed from: a */
    public final bzsr f171294a;

    public bzss(bzsr bzsr, String str) {
        this(bzsr, str, null);
    }

    /* renamed from: a */
    public final boolean mo74576a() {
        return this.f171294a.f171293g;
    }

    public bzss(bzsr bzsr, String str, Throwable th) {
        super(str, th);
        this.f171294a = bzsr;
    }

    public bzss(bzsr bzsr, Throwable th) {
        this(bzsr, null, th);
    }
}
