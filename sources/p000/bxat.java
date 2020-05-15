package p000;

/* renamed from: bxat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxat extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxat f161744c;

    /* renamed from: d */
    public static final bxvj f161745d;

    /* renamed from: e */
    private static volatile bxxk f161746e;

    /* renamed from: a */
    public int f161747a;

    /* renamed from: b */
    public String f161748b = "";

    static {
        bxat bxat = new bxat();
        f161744c = bxat;
        bxvk.m124024a(bxat.class, bxat);
        bwog bwog = bwog.f160437f;
        bxat bxat2 = f161744c;
        f161745d = bxvk.m124006a(bwog, bxat2, bxat2, 265123511, bxzf.MESSAGE);
    }

    private bxat() {
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
            return bxvk.m124022a(f161744c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxat();
        } else {
            if (i2 == 4) {
                return new bxvd(f161744c);
            }
            if (i2 == 5) {
                return f161744c;
            }
            bxxk bxxk = f161746e;
            if (bxxk == null) {
                synchronized (bxat.class) {
                    bxxk = f161746e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161744c);
                        f161746e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
