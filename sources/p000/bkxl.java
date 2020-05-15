package p000;

/* renamed from: bkxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkxl f125386d;

    /* renamed from: e */
    private static volatile bxxk f125387e;

    /* renamed from: a */
    public int f125388a;

    /* renamed from: b */
    public long f125389b;

    /* renamed from: c */
    public long f125390c;

    static {
        bkxl bkxl = new bkxl();
        f125386d = bkxl;
        GeneratedMessageLite.m124024a(bkxl.class, bkxl);
    }

    private bkxl() {
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
            return GeneratedMessageLite.m124022a(f125386d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f125386d);
            }
            if (i2 == 5) {
                return f125386d;
            }
            bxxk bxxk = f125387e;
            if (bxxk == null) {
                synchronized (bkxl.class) {
                    bxxk = f125387e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125386d);
                        f125387e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
