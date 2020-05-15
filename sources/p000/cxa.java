package p000;

/* renamed from: cxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cxa implements cwl {
    LAST_CONTACTLESS_TRANSACTION_COMPLETED(7),
    ODA_FAILED(8);
    

    /* renamed from: c */
    private final int f12315c;

    private cxa(int i) {
        cvx.m7697a(true, "bit number outside scope");
        cvx.m7697a(true, "byte number outside scope");
        this.f12315c = i - 1;
    }

    /* renamed from: a */
    public static cwm m7807a(byte[] bArr) {
        return new cwm(bArr);
    }

    /* renamed from: a */
    public final int mo8359a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo8360b() {
        return this.f12315c + 1;
    }
}
