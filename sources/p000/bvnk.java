package p000;

/* renamed from: bvnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvnk f156872d;

    /* renamed from: f */
    private static volatile bxxk f156873f;

    /* renamed from: a */
    public long f156874a;

    /* renamed from: b */
    public bxwc f156875b = bxxn.f165040b;

    /* renamed from: c */
    public long f156876c;

    /* renamed from: e */
    private int f156877e;

    static {
        bvnk bvnk = new bvnk();
        f156872d = bvnk;
        bxvk.m124024a(bvnk.class, bvnk);
    }

    private bvnk() {
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
            return bxvk.m124022a(f156872d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001", new Object[]{"e", "a", "b", bvnj.class, "c"});
        } else if (i2 == 3) {
            return new bvnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f156872d);
            }
            if (i2 == 5) {
                return f156872d;
            }
            bxxk bxxk = f156873f;
            if (bxxk == null) {
                synchronized (bvnk.class) {
                    bxxk = f156873f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156872d);
                        f156873f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
