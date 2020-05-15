package p000;

/* renamed from: bpty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpty extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bpty f139200m;

    /* renamed from: n */
    private static volatile bxxk f139201n;

    /* renamed from: a */
    public int f139202a;

    /* renamed from: b */
    public long f139203b;

    /* renamed from: c */
    public int f139204c;

    /* renamed from: d */
    public String f139205d = "";

    /* renamed from: e */
    public long f139206e;

    /* renamed from: f */
    public long f139207f;

    /* renamed from: g */
    public long f139208g;

    /* renamed from: h */
    public bxwc f139209h = bxxn.f165040b;

    /* renamed from: i */
    public int f139210i;

    /* renamed from: j */
    public long f139211j;

    /* renamed from: k */
    public String f139212k = "com.google.android.gms";

    /* renamed from: l */
    public float f139213l;

    static {
        bpty bpty = new bpty();
        f139200m = bpty;
        GeneratedMessageLite.m124024a(bpty.class, bpty);
    }

    private bpty() {
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
            return GeneratedMessageLite.m124022a(f139200m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007\u001a\bင\u0006\tဂ\u0007\nဈ\b\u000bခ\t", new Object[]{"a", "b", "c", bptx.f139199a, "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bpty();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139200m;
            }
            bxxk bxxk = f139201n;
            if (bxxk == null) {
                synchronized (bpty.class) {
                    bxxk = f139201n;
                    if (bxxk == null) {
                        bxxk = new bxve(f139200m);
                        f139201n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
