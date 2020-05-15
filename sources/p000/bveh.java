package p000;

/* renamed from: bveh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bveh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bveh f155721d;

    /* renamed from: e */
    private static volatile bxxk f155722e;

    /* renamed from: a */
    public int f155723a;

    /* renamed from: b */
    public long f155724b;

    /* renamed from: c */
    public bxwc f155725c = bxxn.f165040b;

    static {
        bveh bveh = new bveh();
        f155721d = bveh;
        GeneratedMessageLite.m124024a(bveh.class, bveh);
    }

    private bveh() {
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
            return GeneratedMessageLite.m124022a(f155721d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bveq.class});
        } else if (i2 == 3) {
            return new bveh();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f155721d;
            }
            bxxk bxxk = f155722e;
            if (bxxk == null) {
                synchronized (bveh.class) {
                    bxxk = f155722e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155721d);
                        f155722e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
