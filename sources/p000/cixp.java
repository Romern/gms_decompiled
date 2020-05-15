package p000;

/* renamed from: cixp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cixp f191704b;

    /* renamed from: c */
    private static volatile bxxk f191705c;

    /* renamed from: a */
    public bxwc f191706a = bxxn.f165040b;

    static {
        cixp cixp = new cixp();
        f191704b = cixp;
        bxvk.m124024a(cixp.class, cixp);
    }

    private cixp() {
    }

    /* renamed from: a */
    public static cixp m151125a(byte[] bArr) {
        bxvk a = bxvk.m124015a(f191704b, bArr, 0, bArr.length, bxus.m123743b());
        bxvk.m124027b(a);
        return (cixp) a;
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
            return bxvk.m124022a(f191704b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cixo.class});
        } else if (i2 == 3) {
            return new cixp();
        } else {
            if (i2 == 4) {
                return new bxvd(f191704b);
            }
            if (i2 == 5) {
                return f191704b;
            }
            bxxk bxxk = f191705c;
            if (bxxk == null) {
                synchronized (cixp.class) {
                    bxxk = f191705c;
                    if (bxxk == null) {
                        bxxk = new bxve(f191704b);
                        f191705c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
