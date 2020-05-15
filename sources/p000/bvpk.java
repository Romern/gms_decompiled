package p000;

/* renamed from: bvpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvpk f157305f;

    /* renamed from: g */
    private static volatile bxxk f157306g;

    /* renamed from: a */
    public int f157307a;

    /* renamed from: b */
    public bvov f157308b;

    /* renamed from: c */
    public int f157309c;

    /* renamed from: d */
    public String f157310d = "";

    /* renamed from: e */
    public String f157311e = "";

    static {
        bvpk bvpk = new bvpk();
        f157305f = bvpk;
        bxvk.m124024a(bvpk.class, bvpk);
    }

    private bvpk() {
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
            return bxvk.m124022a(f157305f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", bvkz.m121222b(), "d", "e"});
        } else if (i2 == 3) {
            return new bvpk();
        } else {
            if (i2 == 4) {
                return new bxvd(f157305f);
            }
            if (i2 == 5) {
                return f157305f;
            }
            bxxk bxxk = f157306g;
            if (bxxk == null) {
                synchronized (bvpk.class) {
                    bxxk = f157306g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157305f);
                        f157306g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
