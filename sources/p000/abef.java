package p000;

/* renamed from: abef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abef extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abef f57185c;

    /* renamed from: d */
    private static volatile bxxk f57186d;

    /* renamed from: a */
    public int f57187a = 0;

    /* renamed from: b */
    public Object f57188b;

    static {
        abef abef = new abef();
        f57185c = abef;
        bxvk.m124024a(abef.class, abef);
    }

    private abef() {
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
            return bxvk.m124022a(f57185c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new abef();
        } else {
            if (i2 == 4) {
                return new bxvd(f57185c);
            }
            if (i2 == 5) {
                return f57185c;
            }
            bxxk bxxk = f57186d;
            if (bxxk == null) {
                synchronized (abef.class) {
                    bxxk = f57186d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57185c);
                        f57186d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
