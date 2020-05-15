package p000;

/* renamed from: byxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byxq f168778d;

    /* renamed from: e */
    private static volatile bxxk f168779e;

    /* renamed from: a */
    public int f168780a;

    /* renamed from: b */
    public int f168781b;

    /* renamed from: c */
    public int f168782c;

    static {
        byxq byxq = new byxq();
        f168778d = byxq;
        GeneratedMessageLite.m124024a(byxq.class, byxq);
    }

    private byxq() {
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
            return GeneratedMessageLite.m124022a(f168778d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bzbu.m125628b(), "c"});
        } else if (i2 == 3) {
            return new byxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f168778d);
            }
            if (i2 == 5) {
                return f168778d;
            }
            bxxk bxxk = f168779e;
            if (bxxk == null) {
                synchronized (byxq.class) {
                    bxxk = f168779e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168778d);
                        f168779e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
