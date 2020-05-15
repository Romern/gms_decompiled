package p000;

/* renamed from: bqyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqyg f141939d;

    /* renamed from: e */
    private static volatile bxxk f141940e;

    /* renamed from: a */
    public int f141941a;

    /* renamed from: b */
    public String f141942b = "";

    /* renamed from: c */
    public bqyf f141943c;

    static {
        bqyg bqyg = new bqyg();
        f141939d = bqyg;
        GeneratedMessageLite.m124024a(bqyg.class, bqyg);
    }

    private bqyg() {
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
            return GeneratedMessageLite.m124022a(f141939d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f141939d);
            }
            if (i2 == 5) {
                return f141939d;
            }
            bxxk bxxk = f141940e;
            if (bxxk == null) {
                synchronized (bqyg.class) {
                    bxxk = f141940e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141939d);
                        f141940e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
