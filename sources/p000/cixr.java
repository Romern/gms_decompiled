package p000;

/* renamed from: cixr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cixr f191710d;

    /* renamed from: f */
    private static volatile bxxk f191711f;

    /* renamed from: a */
    public int f191712a;

    /* renamed from: b */
    public int f191713b;

    /* renamed from: c */
    public float f191714c;

    /* renamed from: e */
    private int f191715e;

    static {
        cixr cixr = new cixr();
        f191710d = cixr;
        bxvk.m124024a(cixr.class, cixr);
    }

    private cixr() {
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
            return bxvk.m124022a(f191710d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new cixr();
        } else {
            if (i2 == 4) {
                return new bxvd(f191710d);
            }
            if (i2 == 5) {
                return f191710d;
            }
            bxxk bxxk = f191711f;
            if (bxxk == null) {
                synchronized (cixr.class) {
                    bxxk = f191711f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191710d);
                        f191711f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
