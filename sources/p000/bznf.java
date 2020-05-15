package p000;

/* renamed from: bznf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznf extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bznf f170700h;

    /* renamed from: i */
    private static volatile bxxk f170701i;

    /* renamed from: a */
    public int f170702a;

    /* renamed from: b */
    public bxwc f170703b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f170704c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f170705d = bxxn.f165040b;

    /* renamed from: e */
    public int f170706e = 4;

    /* renamed from: f */
    public bzmf f170707f;

    /* renamed from: g */
    public bzme f170708g;

    static {
        bznf bznf = new bznf();
        f170700h = bznf;
        GeneratedMessageLite.m124024a(bznf.class, bznf);
    }

    private bznf() {
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
            return GeneratedMessageLite.m124022a(f170700h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0003\u0000\u0002\u001b\u0004ဌ\u0002\u0005\u001b\u0006ဉ\u0003\u0007\u001b\bဉ\u0004", new Object[]{"a", "d", bzll.class, "e", bzne.f170699a, "b", bzly.class, "f", "c", bzlz.class, "g"});
        } else if (i2 == 3) {
            return new bznf();
        } else {
            if (i2 == 4) {
                return new bznd();
            }
            if (i2 == 5) {
                return f170700h;
            }
            bxxk bxxk = f170701i;
            if (bxxk == null) {
                synchronized (bznf.class) {
                    bxxk = f170701i;
                    if (bxxk == null) {
                        bxxk = new bxve(f170700h);
                        f170701i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
