package p000;

/* renamed from: bzkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzkq f170460c;

    /* renamed from: d */
    private static volatile bxxk f170461d;

    /* renamed from: a */
    public int f170462a;

    /* renamed from: b */
    public String f170463b = "";

    static {
        bzkq bzkq = new bzkq();
        f170460c = bzkq;
        bxvk.m124024a(bzkq.class, bzkq);
    }

    private bzkq() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f170460c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170460c);
            }
            if (i2 == 5) {
                return f170460c;
            }
            bxxk bxxk = f170461d;
            if (bxxk == null) {
                synchronized (bzkq.class) {
                    bxxk = f170461d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170460c);
                        f170461d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
