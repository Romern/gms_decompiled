package p000;

/* renamed from: bsly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsly extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsly f144980b;

    /* renamed from: d */
    private static volatile bxxk f144981d;

    /* renamed from: a */
    public boolean f144982a;

    /* renamed from: c */
    private int f144983c;

    static {
        bsly bsly = new bsly();
        f144980b = bsly;
        bxvk.m124024a(bsly.class, bsly);
    }

    private bsly() {
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
            return bxvk.m124022a(f144980b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsly();
        } else {
            if (i2 == 4) {
                return new bxvd(f144980b);
            }
            if (i2 == 5) {
                return f144980b;
            }
            bxxk bxxk = f144981d;
            if (bxxk == null) {
                synchronized (bsly.class) {
                    bxxk = f144981d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144980b);
                        f144981d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
