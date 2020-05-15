package p000;

/* renamed from: kox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kox extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kox f24642c;

    /* renamed from: d */
    private static volatile bxxk f24643d;

    /* renamed from: a */
    public int f24644a;

    /* renamed from: b */
    public String f24645b = "";

    static {
        kox kox = new kox();
        f24642c = kox;
        GeneratedMessageLite.m124024a(kox.class, kox);
    }

    private kox() {
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
            return GeneratedMessageLite.m124022a(f24642c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kox();
        } else {
            if (i2 == 4) {
                return new bxvd(f24642c);
            }
            if (i2 == 5) {
                return f24642c;
            }
            bxxk bxxk = f24643d;
            if (bxxk == null) {
                synchronized (kox.class) {
                    bxxk = f24643d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24642c);
                        f24643d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
