package p000;

/* renamed from: cbon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbon extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbon f177839b;

    /* renamed from: c */
    private static volatile bxxk f177840c;

    /* renamed from: a */
    public String f177841a = "";

    static {
        cbon cbon = new cbon();
        f177839b = cbon;
        bxvk.m124024a(cbon.class, cbon);
    }

    private cbon() {
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
            return bxvk.m124022a(f177839b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbon();
        } else {
            if (i2 == 4) {
                return new bxvd(f177839b);
            }
            if (i2 == 5) {
                return f177839b;
            }
            bxxk bxxk = f177840c;
            if (bxxk == null) {
                synchronized (cbon.class) {
                    bxxk = f177840c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177839b);
                        f177840c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}