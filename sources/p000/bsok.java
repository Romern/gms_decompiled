package p000;

/* renamed from: bsok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsok extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsok f146389h;

    /* renamed from: i */
    private static volatile bxxk f146390i;

    /* renamed from: a */
    public int f146391a;

    /* renamed from: b */
    public bxvt f146392b = bxvm.f164965b;

    /* renamed from: c */
    public bxvt f146393c = bxvm.f164965b;

    /* renamed from: d */
    public int f146394d;

    /* renamed from: e */
    public boolean f146395e;

    /* renamed from: f */
    public boolean f146396f;

    /* renamed from: g */
    public boolean f146397g;

    static {
        bsok bsok = new bsok();
        f146389h = bsok;
        bxvk.m124024a(bsok.class, bsok);
    }

    private bsok() {
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
            return bxvk.m124022a(f146389h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002ဌ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006\u0016", new Object[]{"a", "c", "d", bsot.f146424a, "e", "f", "g", "b"});
        } else if (i2 == 3) {
            return new bsok();
        } else {
            if (i2 == 4) {
                return new bsoj();
            }
            if (i2 == 5) {
                return f146389h;
            }
            bxxk bxxk = f146390i;
            if (bxxk == null) {
                synchronized (bsok.class) {
                    bxxk = f146390i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146389h);
                        f146390i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
