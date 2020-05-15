package p000;

/* renamed from: vvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final vvz f50100d;

    /* renamed from: e */
    private static volatile bxxk f50101e;

    /* renamed from: a */
    public int f50102a;

    /* renamed from: b */
    public String f50103b = "";

    /* renamed from: c */
    public String f50104c = "";

    static {
        vvz vvz = new vvz();
        f50100d = vvz;
        bxvk.m124024a(vvz.class, vvz);
    }

    private vvz() {
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
            return bxvk.m124022a(f50100d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new vvz();
        } else {
            if (i2 == 4) {
                return new bxvd(f50100d);
            }
            if (i2 == 5) {
                return f50100d;
            }
            bxxk bxxk = f50101e;
            if (bxxk == null) {
                synchronized (vvz.class) {
                    bxxk = f50101e;
                    if (bxxk == null) {
                        bxxk = new bxve(f50100d);
                        f50101e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
