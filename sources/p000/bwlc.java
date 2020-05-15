package p000;

/* renamed from: bwlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwlc f160086e;

    /* renamed from: f */
    private static volatile bxxk f160087f;

    /* renamed from: a */
    public int f160088a;

    /* renamed from: b */
    public bwei f160089b;

    /* renamed from: c */
    public bwkv f160090c;

    /* renamed from: d */
    public bxwc f160091d = bxxn.f165040b;

    static {
        bwlc bwlc = new bwlc();
        f160086e = bwlc;
        bxvk.m124024a(bwlc.class, bwlc);
    }

    private bwlc() {
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
            return bxvk.m124022a(f160086e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bwdr.class});
        } else if (i2 == 3) {
            return new bwlc();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f160086e;
            }
            bxxk bxxk = f160087f;
            if (bxxk == null) {
                synchronized (bwlc.class) {
                    bxxk = f160087f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160086e);
                        f160087f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
