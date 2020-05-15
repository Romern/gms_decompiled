package p000;

/* renamed from: bwyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwyq f161504d;

    /* renamed from: e */
    private static volatile bxxk f161505e;

    /* renamed from: a */
    public int f161506a;

    /* renamed from: b */
    public int f161507b;

    /* renamed from: c */
    public bwpd f161508c;

    static {
        bwyq bwyq = new bwyq();
        f161504d = bwyq;
        GeneratedMessageLite.m124024a(bwyq.class, bwyq);
    }

    private bwyq() {
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
            return GeneratedMessageLite.m124022a(f161504d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f161504d);
            }
            if (i2 == 5) {
                return f161504d;
            }
            bxxk bxxk = f161505e;
            if (bxxk == null) {
                synchronized (bwyq.class) {
                    bxxk = f161505e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161504d);
                        f161505e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
