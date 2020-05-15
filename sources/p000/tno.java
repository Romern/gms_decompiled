package p000;

/* renamed from: tno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tno extends bxvk implements bxxd {

    /* renamed from: c */
    public static final tno f46307c;

    /* renamed from: d */
    private static volatile bxxk f46308d;

    /* renamed from: a */
    public bxwc f46309a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f46310b = bxxn.f165040b;

    static {
        tno tno = new tno();
        f46307c = tno;
        bxvk.m124024a(tno.class, tno);
    }

    private tno() {
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
            return bxvk.m124022a(f46307c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", tnp.class, "b", tnq.class});
        } else if (i2 == 3) {
            return new tno();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f46307c;
            }
            bxxk bxxk = f46308d;
            if (bxxk == null) {
                synchronized (tno.class) {
                    bxxk = f46308d;
                    if (bxxk == null) {
                        bxxk = new bxve(f46307c);
                        f46308d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
