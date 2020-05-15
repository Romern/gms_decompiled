package p000;

/* renamed from: lte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lte extends bxvk implements bxxd {

    /* renamed from: d */
    public static final lte f32897d;

    /* renamed from: f */
    private static volatile bxxk f32898f;

    /* renamed from: a */
    public int f32899a;

    /* renamed from: b */
    public int f32900b;

    /* renamed from: c */
    public boolean f32901c = true;

    /* renamed from: e */
    private boolean f32902e;

    static {
        lte lte = new lte();
        f32897d = lte;
        bxvk.m124024a(lte.class, lte);
    }

    private lte() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m24370a(lte lte) {
        lte.f32899a |= 4;
        lte.f32902e = true;
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
            return bxvk.m124022a(f32897d, "\u0001\u0003\u0000\u0001\u0018.\u0003\u0000\u0000\u0000\u0018င\u0000\"ဇ\u0002.ဇ\u0005", new Object[]{"a", "b", "e", "c"});
        } else if (i2 == 3) {
            return new lte();
        } else {
            if (i2 == 4) {
                return new bxvd(f32897d);
            }
            if (i2 == 5) {
                return f32897d;
            }
            bxxk bxxk = f32898f;
            if (bxxk == null) {
                synchronized (lte.class) {
                    bxxk = f32898f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32897d);
                        f32898f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
