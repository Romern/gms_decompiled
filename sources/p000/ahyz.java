package p000;

/* renamed from: ahyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyz extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bxvu f68424m = new ahyy();

    /* renamed from: p */
    public static final ahyz f68425p;

    /* renamed from: q */
    private static volatile bxxk f68426q;

    /* renamed from: a */
    public int f68427a;

    /* renamed from: b */
    public String f68428b = "";

    /* renamed from: c */
    public ByteString f68429c = ByteString.f164797b;

    /* renamed from: d */
    public boolean f68430d;

    /* renamed from: e */
    public int f68431e;

    /* renamed from: f */
    public String f68432f = "";

    /* renamed from: g */
    public String f68433g = "";

    /* renamed from: h */
    public long f68434h;

    /* renamed from: i */
    public long f68435i;

    /* renamed from: j */
    public boolean f68436j;

    /* renamed from: k */
    public String f68437k = "";

    /* renamed from: l */
    public bxvt f68438l = bxvm.f164965b;

    /* renamed from: n */
    public aiaa f68439n;

    /* renamed from: o */
    public boolean f68440o;

    static {
        ahyz ahyz = new ahyz();
        f68425p = ahyz;
        GeneratedMessageLite.m124024a(ahyz.class, ahyz);
    }

    private ahyz() {
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
            return GeneratedMessageLite.m124022a(f68425p, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဂ\u0007\tဇ\b\nဈ\t\u000b\u001e\fဉ\n\rဇ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", bzay.m125602b(), "n", "o"});
        } else if (i2 == 3) {
            return new ahyz();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f68425p;
            }
            bxxk bxxk = f68426q;
            if (bxxk == null) {
                synchronized (ahyz.class) {
                    bxxk = f68426q;
                    if (bxxk == null) {
                        bxxk = new bxve(f68425p);
                        f68426q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
