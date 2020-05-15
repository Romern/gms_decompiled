package p000;

/* renamed from: bfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfq extends Exception {
    private static final long serialVersionUID = -5390160483712125560L;

    /* renamed from: a */
    public bha f3124a;

    /* renamed from: b */
    public short f3125b;

    public bfq(bha bha) {
        super(bha.f3221t);
        this.f3124a = bha;
    }

    public bfq(String str) {
        super(str);
    }

    public bfq(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public bfq(String str, byte[] bArr) {
        super(str);
    }

    public bfq(short s) {
        this.f3125b = s;
    }
}
