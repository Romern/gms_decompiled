package p000;

/* renamed from: abtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtm extends bxvk implements bxxd {

    /* renamed from: k */
    public static final abtm f58259k;

    /* renamed from: l */
    private static volatile bxxk f58260l;

    /* renamed from: a */
    public int f58261a;

    /* renamed from: b */
    public String f58262b = "en";

    /* renamed from: c */
    public bxwc f58263c = bxxn.f165040b;

    /* renamed from: d */
    public int f58264d;

    /* renamed from: e */
    public abtl f58265e;

    /* renamed from: f */
    public String f58266f = "";

    /* renamed from: g */
    public String f58267g = "";

    /* renamed from: h */
    public abpr f58268h;

    /* renamed from: i */
    public long f58269i;

    /* renamed from: j */
    public int f58270j;

    static {
        abtm abtm = new abtm();
        f58259k = abtm;
        bxvk.m124024a(abtm.class, abtm);
    }

    private abtm() {
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
            return bxvk.m124022a(f58259k, "\u0001\t\u0000\u0001\u0002\u001b\t\u0000\u0001\u0000\u0002ဈ\u0001\tင\u0002\u0012\u001b\u0013ဉ\u0003\u0014ဈ\u0004\u0015ဈ\u0005\u0016ဉ\u0006\u0019ဃ\u0007\u001bဋ\t", new Object[]{"a", "b", "d", "c", abpm.class, "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new abtm();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58259k;
            }
            bxxk bxxk = f58260l;
            if (bxxk == null) {
                synchronized (abtm.class) {
                    bxxk = f58260l;
                    if (bxxk == null) {
                        bxxk = new bxve(f58259k);
                        f58260l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
