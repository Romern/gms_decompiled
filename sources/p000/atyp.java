package p000;

/* renamed from: atyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final atyp f91140b;

    /* renamed from: c */
    private static volatile bxxk f91141c;

    /* renamed from: a */
    public bxww f91142a = bxww.f165013b;

    static {
        atyp atyp = new atyp();
        f91140b = atyp;
        GeneratedMessageLite.m124024a(atyp.class, atyp);
    }

    private atyp() {
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
            return GeneratedMessageLite.m124022a(f91140b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", atyo.f91139a});
        } else if (i2 == 3) {
            return new atyp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f91140b;
            }
            bxxk bxxk = f91141c;
            if (bxxk == null) {
                synchronized (atyp.class) {
                    bxxk = f91141c;
                    if (bxxk == null) {
                        bxxk = new bxve(f91140b);
                        f91141c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
