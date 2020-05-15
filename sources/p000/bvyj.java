package p000;

/* renamed from: bvyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvyj f158174b;

    /* renamed from: d */
    private static volatile bxxk f158175d;

    /* renamed from: a */
    public bvxs f158176a;

    /* renamed from: c */
    private int f158177c;

    static {
        bvyj bvyj = new bvyj();
        f158174b = bvyj;
        GeneratedMessageLite.m124024a(bvyj.class, bvyj);
    }

    private bvyj() {
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
            return GeneratedMessageLite.m124022a(f158174b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvyj();
        } else {
            if (i2 == 4) {
                return new bxvd(f158174b);
            }
            if (i2 == 5) {
                return f158174b;
            }
            bxxk bxxk = f158175d;
            if (bxxk == null) {
                synchronized (bvyj.class) {
                    bxxk = f158175d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158174b);
                        f158175d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
