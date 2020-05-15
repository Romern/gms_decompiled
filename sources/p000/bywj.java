package p000;

/* renamed from: bywj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bywj f168580c;

    /* renamed from: d */
    private static volatile bxxk f168581d;

    /* renamed from: a */
    public int f168582a;

    /* renamed from: b */
    public int f168583b;

    static {
        bywj bywj = new bywj();
        f168580c = bywj;
        GeneratedMessageLite.m124024a(bywj.class, bywj);
    }

    private bywj() {
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
            return GeneratedMessageLite.m124022a(f168580c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywj();
        } else {
            if (i2 == 4) {
                return new bxvd(f168580c);
            }
            if (i2 == 5) {
                return f168580c;
            }
            bxxk bxxk = f168581d;
            if (bxxk == null) {
                synchronized (bywj.class) {
                    bxxk = f168581d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168580c);
                        f168581d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
