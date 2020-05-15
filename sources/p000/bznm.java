package p000;

/* renamed from: bznm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bznm f170722c;

    /* renamed from: e */
    private static volatile bxxk f170723e;

    /* renamed from: a */
    public int f170724a;

    /* renamed from: b */
    public bzmb f170725b;

    /* renamed from: d */
    private int f170726d;

    static {
        bznm bznm = new bznm();
        f170722c = bznm;
        bxvk.m124024a(bznm.class, bznm);
    }

    private bznm() {
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
            return bxvk.m124022a(f170722c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဉ\u0002", new Object[]{"d", "a", bznk.f170721a, "b"});
        } else if (i2 == 3) {
            return new bznm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170722c);
            }
            if (i2 == 5) {
                return f170722c;
            }
            bxxk bxxk = f170723e;
            if (bxxk == null) {
                synchronized (bznm.class) {
                    bxxk = f170723e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170722c);
                        f170723e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
