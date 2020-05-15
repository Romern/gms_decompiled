package p000;

/* renamed from: bzmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzmg f170612a;

    /* renamed from: d */
    private static volatile bxxk f170613d;

    /* renamed from: b */
    private int f170614b;

    /* renamed from: c */
    private boolean f170615c;

    static {
        bzmg bzmg = new bzmg();
        f170612a = bzmg;
        bxvk.m124024a(bzmg.class, bzmg);
    }

    private bzmg() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125927a(bzmg bzmg) {
        bzmg.f170614b |= 1;
        bzmg.f170615c = true;
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
            return bxvk.m124022a(f170612a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bzmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f170612a);
            }
            if (i2 == 5) {
                return f170612a;
            }
            bxxk bxxk = f170613d;
            if (bxxk == null) {
                synchronized (bzmg.class) {
                    bxxk = f170613d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170612a);
                        f170613d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
