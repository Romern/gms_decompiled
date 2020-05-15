package p000;

/* renamed from: bvtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvtk f157572d;

    /* renamed from: e */
    private static volatile bxxk f157573e;

    /* renamed from: a */
    public int f157574a;

    /* renamed from: b */
    public int f157575b;

    /* renamed from: c */
    public int f157576c;

    static {
        bvtk bvtk = new bvtk();
        f157572d = bvtk;
        bxvk.m124024a(bvtk.class, bvtk);
    }

    private bvtk() {
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
            return bxvk.m124022a(f157572d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvzc.f158280a});
        } else if (i2 == 3) {
            return new bvtk();
        } else {
            if (i2 == 4) {
                return new bxvd(f157572d);
            }
            if (i2 == 5) {
                return f157572d;
            }
            bxxk bxxk = f157573e;
            if (bxxk == null) {
                synchronized (bvtk.class) {
                    bxxk = f157573e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157572d);
                        f157573e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
