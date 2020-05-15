package p000;

/* renamed from: byfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byfs f166058c;

    /* renamed from: d */
    private static volatile bxxk f166059d;

    /* renamed from: a */
    public int f166060a;

    /* renamed from: b */
    public ByteString f166061b = ByteString.f164797b;

    static {
        byfs byfs = new byfs();
        f166058c = byfs;
        GeneratedMessageLite.m124024a(byfs.class, byfs);
    }

    private byfs() {
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
            return GeneratedMessageLite.m124022a(f166058c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f166058c);
            }
            if (i2 == 5) {
                return f166058c;
            }
            bxxk bxxk = f166059d;
            if (bxxk == null) {
                synchronized (byfs.class) {
                    bxxk = f166059d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166058c);
                        f166059d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
