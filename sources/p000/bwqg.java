package p000;

/* renamed from: bwqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwqg f160659d;

    /* renamed from: e */
    private static volatile bxxk f160660e;

    /* renamed from: a */
    public int f160661a;

    /* renamed from: b */
    public int f160662b;

    /* renamed from: c */
    public String f160663c = "";

    static {
        bwqg bwqg = new bwqg();
        f160659d = bwqg;
        GeneratedMessageLite.m124024a(bwqg.class, bwqg);
    }

    private bwqg() {
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
            return GeneratedMessageLite.m124022a(f160659d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f160659d);
            }
            if (i2 == 5) {
                return f160659d;
            }
            bxxk bxxk = f160660e;
            if (bxxk == null) {
                synchronized (bwqg.class) {
                    bxxk = f160660e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160659d);
                        f160660e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
