package p000;

/* renamed from: bvup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvup extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvup f157719e;

    /* renamed from: f */
    private static volatile bxxk f157720f;

    /* renamed from: a */
    public int f157721a;

    /* renamed from: b */
    public int f157722b;

    /* renamed from: c */
    public int f157723c = 1;

    /* renamed from: d */
    public int f157724d;

    static {
        bvup bvup = new bvup();
        f157719e = bvup;
        GeneratedMessageLite.m124024a(bvup.class, bvup);
    }

    private bvup() {
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
            return GeneratedMessageLite.m124022a(f157719e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bvun.f157718a, "d"});
        } else if (i2 == 3) {
            return new bvup();
        } else {
            if (i2 == 4) {
                return new bxvd(f157719e);
            }
            if (i2 == 5) {
                return f157719e;
            }
            bxxk bxxk = f157720f;
            if (bxxk == null) {
                synchronized (bvup.class) {
                    bxxk = f157720f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157719e);
                        f157720f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
