package p000;

/* renamed from: bmin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmin extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmin f129603b;

    /* renamed from: d */
    private static volatile bxxk f129604d;

    /* renamed from: a */
    public int f129605a;

    /* renamed from: c */
    private int f129606c;

    static {
        bmin bmin = new bmin();
        f129603b = bmin;
        GeneratedMessageLite.m124024a(bmin.class, bmin);
    }

    private bmin() {
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
            return GeneratedMessageLite.m124022a(f129603b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmin();
        } else {
            if (i2 == 4) {
                return new bxvd(f129603b);
            }
            if (i2 == 5) {
                return f129603b;
            }
            bxxk bxxk = f129604d;
            if (bxxk == null) {
                synchronized (bmin.class) {
                    bxxk = f129604d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129603b);
                        f129604d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
