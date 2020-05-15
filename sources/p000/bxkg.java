package p000;

/* renamed from: bxkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f163723b = new bxkd();

    /* renamed from: c */
    public static final bxkg f163724c;

    /* renamed from: d */
    public static final bxvj f163725d;

    /* renamed from: e */
    private static volatile bxxk f163726e;

    /* renamed from: a */
    public bxvt f163727a = bxvm.f164965b;

    static {
        bxkg bxkg = new bxkg();
        f163724c = bxkg;
        GeneratedMessageLite.m124024a(bxkg.class, bxkg);
        bxcf bxcf = bxcf.f162779a;
        bxkg bxkg2 = f163724c;
        f163725d = GeneratedMessageLite.m124006a(bxcf, bxkg2, bxkg2, 121436786, bxzf.MESSAGE);
    }

    private bxkg() {
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
            return GeneratedMessageLite.m124022a(f163724c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bxkf.m122797b()});
        } else if (i2 == 3) {
            return new bxkg();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163724c;
            }
            bxxk bxxk = f163726e;
            if (bxxk == null) {
                synchronized (bxkg.class) {
                    bxxk = f163726e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163724c);
                        f163726e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
