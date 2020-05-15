package p000;

/* renamed from: cblx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cblx f177575c;

    /* renamed from: d */
    private static volatile bxxk f177576d;

    /* renamed from: a */
    public ByteString f177577a = ByteString.f164797b;

    /* renamed from: b */
    public long f177578b;

    static {
        cblx cblx = new cblx();
        f177575c = cblx;
        GeneratedMessageLite.m124024a(cblx.class, cblx);
    }

    private cblx() {
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
            return GeneratedMessageLite.m124022a(f177575c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cblx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177575c);
            }
            if (i2 == 5) {
                return f177575c;
            }
            bxxk bxxk = f177576d;
            if (bxxk == null) {
                synchronized (cblx.class) {
                    bxxk = f177576d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177575c);
                        f177576d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
