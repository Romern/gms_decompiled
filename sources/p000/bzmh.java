package p000;

/* renamed from: bzmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzmh f170616c;

    /* renamed from: d */
    private static volatile bxxk f170617d;

    /* renamed from: a */
    public int f170618a;

    /* renamed from: b */
    public byuj f170619b;

    static {
        bzmh bzmh = new bzmh();
        f170616c = bzmh;
        GeneratedMessageLite.m124024a(bzmh.class, bzmh);
    }

    private bzmh() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f170616c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f170616c);
            }
            if (i2 == 5) {
                return f170616c;
            }
            bxxk bxxk = f170617d;
            if (bxxk == null) {
                synchronized (bzmh.class) {
                    bxxk = f170617d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170616c);
                        f170617d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
