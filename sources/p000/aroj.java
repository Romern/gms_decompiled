package p000;

/* renamed from: aroj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aroj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aroj f88002f;

    /* renamed from: g */
    private static volatile bxxk f88003g;

    /* renamed from: a */
    public int f88004a;

    /* renamed from: b */
    public int f88005b;

    /* renamed from: c */
    public int f88006c;

    /* renamed from: d */
    public int f88007d;

    /* renamed from: e */
    public bxtx f88008e = bxtx.f164797b;

    static {
        aroj aroj = new aroj();
        f88002f = aroj;
        bxvk.m124024a(aroj.class, aroj);
    }

    private aroj() {
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
            return bxvk.m124022a(f88002f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aroj();
        } else {
            if (i2 == 4) {
                return new bxvd(f88002f);
            }
            if (i2 == 5) {
                return f88002f;
            }
            bxxk bxxk = f88003g;
            if (bxxk == null) {
                synchronized (aroj.class) {
                    bxxk = f88003g;
                    if (bxxk == null) {
                        bxxk = new bxve(f88002f);
                        f88003g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
