package p000;

/* renamed from: bohv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bohv f133160d;

    /* renamed from: e */
    private static volatile bxxk f133161e;

    /* renamed from: a */
    public int f133162a;

    /* renamed from: b */
    public int f133163b;

    /* renamed from: c */
    public int f133164c;

    static {
        bohv bohv = new bohv();
        f133160d = bohv;
        GeneratedMessageLite.m124024a(bohv.class, bohv);
    }

    private bohv() {
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
            return GeneratedMessageLite.m124022a(f133160d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bohv();
        } else {
            if (i2 == 4) {
                return new bxvd(f133160d);
            }
            if (i2 == 5) {
                return f133160d;
            }
            bxxk bxxk = f133161e;
            if (bxxk == null) {
                synchronized (bohv.class) {
                    bxxk = f133161e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133160d);
                        f133161e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
