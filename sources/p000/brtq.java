package p000;

/* renamed from: brtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brtq f143331d;

    /* renamed from: e */
    private static volatile bxxk f143332e;

    /* renamed from: a */
    public int f143333a;

    /* renamed from: b */
    public brtw f143334b;

    /* renamed from: c */
    public int f143335c;

    static {
        brtq brtq = new brtq();
        f143331d = brtq;
        bxvk.m124024a(brtq.class, brtq);
    }

    private brtq() {
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
            return bxvk.m124022a(f143331d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brtq();
        } else {
            if (i2 == 4) {
                return new bxvd(f143331d);
            }
            if (i2 == 5) {
                return f143331d;
            }
            bxxk bxxk = f143332e;
            if (bxxk == null) {
                synchronized (brtq.class) {
                    bxxk = f143332e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143331d);
                        f143332e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
