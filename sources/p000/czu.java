package p000;

/* renamed from: czu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum czu implements czv {
    ALLOW_RETRIEVAL_OF_VALUES_AND_LIMITS_OF_CRM_CVM_COUNTER_AND_ACCUMULATOR_THROUGH_GET_DATA;

    private czu(String str) {
        czl.m8003a(true, "bit number must be between 1 and 8, inclusively");
        czl.m8003a(true, "byte number must be higher than 0");
    }

    /* renamed from: a */
    public static czw m8050a(byte[] bArr) {
        return new czw(bArr);
    }

    /* renamed from: a */
    public final int mo8461a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo8462b() {
        return 1;
    }
}
