package p000;

/* renamed from: bwrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwrg f160762b;

    /* renamed from: d */
    private static volatile bxxk f160763d;

    /* renamed from: a */
    public boae f160764a;

    /* renamed from: c */
    private int f160765c;

    static {
        bwrg bwrg = new bwrg();
        f160762b = bwrg;
        GeneratedMessageLite.m124024a(bwrg.class, bwrg);
    }

    private bwrg() {
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
            return GeneratedMessageLite.m124022a(f160762b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f160762b);
            }
            if (i2 == 5) {
                return f160762b;
            }
            bxxk bxxk = f160763d;
            if (bxxk == null) {
                synchronized (bwrg.class) {
                    bxxk = f160763d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160762b);
                        f160763d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
