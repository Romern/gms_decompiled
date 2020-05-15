package p000;

/* renamed from: acbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final acbl f59441c;

    /* renamed from: d */
    private static volatile bxxk f59442d;

    /* renamed from: a */
    public int f59443a;

    /* renamed from: b */
    public long f59444b;

    static {
        acbl acbl = new acbl();
        f59441c = acbl;
        GeneratedMessageLite.m124024a(acbl.class, acbl);
    }

    private acbl() {
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
            return GeneratedMessageLite.m124022a(f59441c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new acbl();
        } else {
            if (i2 == 4) {
                return new bxvd(f59441c);
            }
            if (i2 == 5) {
                return f59441c;
            }
            bxxk bxxk = f59442d;
            if (bxxk == null) {
                synchronized (acbl.class) {
                    bxxk = f59442d;
                    if (bxxk == null) {
                        bxxk = new bxve(f59441c);
                        f59442d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
