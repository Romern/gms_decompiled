package p000;

/* renamed from: bsnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsnj f146255c;

    /* renamed from: d */
    private static volatile bxxk f146256d;

    /* renamed from: a */
    public bxvt f146257a = bxvm.f164965b;

    /* renamed from: b */
    public bxvt f146258b = bxvm.f164965b;

    static {
        bsnj bsnj = new bsnj();
        f146255c = bsnj;
        GeneratedMessageLite.m124024a(bsnj.class, bsnj);
    }

    private bsnj() {
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
            return GeneratedMessageLite.m124022a(f146255c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002,", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsnj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f146255c;
            }
            bxxk bxxk = f146256d;
            if (bxxk == null) {
                synchronized (bsnj.class) {
                    bxxk = f146256d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146255c);
                        f146256d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
