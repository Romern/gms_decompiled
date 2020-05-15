package p000;

/* renamed from: lta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lta extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final lta f32883a;

    /* renamed from: d */
    private static volatile bxxk f32884d;

    /* renamed from: b */
    private int f32885b;

    /* renamed from: c */
    private boolean f32886c = true;

    static {
        lta lta = new lta();
        f32883a = lta;
        GeneratedMessageLite.m124024a(lta.class, lta);
    }

    private lta() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m24364a(lta lta) {
        lta.f32885b |= 1;
        lta.f32886c = true;
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
            return GeneratedMessageLite.m124022a(f32883a, "\u0001\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဇ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new lta();
        } else {
            if (i2 == 4) {
                return new bxvd(f32883a);
            }
            if (i2 == 5) {
                return f32883a;
            }
            bxxk bxxk = f32884d;
            if (bxxk == null) {
                synchronized (lta.class) {
                    bxxk = f32884d;
                    if (bxxk == null) {
                        bxxk = new bxve(f32883a);
                        f32884d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
