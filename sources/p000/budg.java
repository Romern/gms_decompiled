package p000;

/* renamed from: budg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final budg f153459e;

    /* renamed from: g */
    private static volatile bxxk f153460g;

    /* renamed from: a */
    public float f153461a;

    /* renamed from: b */
    public float f153462b;

    /* renamed from: c */
    public float f153463c;

    /* renamed from: d */
    public float f153464d;

    /* renamed from: f */
    private int f153465f;

    static {
        budg budg = new budg();
        f153459e = budg;
        bxvk.m124024a(budg.class, budg);
    }

    private budg() {
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
            return bxvk.m124022a(f153459e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new budg();
        } else {
            if (i2 == 4) {
                return new bxvd(f153459e);
            }
            if (i2 == 5) {
                return f153459e;
            }
            bxxk bxxk = f153460g;
            if (bxxk == null) {
                synchronized (budg.class) {
                    bxxk = f153460g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153459e);
                        f153460g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
