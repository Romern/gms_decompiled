package p000;

/* renamed from: bwqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwqq f160706c;

    /* renamed from: d */
    public static final bxvj f160707d;

    /* renamed from: e */
    private static volatile bxxk f160708e;

    /* renamed from: a */
    public int f160709a;

    /* renamed from: b */
    public String f160710b = "";

    static {
        bwqq bwqq = new bwqq();
        f160706c = bwqq;
        bxvk.m124024a(bwqq.class, bwqq);
        bwog bwog = bwog.f160437f;
        bwqq bwqq2 = f160706c;
        f160707d = bxvk.m124006a(bwog, bwqq2, bwqq2, 290848973, bxzf.MESSAGE);
    }

    private bwqq() {
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
            return bxvk.m124022a(f160706c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwqq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160706c);
            }
            if (i2 == 5) {
                return f160706c;
            }
            bxxk bxxk = f160708e;
            if (bxxk == null) {
                synchronized (bwqq.class) {
                    bxxk = f160708e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160706c);
                        f160708e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
