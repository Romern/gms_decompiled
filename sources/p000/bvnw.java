package p000;

/* renamed from: bvnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvnw f156971f;

    /* renamed from: g */
    private static volatile bxxk f156972g;

    /* renamed from: a */
    public int f156973a;

    /* renamed from: b */
    public long f156974b;

    /* renamed from: c */
    public bxwc f156975c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f156976d = bxxn.f165040b;

    /* renamed from: e */
    public bvnk f156977e;

    static {
        bvnw bvnw = new bvnw();
        f156971f = bvnw;
        GeneratedMessageLite.m124024a(bvnw.class, bvnw);
    }

    private bvnw() {
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
            return GeneratedMessageLite.m124022a(f156971f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0002\u0000\u0003စ\u0002\u0004\u001b\u0005\u001b\u0006ဉ\u0003", new Object[]{"a", "b", "c", bvnv.class, "d", bvnn.class, "e"});
        } else if (i2 == 3) {
            return new bvnw();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156971f;
            }
            bxxk bxxk = f156972g;
            if (bxxk == null) {
                synchronized (bvnw.class) {
                    bxxk = f156972g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156971f);
                        f156972g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73384a() {
        if (!this.f156976d.mo73666a()) {
            this.f156976d = GeneratedMessageLite.m124021a(this.f156976d);
        }
    }
}
