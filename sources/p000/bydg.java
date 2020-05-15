package p000;

/* renamed from: bydg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bydg f165780g;

    /* renamed from: i */
    private static volatile bxxk f165781i;

    /* renamed from: a */
    public bxvt f165782a = bxvm.f164965b;

    /* renamed from: b */
    public int f165783b;

    /* renamed from: c */
    public boolean f165784c;

    /* renamed from: d */
    public boolean f165785d;

    /* renamed from: e */
    public int f165786e;

    /* renamed from: f */
    public int f165787f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f165788h;

    static {
        bydg bydg = new bydg();
        f165780g = bydg;
        bxvk.m124024a(bydg.class, bydg);
    }

    private bydg() {
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
            return bxvk.m124022a(f165780g, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001'\u0002\u0004\u0003\u0007\u0004\u0007\u0005\f\u0006\u0007\b\u0004", new Object[]{"a", "b", "c", "d", "e", "h", "f"});
        } else if (i2 == 3) {
            return new bydg();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f165780g;
            }
            bxxk bxxk = f165781i;
            if (bxxk == null) {
                synchronized (bydg.class) {
                    bxxk = f165781i;
                    if (bxxk == null) {
                        bxxk = new bxve(f165780g);
                        f165781i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
