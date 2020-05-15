package p000;

/* renamed from: bybh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bybh f165496c;

    /* renamed from: d */
    private static volatile bxxk f165497d;

    /* renamed from: a */
    public int f165498a = 0;

    /* renamed from: b */
    public Object f165499b;

    static {
        bybh bybh = new bybh();
        f165496c = bybh;
        bxvk.m124024a(bybh.class, bybh);
    }

    private bybh() {
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
            return bxvk.m124022a(f165496c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဵ\u0000", new Object[]{"b", "a", bybg.class});
        } else if (i2 == 3) {
            return new bybh();
        } else {
            if (i2 == 4) {
                return new bxvd(f165496c);
            }
            if (i2 == 5) {
                return f165496c;
            }
            bxxk bxxk = f165497d;
            if (bxxk == null) {
                synchronized (bybh.class) {
                    bxxk = f165497d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165496c);
                        f165497d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
