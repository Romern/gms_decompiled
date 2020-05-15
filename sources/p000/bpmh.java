package p000;

/* renamed from: bpmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmh extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bpmh f138250k;

    /* renamed from: l */
    private static volatile bxxk f138251l;

    /* renamed from: a */
    public int f138252a;

    /* renamed from: b */
    public float f138253b;

    /* renamed from: c */
    public float f138254c;

    /* renamed from: d */
    public float f138255d;

    /* renamed from: e */
    public int f138256e;

    /* renamed from: f */
    public long f138257f;

    /* renamed from: g */
    public long f138258g;

    /* renamed from: h */
    public long f138259h;

    /* renamed from: i */
    public long f138260i;

    /* renamed from: j */
    public long f138261j;

    static {
        bpmh bpmh = new bpmh();
        f138250k = bpmh;
        bxvk.m124024a(bpmh.class, bpmh);
    }

    private bpmh() {
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
            return bxvk.m124022a(f138250k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bpmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f138250k);
            }
            if (i2 == 5) {
                return f138250k;
            }
            bxxk bxxk = f138251l;
            if (bxxk == null) {
                synchronized (bpmh.class) {
                    bxxk = f138251l;
                    if (bxxk == null) {
                        bxxk = new bxve(f138250k);
                        f138251l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
