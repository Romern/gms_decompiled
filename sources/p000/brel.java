package p000;

/* renamed from: brel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brel extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brel f142672b;

    /* renamed from: e */
    private static volatile bxxk f142673e;

    /* renamed from: a */
    public bral f142674a;

    /* renamed from: c */
    private int f142675c;

    /* renamed from: d */
    private byte f142676d = 2;

    static {
        brel brel = new brel();
        f142672b = brel;
        GeneratedMessageLite.m124024a(brel.class, brel);
    }

    private brel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142676d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142676d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f142672b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brel();
        } else {
            if (i2 == 4) {
                return new bxvd(f142672b);
            }
            if (i2 == 5) {
                return f142672b;
            }
            bxxk bxxk = f142673e;
            if (bxxk == null) {
                synchronized (brel.class) {
                    bxxk = f142673e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142672b);
                        f142673e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
