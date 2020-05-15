package p000;

/* renamed from: bzch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzch extends bxvg implements bxvh {

    /* renamed from: e */
    public static final bzch f169323e;

    /* renamed from: g */
    private static volatile bxxk f169324g;

    /* renamed from: a */
    public int f169325a;

    /* renamed from: b */
    public bzcl f169326b;

    /* renamed from: c */
    public byzl f169327c;

    /* renamed from: d */
    public byyw f169328d;

    /* renamed from: f */
    private byte f169329f = 2;

    static {
        bzch bzch = new bzch();
        f169323e = bzch;
        GeneratedMessageLite.m124024a(bzch.class, bzch);
    }

    private bzch() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169329f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169329f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169323e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzch();
        } else {
            if (i2 == 4) {
                return new bxvf(f169323e);
            }
            if (i2 == 5) {
                return f169323e;
            }
            bxxk bxxk = f169324g;
            if (bxxk == null) {
                synchronized (bzch.class) {
                    bxxk = f169324g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169323e);
                        f169324g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
