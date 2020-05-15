package p000;

/* renamed from: cblk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cblk f177520f;

    /* renamed from: g */
    private static volatile bxxk f177521g;

    /* renamed from: a */
    public cbma f177522a;

    /* renamed from: b */
    public cblx f177523b;

    /* renamed from: c */
    public boolean f177524c;

    /* renamed from: d */
    public boolean f177525d;

    /* renamed from: e */
    public ByteString f177526e = ByteString.f164797b;

    static {
        cblk cblk = new cblk();
        f177520f = cblk;
        GeneratedMessageLite.m124024a(cblk.class, cblk);
    }

    private cblk() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f177520f, "\u0000\u0005\u0000\u0000\u0002\f\u0005\u0000\u0000\u0000\u0002\t\u0004\t\b\u0007\n\u0007\f\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cblk();
        } else {
            if (i2 == 4) {
                return new bxvd(f177520f);
            }
            if (i2 == 5) {
                return f177520f;
            }
            bxxk bxxk = f177521g;
            if (bxxk == null) {
                synchronized (cblk.class) {
                    bxxk = f177521g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177520f);
                        f177521g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
