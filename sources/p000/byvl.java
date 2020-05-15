package p000;

/* renamed from: byvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byvl f168445d;

    /* renamed from: f */
    private static volatile bxxk f168446f;

    /* renamed from: a */
    public int f168447a;

    /* renamed from: b */
    public byyg f168448b;

    /* renamed from: c */
    public byux f168449c;

    /* renamed from: e */
    private byte f168450e = 2;

    static {
        byvl byvl = new byvl();
        f168445d = byvl;
        GeneratedMessageLite.m124024a(byvl.class, byvl);
    }

    private byvl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168450e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168450e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168445d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byvl();
        } else {
            if (i2 == 4) {
                return new bxvd(f168445d);
            }
            if (i2 == 5) {
                return f168445d;
            }
            bxxk bxxk = f168446f;
            if (bxxk == null) {
                synchronized (byvl.class) {
                    bxxk = f168446f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168445d);
                        f168446f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
