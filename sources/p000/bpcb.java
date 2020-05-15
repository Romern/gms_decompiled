package p000;

/* renamed from: bpcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcb extends bxvg implements bxvh {

    /* renamed from: g */
    public static final bpcb f135695g;

    /* renamed from: i */
    private static volatile bxxk f135696i;

    /* renamed from: a */
    public int f135697a;

    /* renamed from: b */
    public int f135698b;

    /* renamed from: c */
    public int f135699c = -1;

    /* renamed from: d */
    public bxvt f135700d = bxvm.f164965b;

    /* renamed from: e */
    public byfn f135701e;

    /* renamed from: f */
    public int f135702f;

    /* renamed from: h */
    private byte f135703h = 2;

    static {
        bpcb bpcb = new bpcb();
        f135695g = bpcb;
        GeneratedMessageLite.m124024a(bpcb.class, bpcb);
    }

    private bpcb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f135703h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f135703h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f135695g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0001\u0001င\u0000\u0003င\u0001\u0004\u0016\u0006ဌ\u0005\u000bᐉ\u0004", new Object[]{"a", "b", "c", "d", "f", bpbz.f135694a, "e"});
        } else if (i2 == 3) {
            return new bpcb();
        } else {
            if (i2 == 4) {
                return new bxvf(f135695g);
            }
            if (i2 == 5) {
                return f135695g;
            }
            bxxk bxxk = f135696i;
            if (bxxk == null) {
                synchronized (bpcb.class) {
                    bxxk = f135696i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135695g);
                        f135696i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
