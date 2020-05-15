package p000;

/* renamed from: cbhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbhc f177115c;

    /* renamed from: d */
    private static volatile bxxk f177116d;

    /* renamed from: a */
    public cbmo f177117a;

    /* renamed from: b */
    public cbhb f177118b;

    static {
        cbhc cbhc = new cbhc();
        f177115c = cbhc;
        GeneratedMessageLite.m124024a(cbhc.class, cbhc);
    }

    private cbhc() {
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
            return GeneratedMessageLite.m124022a(f177115c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f177115c);
            }
            if (i2 == 5) {
                return f177115c;
            }
            bxxk bxxk = f177116d;
            if (bxxk == null) {
                synchronized (cbhc.class) {
                    bxxk = f177116d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177115c);
                        f177116d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
