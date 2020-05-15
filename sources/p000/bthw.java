package p000;

/* renamed from: bthw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bthw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bthw f148914b;

    /* renamed from: c */
    private static volatile bxxk f148915c;

    /* renamed from: a */
    public bxwc f148916a = bxxn.f165040b;

    static {
        bthw bthw = new bthw();
        f148914b = bthw;
        GeneratedMessageLite.m124024a(bthw.class, bthw);
    }

    private bthw() {
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
            return GeneratedMessageLite.m124022a(f148914b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bthw();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f148914b;
            }
            bxxk bxxk = f148915c;
            if (bxxk == null) {
                synchronized (bthw.class) {
                    bxxk = f148915c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148914b);
                        f148915c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
