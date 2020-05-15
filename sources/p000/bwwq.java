package p000;

/* renamed from: bwwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwwq f161281b;

    /* renamed from: c */
    public static final bxvj f161282c;

    /* renamed from: e */
    private static volatile bxxk f161283e;

    /* renamed from: a */
    public bxwc f161284a = bxxn.f165040b;

    /* renamed from: d */
    private byte f161285d = 2;

    static {
        bwwq bwwq = new bwwq();
        f161281b = bwwq;
        GeneratedMessageLite.m124024a(bwwq.class, bwwq);
        bwxl bwxl = bwxl.f161383i;
        bwwq bwwq2 = f161281b;
        f161282c = GeneratedMessageLite.m124006a(bwxl, bwwq2, bwwq2, 261261518, bxzf.MESSAGE);
    }

    private bwwq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161285d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161285d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161281b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bwxl.class});
        } else if (i2 == 3) {
            return new bwwq();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161281b;
            }
            bxxk bxxk = f161283e;
            if (bxxk == null) {
                synchronized (bwwq.class) {
                    bxxk = f161283e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161281b);
                        f161283e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
