package p000;

/* renamed from: bon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bon extends RuntimeException {

    /* renamed from: a */
    public byte[] f5257a;

    public bon(String str, byte[] bArr) {
        super(str);
        m3417a(bArr);
    }

    /* renamed from: a */
    private final void m3417a(byte[] bArr) {
        if (bArr.length != 2) {
            String valueOf = String.valueOf(bArr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("status word is invalid: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString() != null ? cbm.m3893a(bArr) : "");
        }
        this.f5257a = bArr;
    }

    public bon(String str, byte[] bArr, Throwable th) {
        super(str, th);
        m3417a(bArr);
    }

    public bon(byte[] bArr) {
        m3417a(bArr);
    }

    public bon(byte[] bArr, Throwable th) {
        super(th);
        m3417a(bArr);
    }
}
