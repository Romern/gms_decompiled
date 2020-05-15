package p000;

/* renamed from: bmen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmen extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmen f128969c;

    /* renamed from: e */
    private static volatile bxxk f128970e;

    /* renamed from: a */
    public bmdn f128971a;

    /* renamed from: b */
    public bmqf f128972b;

    /* renamed from: d */
    private int f128973d;

    static {
        bmen bmen = new bmen();
        f128969c = bmen;
        GeneratedMessageLite.m124024a(bmen.class, bmen);
    }

    private bmen() {
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
            return GeneratedMessageLite.m124022a(f128969c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0000", new Object[]{"d", "b", "a"});
        } else if (i2 == 3) {
            return new bmen();
        } else {
            if (i2 == 4) {
                return new bxvd(f128969c);
            }
            if (i2 == 5) {
                return f128969c;
            }
            bxxk bxxk = f128970e;
            if (bxxk == null) {
                synchronized (bmen.class) {
                    bxxk = f128970e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128969c);
                        f128970e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
