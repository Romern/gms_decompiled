package p000;

/* renamed from: bqms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqms extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqms f141256b;

    /* renamed from: c */
    private static volatile bxxk f141257c;

    /* renamed from: a */
    public int f141258a;

    static {
        bqms bqms = new bqms();
        f141256b = bqms;
        GeneratedMessageLite.m124024a(bqms.class, bqms);
    }

    private bqms() {
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
            return GeneratedMessageLite.m124022a(f141256b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqms();
        } else {
            if (i2 == 4) {
                return new bxvd(f141256b);
            }
            if (i2 == 5) {
                return f141256b;
            }
            bxxk bxxk = f141257c;
            if (bxxk == null) {
                synchronized (bqms.class) {
                    bxxk = f141257c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141256b);
                        f141257c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
