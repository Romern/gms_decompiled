package p000;

/* renamed from: bvyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvyw f158235c;

    /* renamed from: d */
    private static volatile bxxk f158236d;

    /* renamed from: a */
    public int f158237a;

    /* renamed from: b */
    public String f158238b = "";

    static {
        bvyw bvyw = new bvyw();
        f158235c = bvyw;
        bxvk.m124024a(bvyw.class, bvyw);
    }

    private bvyw() {
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
            return bxvk.m124022a(f158235c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f158235c);
            }
            if (i2 == 5) {
                return f158235c;
            }
            bxxk bxxk = f158236d;
            if (bxxk == null) {
                synchronized (bvyw.class) {
                    bxxk = f158236d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158235c);
                        f158236d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
