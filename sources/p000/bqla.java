package p000;

/* renamed from: bqla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqla extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqla f141070a;

    /* renamed from: b */
    private static volatile bxxk f141071b;

    static {
        bqla bqla = new bqla();
        f141070a = bqla;
        GeneratedMessageLite.m124024a(bqla.class, bqla);
    }

    private bqla() {
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
            return GeneratedMessageLite.m124022a(f141070a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqla();
        }
        if (i2 == 4) {
            return new bxvd(f141070a);
        }
        if (i2 == 5) {
            return f141070a;
        }
        bxxk bxxk = f141071b;
        if (bxxk == null) {
            synchronized (bqla.class) {
                bxxk = f141071b;
                if (bxxk == null) {
                    bxxk = new bxve(f141070a);
                    f141071b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
