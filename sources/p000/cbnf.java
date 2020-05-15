package p000;

/* renamed from: cbnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbnf f177723c;

    /* renamed from: d */
    private static volatile bxxk f177724d;

    /* renamed from: a */
    public cbno f177725a;

    /* renamed from: b */
    public bxwc f177726b = bxxn.f165040b;

    static {
        cbnf cbnf = new cbnf();
        f177723c = cbnf;
        bxvk.m124024a(cbnf.class, cbnf);
    }

    private cbnf() {
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
            return bxvk.m124022a(f177723c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\t\u0004\u001b", new Object[]{"a", "b", cbmq.class});
        } else if (i2 == 3) {
            return new cbnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f177723c);
            }
            if (i2 == 5) {
                return f177723c;
            }
            bxxk bxxk = f177724d;
            if (bxxk == null) {
                synchronized (cbnf.class) {
                    bxxk = f177724d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177723c);
                        f177724d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
