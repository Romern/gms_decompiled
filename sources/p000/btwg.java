package p000;

/* renamed from: btwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btwg f152701a;

    /* renamed from: b */
    private static volatile bxxk f152702b;

    static {
        btwg btwg = new btwg();
        f152701a = btwg;
        GeneratedMessageLite.m124024a(btwg.class, btwg);
    }

    private btwg() {
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
            return GeneratedMessageLite.m124022a(f152701a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwg();
        }
        if (i2 == 4) {
            return new bxvd(f152701a);
        }
        if (i2 == 5) {
            return f152701a;
        }
        bxxk bxxk = f152702b;
        if (bxxk == null) {
            synchronized (btwg.class) {
                bxxk = f152702b;
                if (bxxk == null) {
                    bxxk = new bxve(f152701a);
                    f152702b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
