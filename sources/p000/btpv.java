package p000;

/* renamed from: btpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btpv f149895c;

    /* renamed from: d */
    private static volatile bxxk f149896d;

    /* renamed from: a */
    public btpu f149897a;

    /* renamed from: b */
    public bxte f149898b;

    static {
        btpv btpv = new btpv();
        f149895c = btpv;
        bxvk.m124024a(btpv.class, btpv);
    }

    private btpv() {
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
            return bxvk.m124022a(f149895c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpv();
        } else {
            if (i2 == 4) {
                return new bxvd(f149895c);
            }
            if (i2 == 5) {
                return f149895c;
            }
            bxxk bxxk = f149896d;
            if (bxxk == null) {
                synchronized (btpv.class) {
                    bxxk = f149896d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149895c);
                        f149896d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
