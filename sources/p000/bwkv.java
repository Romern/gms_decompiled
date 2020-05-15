package p000;

/* renamed from: bwkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwkv f160050f;

    /* renamed from: g */
    private static volatile bxxk f160051g;

    /* renamed from: a */
    public int f160052a;

    /* renamed from: b */
    public String f160053b = "";

    /* renamed from: c */
    public String f160054c = "";

    /* renamed from: d */
    public int f160055d;

    /* renamed from: e */
    public int f160056e;

    static {
        bwkv bwkv = new bwkv();
        f160050f = bwkv;
        bxvk.m124024a(bwkv.class, bwkv);
    }

    private bwkv() {
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
            return bxvk.m124022a(f160050f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f160050f);
            }
            if (i2 == 5) {
                return f160050f;
            }
            bxxk bxxk = f160051g;
            if (bxxk == null) {
                synchronized (bwkv.class) {
                    bxxk = f160051g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160050f);
                        f160051g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
