package p000;

/* renamed from: bpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpy implements assf {

    /* renamed from: a */
    public boolean f5331a;

    /* renamed from: b */
    public int f5332b = 3;

    /* renamed from: c */
    private final bpv f5333c;

    static {
        bpy.class.getSimpleName();
    }

    public bpy(bpv bpv) {
        int i = cbd.f6383a;
        this.f5333c = bpv;
    }

    /* renamed from: a */
    public final int mo3399a() {
        return this.f5332b;
    }

    /* renamed from: b */
    public final boolean mo3403b() {
        return this.f5331a;
    }

    /* renamed from: c */
    public final String mo3404c() {
        bxm bxm = this.f5333c.f5323a;
        bxo bxo = bxm.f5988j;
        if (!bxm.f5984f.f5948b.mo3426c() || bxo.mo3586a(bpk.m3440c(bxp.f6000a)) == null || bxo.mo3604s() == null) {
            return null;
        }
        return bqd.m3507a(bxm.f5984f.mo3579e(), bxo.mo3607v().mo3563i(), bxo.mo3605t().mo3563i());
    }

    /* renamed from: a */
    public final void mo3400a(int i) {
        int i2 = this.f5332b;
        try {
            this.f5332b = i;
        } finally {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(this.f5332b)};
            int i3 = cbd.f6383a;
        }
    }

    /* renamed from: a */
    public final void mo3401a(bqe bqe) {
        int i = 0;
        new Object[1][0] = bqe;
        int i2 = cbd.f6383a;
        if (bqe != null) {
            switch (bqe.ordinal()) {
                case 9:
                case 16:
                case 17:
                    i = 5;
                    break;
                case 10:
                    i = 6;
                    break;
            }
        }
        mo3400a(i);
    }

    /* renamed from: a */
    public final byte[] mo3402a(byte[] bArr) {
        int i = cbd.f6383a;
        return this.f5333c.f5325c;
    }
}
