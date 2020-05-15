package p000;

/* renamed from: birt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final birt f121467a;

    /* renamed from: b */
    private static volatile bxxk f121468b;

    static {
        birt birt = new birt();
        f121467a = birt;
        GeneratedMessageLite.m124024a(birt.class, birt);
    }

    private birt() {
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
            return GeneratedMessageLite.m124022a(f121467a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new birt();
        }
        if (i2 == 4) {
            return new bxvd(f121467a);
        }
        if (i2 == 5) {
            return f121467a;
        }
        bxxk bxxk = f121468b;
        if (bxxk == null) {
            synchronized (birt.class) {
                bxxk = f121468b;
                if (bxxk == null) {
                    bxxk = new bxve(f121467a);
                    f121468b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
