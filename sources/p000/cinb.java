package p000;

/* renamed from: cinb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cinb f190910c;

    /* renamed from: d */
    private static volatile bxxk f190911d;

    /* renamed from: a */
    public int f190912a;

    /* renamed from: b */
    public boolean f190913b;

    static {
        cinb cinb = new cinb();
        f190910c = cinb;
        GeneratedMessageLite.m124024a(cinb.class, cinb);
    }

    private cinb() {
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
            return GeneratedMessageLite.m124022a(f190910c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cinb();
        } else {
            if (i2 == 4) {
                return new bxvd(f190910c);
            }
            if (i2 == 5) {
                return f190910c;
            }
            bxxk bxxk = f190911d;
            if (bxxk == null) {
                synchronized (cinb.class) {
                    bxxk = f190911d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190910c);
                        f190911d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
