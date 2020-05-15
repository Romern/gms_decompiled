package p000;

/* renamed from: bufh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bufh f153697b;

    /* renamed from: d */
    private static volatile bxxk f153698d;

    /* renamed from: a */
    public long f153699a;

    /* renamed from: c */
    private int f153700c;

    static {
        bufh bufh = new bufh();
        f153697b = bufh;
        bxvk.m124024a(bufh.class, bufh);
    }

    private bufh() {
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
            return bxvk.m124022a(f153697b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bufh();
        } else {
            if (i2 == 4) {
                return new bxvd(f153697b);
            }
            if (i2 == 5) {
                return f153697b;
            }
            bxxk bxxk = f153698d;
            if (bxxk == null) {
                synchronized (bufh.class) {
                    bxxk = f153698d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153697b);
                        f153698d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
