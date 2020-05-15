package p000;

/* renamed from: byll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byll extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byll f166869h;

    /* renamed from: j */
    private static volatile bxxk f166870j;

    /* renamed from: a */
    public int f166871a;

    /* renamed from: b */
    public String f166872b = "";

    /* renamed from: c */
    public String f166873c = "";

    /* renamed from: d */
    public String f166874d = "";

    /* renamed from: e */
    public bxwc f166875e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f166876f = bxxn.f165040b;

    /* renamed from: g */
    public String f166877g = "";

    /* renamed from: i */
    private byte f166878i = 2;

    static {
        byll byll = new byll();
        f166869h = byll;
        bxvk.m124024a(byll.class, byll);
    }

    private byll() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166878i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166878i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166869h, "\u0001\u0006\u0000\u0001\u0002\u0014\u0006\u0000\u0002\u0002\u0002ဈ\u0000\u0003ဈ\u0002\u0006ဈ\u0001\tЛ\u000bЛ\u0014ဈ\u0004", new Object[]{"a", "b", "d", "c", "e", bylw.class, "f", bylx.class, "g"});
        } else if (i2 == 3) {
            return new byll();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166869h;
            }
            bxxk bxxk = f166870j;
            if (bxxk == null) {
                synchronized (byll.class) {
                    bxxk = f166870j;
                    if (bxxk == null) {
                        bxxk = new bxve(f166869h);
                        f166870j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
