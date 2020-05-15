package p000;

/* renamed from: btyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btyp f152961d;

    /* renamed from: e */
    private static volatile bxxk f152962e;

    /* renamed from: a */
    public int f152963a;

    /* renamed from: b */
    public int f152964b;

    /* renamed from: c */
    public bxwc f152965c = bxxn.f165040b;

    static {
        btyp btyp = new btyp();
        f152961d = btyp;
        bxvk.m124024a(btyp.class, btyp);
    }

    private btyp() {
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
            return bxvk.m124022a(f152961d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", "c", btyq.class});
        } else if (i2 == 3) {
            return new btyp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f152961d;
            }
            bxxk bxxk = f152962e;
            if (bxxk == null) {
                synchronized (btyp.class) {
                    bxxk = f152962e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152961d);
                        f152962e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
