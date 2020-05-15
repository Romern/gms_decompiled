package p000;

/* renamed from: blqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blqh f127336d;

    /* renamed from: e */
    private static volatile bxxk f127337e;

    /* renamed from: a */
    public int f127338a;

    /* renamed from: b */
    public blrk f127339b;

    /* renamed from: c */
    public bxwc f127340c = bxxn.f165040b;

    static {
        blqh blqh = new blqh();
        f127336d = blqh;
        GeneratedMessageLite.m124024a(blqh.class, blqh);
    }

    private blqh() {
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
            return GeneratedMessageLite.m124022a(f127336d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", blox.class});
        } else if (i2 == 3) {
            return new blqh();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127336d;
            }
            bxxk bxxk = f127337e;
            if (bxxk == null) {
                synchronized (blqh.class) {
                    bxxk = f127337e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127336d);
                        f127337e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo66689a() {
        if (!this.f127340c.mo73666a()) {
            this.f127340c = GeneratedMessageLite.m124021a(this.f127340c);
        }
    }
}
