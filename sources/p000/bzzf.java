package p000;

/* renamed from: bzzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzzf f171967d;

    /* renamed from: e */
    private static volatile bxxk f171968e;

    /* renamed from: a */
    public int f171969a;

    /* renamed from: b */
    public bzze f171970b;

    /* renamed from: c */
    public bxwc f171971c = bxxn.f165040b;

    static {
        bzzf bzzf = new bzzf();
        f171967d = bzzf;
        GeneratedMessageLite.m124024a(bzzf.class, bzzf);
    }

    private bzzf() {
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
            return GeneratedMessageLite.m124022a(f171967d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", bzze.class});
        } else if (i2 == 3) {
            return new bzzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f171967d);
            }
            if (i2 == 5) {
                return f171967d;
            }
            bxxk bxxk = f171968e;
            if (bxxk == null) {
                synchronized (bzzf.class) {
                    bxxk = f171968e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171967d);
                        f171968e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
