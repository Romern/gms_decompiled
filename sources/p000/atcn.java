package p000;

/* renamed from: atcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcn extends Exception {

    /* renamed from: a */
    public final int f90081a;

    public atcn(int i) {
        super(m75551a(i));
        this.f90081a = i;
    }

    /* renamed from: a */
    private static String m75551a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN_REASON" : "RISK_DECLINE_REASON" : "TRANSACTION_UNSUPPORTED_REASON" : "BAD_TRANSACTION_DATA_REASON";
    }

    public atcn(int i, Throwable th) {
        super(m75551a(i), th);
        this.f90081a = i;
    }
}
