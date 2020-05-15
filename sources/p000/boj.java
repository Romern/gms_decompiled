package p000;

/* renamed from: boj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum boj {
    CASE_1("Normal Case 1", false, false, false),
    CASE_2("Normal Case 2", false, true, false),
    CASE_3("Normal Case 3", true, false, false),
    CASE_4("Normal Case 4", true, true, false),
    EXTENDED_CASE_1("Extended Case 1", true, false, true),
    EXTENDED_CASE_2("Extended Case 2", false, true, true),
    EXTENDED_CASE_3("Extended Case 3", true, true, true);
    

    /* renamed from: h */
    public final String f5249h;

    /* renamed from: i */
    public final boolean f5250i;

    /* renamed from: j */
    public final boolean f5251j;

    /* renamed from: k */
    public final boolean f5252k;

    private boj(String str, boolean z, boolean z2, boolean z3) {
        this.f5249h = str;
        this.f5250i = z;
        this.f5251j = z2;
        this.f5252k = z3;
    }

    public final String toString() {
        return this.f5249h;
    }
}
