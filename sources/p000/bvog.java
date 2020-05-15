package p000;

/* renamed from: bvog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvog extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvog f157030e;

    /* renamed from: f */
    private static volatile bxxk f157031f;

    /* renamed from: a */
    public int f157032a;

    /* renamed from: b */
    public String f157033b = "";

    /* renamed from: c */
    public bzrv f157034c;

    /* renamed from: d */
    public float f157035d;

    static {
        bvog bvog = new bvog();
        f157030e = bvog;
        bxvk.m124024a(bvog.class, bvog);
    }

    private bvog() {
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
            return bxvk.m124022a(f157030e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvog();
        } else {
            if (i2 == 4) {
                return new bxvd(f157030e);
            }
            if (i2 == 5) {
                return f157030e;
            }
            bxxk bxxk = f157031f;
            if (bxxk == null) {
                synchronized (bvog.class) {
                    bxxk = f157031f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157030e);
                        f157031f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
