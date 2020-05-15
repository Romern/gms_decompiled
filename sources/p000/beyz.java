package p000;

/* renamed from: beyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beyz extends bxvk implements bxxd {

    /* renamed from: i */
    public static final beyz f113079i;

    /* renamed from: j */
    private static volatile bxxk f113080j;

    /* renamed from: a */
    public int f113081a;

    /* renamed from: b */
    public int f113082b;

    /* renamed from: c */
    public int f113083c;

    /* renamed from: d */
    public float f113084d;

    /* renamed from: e */
    public float f113085e;

    /* renamed from: f */
    public float f113086f;

    /* renamed from: g */
    public float f113087g;

    /* renamed from: h */
    public boolean f113088h;

    static {
        beyz beyz = new beyz();
        f113079i = beyz;
        bxvk.m124024a(beyz.class, beyz);
    }

    private beyz() {
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
            return bxvk.m124022a(f113079i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new beyz();
        } else {
            if (i2 == 4) {
                return new bxvd(f113079i);
            }
            if (i2 == 5) {
                return f113079i;
            }
            bxxk bxxk = f113080j;
            if (bxxk == null) {
                synchronized (beyz.class) {
                    bxxk = f113080j;
                    if (bxxk == null) {
                        bxxk = new bxve(f113079i);
                        f113080j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
