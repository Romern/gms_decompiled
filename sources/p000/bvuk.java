package p000;

/* renamed from: bvuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvuk f157703d;

    /* renamed from: e */
    private static volatile bxxk f157704e;

    /* renamed from: a */
    public int f157705a;

    /* renamed from: b */
    public bvue f157706b;

    /* renamed from: c */
    public float f157707c;

    static {
        bvuk bvuk = new bvuk();
        f157703d = bvuk;
        GeneratedMessageLite.m124024a(bvuk.class, bvuk);
    }

    private bvuk() {
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
            return GeneratedMessageLite.m124022a(f157703d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f157703d);
            }
            if (i2 == 5) {
                return f157703d;
            }
            bxxk bxxk = f157704e;
            if (bxxk == null) {
                synchronized (bvuk.class) {
                    bxxk = f157704e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157703d);
                        f157704e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
