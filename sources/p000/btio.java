package p000;

/* renamed from: btio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btio extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final btio f148996k;

    /* renamed from: l */
    private static volatile bxxk f148997l;

    /* renamed from: a */
    public int f148998a;

    /* renamed from: b */
    public int f148999b;

    /* renamed from: c */
    public int f149000c;

    /* renamed from: d */
    public boolean f149001d;

    /* renamed from: e */
    public bxwc f149002e = bxxn.f165040b;

    /* renamed from: f */
    public boolean f149003f;

    /* renamed from: g */
    public long f149004g;

    /* renamed from: h */
    public String f149005h = "";

    /* renamed from: i */
    public bxwc f149006i = bxxn.f165040b;

    /* renamed from: j */
    public String f149007j = "";

    static {
        btio btio = new btio();
        f148996k = btio;
        GeneratedMessageLite.m124024a(btio.class, btio);
    }

    private btio() {
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
            return GeneratedMessageLite.m124022a(f148996k, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0002\u0000\u0001\u0004\u0003\u0004\u0004\u0004\u0006\u0007\u0007Ț\b\u0002\t\u0007\nȚ\u000bȈ\fȈ", new Object[]{"a", "b", "c", "d", "e", "g", "f", "i", "h", "j"});
        } else if (i2 == 3) {
            return new btio();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148996k;
            }
            bxxk bxxk = f148997l;
            if (bxxk == null) {
                synchronized (btio.class) {
                    bxxk = f148997l;
                    if (bxxk == null) {
                        bxxk = new bxve(f148996k);
                        f148997l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
