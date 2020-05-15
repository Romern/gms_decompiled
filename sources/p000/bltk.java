package p000;

/* renamed from: bltk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bltk f127712c;

    /* renamed from: d */
    private static volatile bxxk f127713d;

    /* renamed from: a */
    public int f127714a;

    /* renamed from: b */
    public long f127715b;

    static {
        bltk bltk = new bltk();
        f127712c = bltk;
        bxvk.m124024a(bltk.class, bltk);
    }

    private bltk() {
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
            return bxvk.m124022a(f127712c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bltk();
        } else {
            if (i2 == 4) {
                return new bxvd(f127712c);
            }
            if (i2 == 5) {
                return f127712c;
            }
            bxxk bxxk = f127713d;
            if (bxxk == null) {
                synchronized (bltk.class) {
                    bxxk = f127713d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127712c);
                        f127713d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
