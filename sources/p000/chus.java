package p000;

/* renamed from: chus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum chus {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    

    /* renamed from: r */
    public final int f189211r;

    /* renamed from: s */
    public final byte[] f189212s;

    private chus(int i) {
        this.f189211r = i;
        this.f189212s = Integer.toString(i).getBytes(bmwy.f131156a);
    }

    /* renamed from: a */
    public final chuv mo85686a() {
        return (chuv) chuv.f189214a.get(this.f189211r);
    }
}
