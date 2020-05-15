package p000;

/* renamed from: bywx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bywx f168680c;

    /* renamed from: d */
    private static volatile bxxk f168681d;

    /* renamed from: a */
    public bxwc f168682a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f168683b = bxxn.f165040b;

    static {
        bywx bywx = new bywx();
        f168680c = bywx;
        GeneratedMessageLite.m124024a(bywx.class, bywx);
    }

    private bywx() {
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
            return GeneratedMessageLite.m124022a(f168680c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", byxl.class, "b"});
        } else if (i2 == 3) {
            return new bywx();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f168680c;
            }
            bxxk bxxk = f168681d;
            if (bxxk == null) {
                synchronized (bywx.class) {
                    bxxk = f168681d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168680c);
                        f168681d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
