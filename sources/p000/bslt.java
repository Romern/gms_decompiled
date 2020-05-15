package p000;

/* renamed from: bslt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bslt f144950d;

    /* renamed from: e */
    private static volatile bxxk f144951e;

    /* renamed from: a */
    public int f144952a;

    /* renamed from: b */
    public bslr f144953b;

    /* renamed from: c */
    public bslq f144954c;

    static {
        bslt bslt = new bslt();
        f144950d = bslt;
        GeneratedMessageLite.m124024a(bslt.class, bslt);
    }

    private bslt() {
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
            return GeneratedMessageLite.m124022a(f144950d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bslt();
        } else {
            if (i2 == 4) {
                return new bxvd(f144950d);
            }
            if (i2 == 5) {
                return f144950d;
            }
            bxxk bxxk = f144951e;
            if (bxxk == null) {
                synchronized (bslt.class) {
                    bxxk = f144951e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144950d);
                        f144951e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
