package p000;

/* renamed from: byek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byek extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byek f165909d;

    /* renamed from: e */
    private static volatile bxxk f165910e;

    /* renamed from: a */
    public int f165911a;

    /* renamed from: b */
    public int f165912b;

    /* renamed from: c */
    public int f165913c;

    static {
        byek byek = new byek();
        f165909d = byek;
        bxvk.m124024a(byek.class, byek);
    }

    private byek() {
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
            return bxvk.m124022a(f165909d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", byei.f165908a, "c"});
        } else if (i2 == 3) {
            return new byek();
        } else {
            if (i2 == 4) {
                return new bxvd(f165909d);
            }
            if (i2 == 5) {
                return f165909d;
            }
            bxxk bxxk = f165910e;
            if (bxxk == null) {
                synchronized (byek.class) {
                    bxxk = f165910e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165909d);
                        f165910e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
