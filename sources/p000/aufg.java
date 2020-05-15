package p000;

/* renamed from: aufg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aufg f91674b;

    /* renamed from: d */
    private static volatile bxxk f91675d;

    /* renamed from: a */
    public bxwc f91676a = bxxn.f165040b;

    /* renamed from: c */
    private byte f91677c = 2;

    static {
        aufg aufg = new aufg();
        f91674b = aufg;
        bxvk.m124024a(aufg.class, aufg);
    }

    private aufg() {
    }

    /* renamed from: a */
    public static aufg m76980a(byte[] bArr) {
        bxvk a = bxvk.m124015a(f91674b, bArr, 0, bArr.length, bxus.m123743b());
        bxvk.m124027b(a);
        return (aufg) a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f91677c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f91677c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f91674b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", auff.class});
        } else if (i2 == 3) {
            return new aufg();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null);
            }
            if (i2 == 5) {
                return f91674b;
            }
            bxxk bxxk = f91675d;
            if (bxxk == null) {
                synchronized (aufg.class) {
                    bxxk = f91675d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91674b);
                        f91675d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
