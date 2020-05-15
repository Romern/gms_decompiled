package p000;

/* renamed from: abpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abpl f57866d;

    /* renamed from: e */
    private static volatile bxxk f57867e;

    /* renamed from: a */
    public int f57868a;

    /* renamed from: b */
    public String f57869b = "";

    /* renamed from: c */
    public String f57870c = "";

    static {
        abpl abpl = new abpl();
        f57866d = abpl;
        bxvk.m124024a(abpl.class, abpl);
    }

    private abpl() {
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
            return bxvk.m124022a(f57866d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abpl();
        } else {
            if (i2 == 4) {
                return new bxvd(f57866d);
            }
            if (i2 == 5) {
                return f57866d;
            }
            bxxk bxxk = f57867e;
            if (bxxk == null) {
                synchronized (abpl.class) {
                    bxxk = f57867e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57866d);
                        f57867e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
