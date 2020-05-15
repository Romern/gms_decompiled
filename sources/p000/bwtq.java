package p000;

/* renamed from: bwtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwtq f160986c;

    /* renamed from: d */
    public static final bxvj f160987d;

    /* renamed from: e */
    private static volatile bxxk f160988e;

    /* renamed from: a */
    public int f160989a = 0;

    /* renamed from: b */
    public Object f160990b;

    static {
        bwtq bwtq = new bwtq();
        f160986c = bwtq;
        bxvk.m124024a(bwtq.class, bwtq);
        bwxl bwxl = bwxl.f161383i;
        bwtq bwtq2 = f160986c;
        f160987d = bxvk.m124006a(bwxl, bwtq2, bwtq2, 265707483, bxzf.MESSAGE);
    }

    private bwtq() {
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
            return bxvk.m124022a(f160986c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", bwtt.class});
        } else if (i2 == 3) {
            return new bwtq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160986c);
            }
            if (i2 == 5) {
                return f160986c;
            }
            bxxk bxxk = f160988e;
            if (bxxk == null) {
                synchronized (bwtq.class) {
                    bxxk = f160988e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160986c);
                        f160988e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
