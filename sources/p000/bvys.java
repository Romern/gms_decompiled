package p000;

/* renamed from: bvys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvys extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvys f158218c;

    /* renamed from: d */
    private static volatile bxxk f158219d;

    /* renamed from: a */
    public int f158220a;

    /* renamed from: b */
    public long f158221b;

    static {
        bvys bvys = new bvys();
        f158218c = bvys;
        GeneratedMessageLite.m124024a(bvys.class, bvys);
    }

    private bvys() {
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
            return GeneratedMessageLite.m124022a(f158218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvys();
        } else {
            if (i2 == 4) {
                return new bxvd(f158218c);
            }
            if (i2 == 5) {
                return f158218c;
            }
            bxxk bxxk = f158219d;
            if (bxxk == null) {
                synchronized (bvys.class) {
                    bxxk = f158219d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158218c);
                        f158219d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
