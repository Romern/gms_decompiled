package p000;

/* renamed from: blfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blfg f126357b;

    /* renamed from: d */
    private static volatile bxxk f126358d;

    /* renamed from: a */
    public String f126359a = "";

    /* renamed from: c */
    private int f126360c;

    static {
        blfg blfg = new blfg();
        f126357b = blfg;
        GeneratedMessageLite.m124024a(blfg.class, blfg);
    }

    private blfg() {
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
            return GeneratedMessageLite.m124022a(f126357b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f126357b);
            }
            if (i2 == 5) {
                return f126357b;
            }
            bxxk bxxk = f126358d;
            if (bxxk == null) {
                synchronized (blfg.class) {
                    bxxk = f126358d;
                    if (bxxk == null) {
                        bxxk = new bxve(f126357b);
                        f126358d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
