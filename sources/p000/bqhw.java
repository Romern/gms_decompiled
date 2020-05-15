package p000;

/* renamed from: bqhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqhw f140731c;

    /* renamed from: d */
    private static volatile bxxk f140732d;

    /* renamed from: a */
    public bxwc f140733a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f140734b = bxxn.f165040b;

    static {
        bqhw bqhw = new bqhw();
        f140731c = bqhw;
        GeneratedMessageLite.m124024a(bqhw.class, bqhw);
    }

    private bqhw() {
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
            return GeneratedMessageLite.m124022a(f140731c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f140731c);
            }
            if (i2 == 5) {
                return f140731c;
            }
            bxxk bxxk = f140732d;
            if (bxxk == null) {
                synchronized (bqhw.class) {
                    bxxk = f140732d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140731c);
                        f140732d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
