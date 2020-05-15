package p000;

/* renamed from: cwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cwk implements cwl {
    CL_ACCUMULATOR_SUPPORTED(1, 8),
    CL_COUNTER_SUPPORTED(1, 7),
    CVM_ACCUMULATOR_SUPPORTED(1, 6),
    CVM_COUNTER_SUPPORTED(1, 5),
    COUNT_AND_ACCUMULATE_REFUNDS(1, 4),
    COUNT_ZERO_AMOUNT(1, 4),
    ALLOW_RETRIEVAL_OF_VALUES_AND_LIMITS_OF_CRM_CVM_COUNTER_AND_ACCUMULATOR_THROUGH_GET_DATA(1, 1),
    RESET_COA_ON_ARQC(2, 4),
    RESET_NCOT_ON_ARQC(3, 4),
    RESET_CL_CA_ON_ARQC(4, 4),
    RESET_CVM_CA_ON_ARQC(5, 4);
    

    /* renamed from: l */
    private final int f12263l;

    private cwk(int i, int i2) {
        cvx.m7697a(true, "bit number must be between 1 and 8, inclusively");
        cvx.m7697a(true, "byte number must be higher than 0");
        this.f12263l = ((i - 1) * 8) + (i2 - 1);
    }

    /* renamed from: a */
    public static cwm m7767a(byte[] bArr) {
        return new cwm(bArr);
    }

    /* renamed from: a */
    public final int mo8359a() {
        return this.f12263l >>> 3;
    }

    /* renamed from: b */
    public final int mo8360b() {
        return (this.f12263l & 7) + 1;
    }
}
