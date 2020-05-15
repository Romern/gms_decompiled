package p000;

/* renamed from: bwyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwyt f161521c;

    /* renamed from: d */
    public static final bxvj f161522d;

    /* renamed from: g */
    private static volatile bxxk f161523g;

    /* renamed from: a */
    public int f161524a;

    /* renamed from: b */
    public bxwc f161525b = bxxn.f165040b;

    /* renamed from: e */
    private int f161526e;

    /* renamed from: f */
    private byte f161527f = 2;

    static {
        bwyt bwyt = new bwyt();
        f161521c = bwyt;
        GeneratedMessageLite.m124024a(bwyt.class, bwyt);
        bwxl bwxl = bwxl.f161383i;
        bwyt bwyt2 = f161521c;
        f161522d = GeneratedMessageLite.m124006a(bwxl, bwyt2, bwyt2, 231420908, bxzf.MESSAGE);
    }

    private bwyt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161527f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161527f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161521c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001င\u0000\u0002Л", new Object[]{"e", "a", "b", bwxl.class});
        } else if (i2 == 3) {
            return new bwyt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161521c;
            }
            bxxk bxxk = f161523g;
            if (bxxk == null) {
                synchronized (bwyt.class) {
                    bxxk = f161523g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161521c);
                        f161523g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
