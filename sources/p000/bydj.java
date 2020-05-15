package p000;

/* renamed from: bydj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bydj f165795b;

    /* renamed from: c */
    private static volatile bxxk f165796c;

    /* renamed from: a */
    public bxwc f165797a = bxxn.f165040b;

    static {
        bydj bydj = new bydj();
        f165795b = bydj;
        bxvk.m124024a(bydj.class, bydj);
    }

    private bydj() {
    }

    /* renamed from: a */
    public static bydj m124680a(byte[] bArr) {
        bxvk a = bxvk.m124015a(f165795b, bArr, 0, bArr.length, bxus.m123743b());
        bxvk.m124027b(a);
        return (bydj) a;
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
            return bxvk.m124022a(f165795b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bydj();
        } else {
            if (i2 == 4) {
                return new bxvd(f165795b);
            }
            if (i2 == 5) {
                return f165795b;
            }
            bxxk bxxk = f165796c;
            if (bxxk == null) {
                synchronized (bydj.class) {
                    bxxk = f165796c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165795b);
                        f165796c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
