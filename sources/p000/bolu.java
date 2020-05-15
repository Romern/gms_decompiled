package p000;

/* renamed from: bolu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolu extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bolu f133582h;

    /* renamed from: i */
    private static volatile bxxk f133583i;

    /* renamed from: a */
    public int f133584a;

    /* renamed from: b */
    public int f133585b;

    /* renamed from: c */
    public String f133586c = "";

    /* renamed from: d */
    public int f133587d;

    /* renamed from: e */
    public String f133588e = "";

    /* renamed from: f */
    public int f133589f = -1;

    /* renamed from: g */
    public String f133590g = "";

    static {
        bolu bolu = new bolu();
        f133582h = bolu;
        bxvk.m124024a(bolu.class, bolu);
    }

    private bolu() {
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
            return bxvk.m124022a(f133582h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002င\u0000\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006င\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bolu();
        } else {
            if (i2 == 4) {
                return new bxvd(f133582h);
            }
            if (i2 == 5) {
                return f133582h;
            }
            bxxk bxxk = f133583i;
            if (bxxk == null) {
                synchronized (bolu.class) {
                    bxxk = f133583i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133582h);
                        f133583i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
