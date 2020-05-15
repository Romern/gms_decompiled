package p000;

/* renamed from: bxau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxau extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxau f161749b;

    /* renamed from: c */
    public static final bxvj f161750c;

    /* renamed from: e */
    private static volatile bxxk f161751e;

    /* renamed from: a */
    public boab f161752a;

    /* renamed from: d */
    private int f161753d;

    static {
        bxau bxau = new bxau();
        f161749b = bxau;
        GeneratedMessageLite.m124024a(bxau.class, bxau);
        bwny bwny = bwny.f160414k;
        bxau bxau2 = f161749b;
        f161750c = GeneratedMessageLite.m124006a(bwny, bxau2, bxau2, 223344552, bxzf.MESSAGE);
    }

    private bxau() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f161749b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bxau();
        } else {
            if (i2 == 4) {
                return new bxvd(f161749b);
            }
            if (i2 == 5) {
                return f161749b;
            }
            bxxk bxxk = f161751e;
            if (bxxk == null) {
                synchronized (bxau.class) {
                    bxxk = f161751e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161749b);
                        f161751e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
