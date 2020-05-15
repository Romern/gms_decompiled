package p000;

/* renamed from: cbhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbhn f177154c;

    /* renamed from: d */
    private static volatile bxxk f177155d;

    /* renamed from: a */
    public int f177156a;

    /* renamed from: b */
    public long f177157b;

    static {
        cbhn cbhn = new cbhn();
        f177154c = cbhn;
        GeneratedMessageLite.m124024a(cbhn.class, cbhn);
    }

    private cbhn() {
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
            return GeneratedMessageLite.m124022a(f177154c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f177154c);
            }
            if (i2 == 5) {
                return f177154c;
            }
            bxxk bxxk = f177155d;
            if (bxxk == null) {
                synchronized (cbhn.class) {
                    bxxk = f177155d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177154c);
                        f177155d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
