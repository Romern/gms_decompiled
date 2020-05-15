package p000;

/* renamed from: bxhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhi extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bxhi f163391m;

    /* renamed from: n */
    private static volatile bxxk f163392n;

    /* renamed from: a */
    public int f163393a;

    /* renamed from: b */
    public int f163394b;

    /* renamed from: c */
    public int f163395c;

    /* renamed from: d */
    public int f163396d;

    /* renamed from: e */
    public int f163397e;

    /* renamed from: f */
    public long f163398f;

    /* renamed from: g */
    public long f163399g;

    /* renamed from: h */
    public long f163400h;

    /* renamed from: i */
    public long f163401i;

    /* renamed from: j */
    public long f163402j;

    /* renamed from: k */
    public long f163403k;

    /* renamed from: l */
    public bxwc f163404l = bxxn.f165040b;

    static {
        bxhi bxhi = new bxhi();
        f163391m = bxhi;
        GeneratedMessageLite.m124024a(bxhi.class, bxhi);
    }

    private bxhi() {
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
            return GeneratedMessageLite.m124022a(f163391m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0007ဂ\u0004\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\r\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", bxhg.class});
        } else if (i2 == 3) {
            return new bxhi();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163391m;
            }
            bxxk bxxk = f163392n;
            if (bxxk == null) {
                synchronized (bxhi.class) {
                    bxxk = f163392n;
                    if (bxxk == null) {
                        bxxk = new bxve(f163391m);
                        f163392n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
