package p000;

/* renamed from: bofk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bofk f132917c;

    /* renamed from: d */
    private static volatile bxxk f132918d;

    /* renamed from: a */
    public int f132919a;

    /* renamed from: b */
    public int f132920b;

    static {
        bofk bofk = new bofk();
        f132917c = bofk;
        bxvk.m124024a(bofk.class, bofk);
    }

    private bofk() {
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
            return bxvk.m124022a(f132917c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bofj.f132916a});
        } else if (i2 == 3) {
            return new bofk();
        } else {
            if (i2 == 4) {
                return new bxvd(f132917c);
            }
            if (i2 == 5) {
                return f132917c;
            }
            bxxk bxxk = f132918d;
            if (bxxk == null) {
                synchronized (bofk.class) {
                    bxxk = f132918d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132917c);
                        f132918d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
