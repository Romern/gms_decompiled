package p000;

/* renamed from: bwuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwuz f161086d;

    /* renamed from: e */
    public static final bxvj f161087e;

    /* renamed from: g */
    private static volatile bxxk f161088g;

    /* renamed from: a */
    public int f161089a = 0;

    /* renamed from: b */
    public Object f161090b;

    /* renamed from: c */
    public int f161091c;

    /* renamed from: f */
    private int f161092f;

    static {
        bwuz bwuz = new bwuz();
        f161086d = bwuz;
        bxvk.m124024a(bwuz.class, bwuz);
        bwoq bwoq = bwoq.f160480d;
        bwuz bwuz2 = f161086d;
        f161087e = bxvk.m124006a(bwoq, bwuz2, bwuz2, 231698333, bxzf.MESSAGE);
    }

    private bwuz() {
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
            return bxvk.m124022a(f161086d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwux.f161085a, blxc.class});
        } else if (i2 == 3) {
            return new bwuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f161086d);
            }
            if (i2 == 5) {
                return f161086d;
            }
            bxxk bxxk = f161088g;
            if (bxxk == null) {
                synchronized (bwuz.class) {
                    bxxk = f161088g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161086d);
                        f161088g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
