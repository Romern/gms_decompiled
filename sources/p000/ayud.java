package p000;

/* renamed from: ayud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayud extends bxvk implements bxxd {

    /* renamed from: a */
    public static final ayud f98502a;

    /* renamed from: d */
    private static volatile bxxk f98503d;

    /* renamed from: b */
    private int f98504b;

    /* renamed from: c */
    private int f98505c;

    static {
        ayud ayud = new ayud();
        f98502a = ayud;
        bxvk.m124024a(ayud.class, ayud);
    }

    private ayud() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m84825a(ayud ayud) {
        ayud.f98504b |= 1;
        ayud.f98505c = 300746767;
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
            return bxvk.m124022a(f98502a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new ayud();
        } else {
            if (i2 == 4) {
                return new bxvd(f98502a);
            }
            if (i2 == 5) {
                return f98502a;
            }
            bxxk bxxk = f98503d;
            if (bxxk == null) {
                synchronized (ayud.class) {
                    bxxk = f98503d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98502a);
                        f98503d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
