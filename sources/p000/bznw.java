package p000;

/* renamed from: bznw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bznw f170769c;

    /* renamed from: d */
    private static volatile bxxk f170770d;

    /* renamed from: a */
    public int f170771a = 0;

    /* renamed from: b */
    public Object f170772b;

    static {
        bznw bznw = new bznw();
        f170769c = bznw;
        bxvk.m124024a(bznw.class, bznw);
    }

    private bznw() {
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
            return bxvk.m124022a(f170769c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bznw();
        } else {
            if (i2 == 4) {
                return new bxvd(f170769c);
            }
            if (i2 == 5) {
                return f170769c;
            }
            bxxk bxxk = f170770d;
            if (bxxk == null) {
                synchronized (bznw.class) {
                    bxxk = f170770d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170769c);
                        f170770d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
