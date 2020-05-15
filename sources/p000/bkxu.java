package p000;

/* renamed from: bkxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bkxu f125420c;

    /* renamed from: d */
    private static volatile bxxk f125421d;

    /* renamed from: a */
    public int f125422a;

    /* renamed from: b */
    public int f125423b;

    static {
        bkxu bkxu = new bkxu();
        f125420c = bkxu;
        GeneratedMessageLite.m124024a(bkxu.class, bkxu);
    }

    private bkxu() {
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
            return GeneratedMessageLite.m124022a(f125420c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bkxv.f125424a});
        } else if (i2 == 3) {
            return new bkxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f125420c);
            }
            if (i2 == 5) {
                return f125420c;
            }
            bxxk bxxk = f125421d;
            if (bxxk == null) {
                synchronized (bkxu.class) {
                    bxxk = f125421d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125420c);
                        f125421d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
