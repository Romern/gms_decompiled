package p000;

/* renamed from: bxan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxan extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxan f161723c;

    /* renamed from: d */
    public static final bxvj f161724d;

    /* renamed from: f */
    private static volatile bxxk f161725f;

    /* renamed from: a */
    public int f161726a;

    /* renamed from: b */
    public bwxl f161727b;

    /* renamed from: e */
    private byte f161728e = 2;

    static {
        bxan bxan = new bxan();
        f161723c = bxan;
        GeneratedMessageLite.m124024a(bxan.class, bxan);
        bwxl bwxl = bwxl.f161383i;
        bxan bxan2 = f161723c;
        f161724d = GeneratedMessageLite.m124006a(bwxl, bxan2, bxan2, 228982941, bxzf.MESSAGE);
    }

    private bxan() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161728e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161728e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161723c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxan();
        } else {
            if (i2 == 4) {
                return new bxvd(f161723c);
            }
            if (i2 == 5) {
                return f161723c;
            }
            bxxk bxxk = f161725f;
            if (bxxk == null) {
                synchronized (bxan.class) {
                    bxxk = f161725f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161723c);
                        f161725f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
