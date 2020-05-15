package p000;

/* renamed from: brcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brcr f142421d;

    /* renamed from: e */
    private static volatile bxxk f142422e;

    /* renamed from: a */
    public int f142423a;

    /* renamed from: b */
    public bral f142424b;

    /* renamed from: c */
    public brcf f142425c;

    static {
        brcr brcr = new brcr();
        f142421d = brcr;
        GeneratedMessageLite.m124024a(brcr.class, brcr);
    }

    private brcr() {
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
            return GeneratedMessageLite.m124022a(f142421d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brcr();
        } else {
            if (i2 == 4) {
                return new bxvd(f142421d);
            }
            if (i2 == 5) {
                return f142421d;
            }
            bxxk bxxk = f142422e;
            if (bxxk == null) {
                synchronized (brcr.class) {
                    bxxk = f142422e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142421d);
                        f142422e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
