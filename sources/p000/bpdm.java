package p000;

/* renamed from: bpdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpdm f136258a;

    /* renamed from: b */
    private static volatile bxxk f136259b;

    static {
        bpdm bpdm = new bpdm();
        f136258a = bpdm;
        GeneratedMessageLite.m124024a(bpdm.class, bpdm);
    }

    private bpdm() {
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
            return GeneratedMessageLite.m124022a(f136258a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpdm();
        }
        if (i2 == 4) {
            return new bxvd(f136258a);
        }
        if (i2 == 5) {
            return f136258a;
        }
        bxxk bxxk = f136259b;
        if (bxxk == null) {
            synchronized (bpdm.class) {
                bxxk = f136259b;
                if (bxxk == null) {
                    bxxk = new bxve(f136258a);
                    f136259b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
