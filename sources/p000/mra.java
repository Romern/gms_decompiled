package p000;

/* renamed from: mra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mra extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mra f34378e;

    /* renamed from: f */
    private static volatile bxxk f34379f;

    /* renamed from: a */
    public int f34380a;

    /* renamed from: b */
    public int f34381b;

    /* renamed from: c */
    public long f34382c;

    /* renamed from: d */
    public bxwc f34383d = bxxn.f165040b;

    static {
        mra mra = new mra();
        f34378e = mra;
        GeneratedMessageLite.m124024a(mra.class, mra);
    }

    private mra() {
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
            return GeneratedMessageLite.m124022a(f34378e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဂ\u0001", new Object[]{"a", "b", "d", mqz.class, "c"});
        } else if (i2 == 3) {
            return new mra();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34378e;
            }
            bxxk bxxk = f34379f;
            if (bxxk == null) {
                synchronized (mra.class) {
                    bxxk = f34379f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34378e);
                        f34379f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
