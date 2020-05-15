package p000;

/* renamed from: quk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final quk f42153e;

    /* renamed from: f */
    private static volatile bxxk f42154f;

    /* renamed from: a */
    public int f42155a;

    /* renamed from: b */
    public String f42156b = "";

    /* renamed from: c */
    public ByteString f42157c;

    /* renamed from: d */
    public ByteString f42158d;

    static {
        quk quk = new quk();
        f42153e = quk;
        GeneratedMessageLite.m124024a(quk.class, quk);
    }

    private quk() {
        ByteString bxtx = bxtx.f164797b;
        this.f42157c = bxtx.f164797b;
        this.f42158d = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f42153e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new quk();
        } else {
            if (i2 == 4) {
                return new bxvd(f42153e);
            }
            if (i2 == 5) {
                return f42153e;
            }
            bxxk bxxk = f42154f;
            if (bxxk == null) {
                synchronized (quk.class) {
                    bxxk = f42154f;
                    if (bxxk == null) {
                        bxxk = new bxve(f42153e);
                        f42154f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
