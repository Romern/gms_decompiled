package p000;

/* renamed from: cixq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cixq f191707b;

    /* renamed from: c */
    private static volatile bxxk f191708c;

    /* renamed from: a */
    public bxwc f191709a = bxxn.f165040b;

    static {
        cixq cixq = new cixq();
        f191707b = cixq;
        GeneratedMessageLite.m124024a(cixq.class, cixq);
    }

    private cixq() {
    }

    /* renamed from: a */
    public static cixq m151127a(byte[] bArr) {
        GeneratedMessageLite a = GeneratedMessageLite.m124015a(f191707b, bArr, 0, bArr.length, bxus.m123743b());
        GeneratedMessageLite.m124027b(a);
        return (cixq) a;
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
            return GeneratedMessageLite.m124022a(f191707b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cixr.class});
        } else if (i2 == 3) {
            return new cixq();
        } else {
            if (i2 == 4) {
                return new bxvd(f191707b);
            }
            if (i2 == 5) {
                return f191707b;
            }
            bxxk bxxk = f191708c;
            if (bxxk == null) {
                synchronized (cixq.class) {
                    bxxk = f191708c;
                    if (bxxk == null) {
                        bxxk = new bxve(f191707b);
                        f191708c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
