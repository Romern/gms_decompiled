package p000;

/* renamed from: biqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final biqx f121364a;

    /* renamed from: e */
    private static volatile bxxk f121365e;

    /* renamed from: b */
    private int f121366b;

    /* renamed from: c */
    private biqw f121367c;

    /* renamed from: d */
    private byte f121368d = 2;

    static {
        biqx biqx = new biqx();
        f121364a = biqx;
        GeneratedMessageLite.m124024a(biqx.class, biqx);
    }

    private biqx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121368d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121368d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121364a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new biqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f121364a);
            }
            if (i2 == 5) {
                return f121364a;
            }
            bxxk bxxk = f121365e;
            if (bxxk == null) {
                synchronized (biqx.class) {
                    bxxk = f121365e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121364a);
                        f121365e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
