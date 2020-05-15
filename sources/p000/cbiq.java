package p000;

/* renamed from: cbiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbiq f177285d;

    /* renamed from: e */
    private static volatile bxxk f177286e;

    /* renamed from: a */
    public ByteString f177287a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f177288b = ByteString.f164797b;

    /* renamed from: c */
    public int f177289c;

    static {
        cbiq cbiq = new cbiq();
        f177285d = cbiq;
        GeneratedMessageLite.m124024a(cbiq.class, cbiq);
    }

    private cbiq() {
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
            return GeneratedMessageLite.m124022a(f177285d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177285d);
            }
            if (i2 == 5) {
                return f177285d;
            }
            bxxk bxxk = f177286e;
            if (bxxk == null) {
                synchronized (cbiq.class) {
                    bxxk = f177286e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177285d);
                        f177286e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
