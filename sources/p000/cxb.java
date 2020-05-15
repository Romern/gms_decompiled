package p000;

/* renamed from: cxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cxb implements cwl {
    PROFILE_SPECIFIC_AIP(1, 8),
    PROFILE_SPECIFIC_AFL(1, 7),
    PROFILE_SPECIFIC_CRM_CAC(1, 6),
    PROFILE_SPECIFIC_STA_LIMIT(1, 5),
    PROFILE_SPECIFIC_LCOA_UCOA(1, 4),
    PROFILE_SPECIFIC_LCOL_UCOL(1, 3),
    PROFILE_SPECIFIC_NCOT(1, 2),
    PROFILE_SPECIFIC_COA(1, 1),
    PROFILE_SPECIFIC_AUC(2, 8),
    PROFILE_SPECIFIC_CPR(2, 7),
    PROFILE_SPECIFIC_CVM_CAC(2, 6),
    PROFILE_SPECIFIC_CVM_CONS(2, 5),
    PROFILE_SPECIFIC_CVM_CUM(2, 4),
    PROFILE_SPECIFIC_CVM_STA_LIMIT(2, 3),
    PROFILE_SPECIFIC_CVM_COUNTER(2, 2),
    PROFILE_SPECIFIC_CVM_ACC(2, 1),
    PROFILE_SPECIFIC_CTQ(3, 8),
    PROFILE_SPECIFIC_CL_CONS_LIMIT(3, 7),
    PROFILE_SPECIFIC_CL_CUM_LIMIT(3, 6),
    PROFILE_SPECIFIC_CL_STA(3, 5),
    PROFILE_SPECIFIC_CL_COUNTER(3, 4),
    PROFILE_SPECIFIC_CL_ACC(3, 3);
    

    /* renamed from: w */
    private final int f12339w;

    private cxb(int i, int i2) {
        cvx.m7697a(true, "bit number outside scope");
        cvx.m7697a(true, "byte number outside scope");
        this.f12339w = ((i - 1) * 8) + (i2 - 1);
    }

    /* renamed from: a */
    public static cwm m7810a(byte[] bArr) {
        return new cwm(bArr);
    }

    /* renamed from: a */
    public final int mo8359a() {
        return this.f12339w >>> 3;
    }

    /* renamed from: b */
    public final int mo8360b() {
        return (this.f12339w & 7) + 1;
    }
}
