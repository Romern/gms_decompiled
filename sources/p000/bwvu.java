package p000;

/* renamed from: bwvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwvu f161174c;

    /* renamed from: d */
    public static final bxvj f161175d;

    /* renamed from: e */
    private static volatile bxxk f161176e;

    /* renamed from: a */
    public int f161177a = 0;

    /* renamed from: b */
    public Object f161178b;

    static {
        bwvu bwvu = new bwvu();
        f161174c = bwvu;
        GeneratedMessageLite.m124024a(bwvu.class, bwvu);
        bwoi bwoi = bwoi.f160451f;
        bwvu bwvu2 = f161174c;
        f161175d = GeneratedMessageLite.m124006a(bwoi, bwvu2, bwvu2, 232060283, bxzf.MESSAGE);
    }

    private bwvu() {
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
            return GeneratedMessageLite.m124022a(f161174c, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f161174c);
            }
            if (i2 == 5) {
                return f161174c;
            }
            bxxk bxxk = f161176e;
            if (bxxk == null) {
                synchronized (bwvu.class) {
                    bxxk = f161176e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161174c);
                        f161176e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
