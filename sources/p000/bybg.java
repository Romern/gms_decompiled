package p000;

/* renamed from: bybg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bybg f165492c;

    /* renamed from: d */
    private static volatile bxxk f165493d;

    /* renamed from: a */
    public int f165494a = 0;

    /* renamed from: b */
    public Object f165495b;

    static {
        bybg bybg = new bybg();
        f165492c = bybg;
        GeneratedMessageLite.m124024a(bybg.class, bybg);
    }

    private bybg() {
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
            return GeneratedMessageLite.m124022a(f165492c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ဵ\u0000\u0003ဳ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bybg();
        } else {
            if (i2 == 4) {
                return new bxvd(f165492c);
            }
            if (i2 == 5) {
                return f165492c;
            }
            bxxk bxxk = f165493d;
            if (bxxk == null) {
                synchronized (bybg.class) {
                    bxxk = f165493d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165492c);
                        f165493d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
