package p000;

/* renamed from: bsjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsjr f144839b;

    /* renamed from: c */
    private static volatile bxxk f144840c;

    /* renamed from: a */
    public String f144841a = "";

    static {
        bsjr bsjr = new bsjr();
        f144839b = bsjr;
        GeneratedMessageLite.m124024a(bsjr.class, bsjr);
    }

    private bsjr() {
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
            return GeneratedMessageLite.m124022a(f144839b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f144839b);
            }
            if (i2 == 5) {
                return f144839b;
            }
            bxxk bxxk = f144840c;
            if (bxxk == null) {
                synchronized (bsjr.class) {
                    bxxk = f144840c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144839b);
                        f144840c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
