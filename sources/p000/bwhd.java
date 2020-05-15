package p000;

/* renamed from: bwhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwhd f159491c;

    /* renamed from: e */
    private static volatile bxxk f159492e;

    /* renamed from: a */
    public int f159493a;

    /* renamed from: b */
    public bmaf f159494b;

    /* renamed from: d */
    private int f159495d;

    static {
        bwhd bwhd = new bwhd();
        f159491c = bwhd;
        bxvk.m124024a(bwhd.class, bwhd);
    }

    private bwhd() {
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
            return bxvk.m124022a(f159491c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwhd();
        } else {
            if (i2 == 4) {
                return new bxvd(f159491c);
            }
            if (i2 == 5) {
                return f159491c;
            }
            bxxk bxxk = f159492e;
            if (bxxk == null) {
                synchronized (bwhd.class) {
                    bxxk = f159492e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159491c);
                        f159492e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
