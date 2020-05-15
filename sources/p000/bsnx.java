package p000;

/* renamed from: bsnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsnx f146342b;

    /* renamed from: d */
    private static volatile bxxk f146343d;

    /* renamed from: a */
    public boolean f146344a;

    /* renamed from: c */
    private int f146345c;

    static {
        bsnx bsnx = new bsnx();
        f146342b = bsnx;
        GeneratedMessageLite.m124024a(bsnx.class, bsnx);
    }

    private bsnx() {
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
            return GeneratedMessageLite.m124022a(f146342b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f146342b);
            }
            if (i2 == 5) {
                return f146342b;
            }
            bxxk bxxk = f146343d;
            if (bxxk == null) {
                synchronized (bsnx.class) {
                    bxxk = f146343d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146342b);
                        f146343d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
