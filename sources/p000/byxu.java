package p000;

/* renamed from: byxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byxu f168800a;

    /* renamed from: g */
    private static volatile bxxk f168801g;

    /* renamed from: b */
    private int f168802b;

    /* renamed from: c */
    private double f168803c = 4.0d;

    /* renamed from: d */
    private int f168804d = 1;

    /* renamed from: e */
    private int f168805e;

    /* renamed from: f */
    private int f168806f = 500;

    static {
        byxu byxu = new byxu();
        f168800a = byxu;
        GeneratedMessageLite.m124024a(byxu.class, byxu);
    }

    private byxu() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125448a(byxu byxu) {
        byxu.f168802b |= 1;
        byxu.f168803c = 4.0d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125449b(byxu byxu) {
        byxu.f168802b |= 2;
        byxu.f168804d = 1;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125450c(byxu byxu) {
        byxu.f168802b |= 4;
        byxu.f168805e = 0;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125451d(byxu byxu) {
        byxu.f168802b |= 8;
        byxu.f168806f = 500;
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
            return GeneratedMessageLite.m124022a(f168800a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byxu();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f168800a;
            }
            bxxk bxxk = f168801g;
            if (bxxk == null) {
                synchronized (byxu.class) {
                    bxxk = f168801g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168800a);
                        f168801g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
