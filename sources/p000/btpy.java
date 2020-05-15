package p000;

/* renamed from: btpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btpy implements bxvp {
    UNKNOWN_GMS_MODULE(0),
    TAPANDPAY_GMS_MODULE(1),
    PAY_GMS_MODULE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f149911e;

    private btpy(int i) {
        this.f149911e = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f149911e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
