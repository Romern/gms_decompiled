package p000;

/* renamed from: bywh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bywh f168574c;

    /* renamed from: d */
    private static volatile bxxk f168575d;

    /* renamed from: a */
    public int f168576a;

    /* renamed from: b */
    public int f168577b;

    static {
        bywh bywh = new bywh();
        f168574c = bywh;
        GeneratedMessageLite.m124024a(bywh.class, bywh);
    }

    private bywh() {
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
            return GeneratedMessageLite.m124022a(f168574c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywh();
        } else {
            if (i2 == 4) {
                return new bxvd(f168574c);
            }
            if (i2 == 5) {
                return f168574c;
            }
            bxxk bxxk = f168575d;
            if (bxxk == null) {
                synchronized (bywh.class) {
                    bxxk = f168575d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168574c);
                        f168575d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
