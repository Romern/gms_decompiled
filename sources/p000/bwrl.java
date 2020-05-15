package p000;

/* renamed from: bwrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwrl f160776a;

    /* renamed from: b */
    private static volatile bxxk f160777b;

    static {
        bwrl bwrl = new bwrl();
        f160776a = bwrl;
        GeneratedMessageLite.m124024a(bwrl.class, bwrl);
    }

    private bwrl() {
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
            return GeneratedMessageLite.m124022a(f160776a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwrl();
        }
        if (i2 == 4) {
            return new bxvd(f160776a);
        }
        if (i2 == 5) {
            return f160776a;
        }
        bxxk bxxk = f160777b;
        if (bxxk == null) {
            synchronized (bwrl.class) {
                bxxk = f160777b;
                if (bxxk == null) {
                    bxxk = new bxve(f160776a);
                    f160777b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
