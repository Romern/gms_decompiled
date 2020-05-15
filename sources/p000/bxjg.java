package p000;

/* renamed from: bxjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxjg f163631c;

    /* renamed from: e */
    private static volatile bxxk f163632e;

    /* renamed from: a */
    public bxjd f163633a;

    /* renamed from: b */
    public bxwc f163634b = bxxn.f165040b;

    /* renamed from: d */
    private int f163635d;

    static {
        bxjg bxjg = new bxjg();
        f163631c = bxjg;
        bxvk.m124024a(bxjg.class, bxjg);
    }

    private bxjg() {
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
            return bxvk.m124022a(f163631c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bxkc.class});
        } else if (i2 == 3) {
            return new bxjg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163631c);
            }
            if (i2 == 5) {
                return f163631c;
            }
            bxxk bxxk = f163632e;
            if (bxxk == null) {
                synchronized (bxjg.class) {
                    bxxk = f163632e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163631c);
                        f163632e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
