package p000;

/* renamed from: bxhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhf extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxhf f163359g;

    /* renamed from: h */
    private static volatile bxxk f163360h;

    /* renamed from: a */
    public int f163361a;

    /* renamed from: b */
    public int f163362b;

    /* renamed from: c */
    public int f163363c;

    /* renamed from: d */
    public int f163364d;

    /* renamed from: e */
    public int f163365e;

    /* renamed from: f */
    public int f163366f;

    static {
        bxhf bxhf = new bxhf();
        f163359g = bxhf;
        GeneratedMessageLite.m124024a(bxhf.class, bxhf);
    }

    private bxhf() {
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
            return GeneratedMessageLite.m124022a(f163359g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bxhf();
        } else {
            if (i2 == 4) {
                return new bxvd(f163359g);
            }
            if (i2 == 5) {
                return f163359g;
            }
            bxxk bxxk = f163360h;
            if (bxxk == null) {
                synchronized (bxhf.class) {
                    bxxk = f163360h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163359g);
                        f163360h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
