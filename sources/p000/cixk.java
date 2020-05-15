package p000;

/* renamed from: cixk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cixk f191681d;

    /* renamed from: e */
    private static volatile bxxk f191682e;

    /* renamed from: a */
    public int f191683a;

    /* renamed from: b */
    public String f191684b = "";

    /* renamed from: c */
    public cixn f191685c;

    static {
        cixk cixk = new cixk();
        f191681d = cixk;
        bxvk.m124024a(cixk.class, cixk);
    }

    private cixk() {
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
            return bxvk.m124022a(f191681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cixk();
        } else {
            if (i2 == 4) {
                return new bxvd(f191681d);
            }
            if (i2 == 5) {
                return f191681d;
            }
            bxxk bxxk = f191682e;
            if (bxxk == null) {
                synchronized (cixk.class) {
                    bxxk = f191682e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191681d);
                        f191682e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
