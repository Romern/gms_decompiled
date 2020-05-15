package p000;

/* renamed from: bwot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwot extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwot f160487b;

    /* renamed from: c */
    public static final bxvj f160488c;

    /* renamed from: e */
    private static volatile bxxk f160489e;

    /* renamed from: a */
    public int f160490a;

    /* renamed from: d */
    private int f160491d;

    static {
        bwot bwot = new bwot();
        f160487b = bwot;
        bxvk.m124024a(bwot.class, bwot);
        bwou bwou = bwou.f160492e;
        bwot bwot2 = f160487b;
        f160488c = bxvk.m124006a(bwou, bwot2, bwot2, 232946268, bxzf.MESSAGE);
    }

    private bwot() {
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
            return bxvk.m124022a(f160487b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwor.f160486a});
        } else if (i2 == 3) {
            return new bwot();
        } else {
            if (i2 == 4) {
                return new bxvd(f160487b);
            }
            if (i2 == 5) {
                return f160487b;
            }
            bxxk bxxk = f160489e;
            if (bxxk == null) {
                synchronized (bwot.class) {
                    bxxk = f160489e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160487b);
                        f160489e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
