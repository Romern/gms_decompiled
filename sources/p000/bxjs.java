package p000;

/* renamed from: bxjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxjs f163672d;

    /* renamed from: e */
    private static volatile bxxk f163673e;

    /* renamed from: a */
    public int f163674a;

    /* renamed from: b */
    public bxjc f163675b;

    /* renamed from: c */
    public bxwc f163676c = bxxn.f165040b;

    static {
        bxjs bxjs = new bxjs();
        f163672d = bxjs;
        GeneratedMessageLite.m124024a(bxjs.class, bxjs);
    }

    private bxjs() {
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
            return GeneratedMessageLite.m124022a(f163672d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxjs();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163672d;
            }
            bxxk bxxk = f163673e;
            if (bxxk == null) {
                synchronized (bxjs.class) {
                    bxxk = f163673e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163672d);
                        f163673e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
