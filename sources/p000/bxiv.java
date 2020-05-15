package p000;

/* renamed from: bxiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxiv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxiv f163573e;

    /* renamed from: f */
    private static volatile bxxk f163574f;

    /* renamed from: a */
    public int f163575a;

    /* renamed from: b */
    public bxjd f163576b;

    /* renamed from: c */
    public bxwc f163577c = bxxn.f165040b;

    /* renamed from: d */
    public bxcm f163578d;

    static {
        bxiv bxiv = new bxiv();
        f163573e = bxiv;
        bxvk.m124024a(bxiv.class, bxiv);
    }

    private bxiv() {
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
            return bxvk.m124022a(f163573e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c\u0003ဉ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163573e);
            }
            if (i2 == 5) {
                return f163573e;
            }
            bxxk bxxk = f163574f;
            if (bxxk == null) {
                synchronized (bxiv.class) {
                    bxxk = f163574f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163573e);
                        f163574f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
