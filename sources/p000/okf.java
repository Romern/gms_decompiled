package p000;

import java.nio.ByteBuffer;

/* renamed from: okf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class okf extends oik {

    /* renamed from: g */
    public static final bnsn f37845g = odk.m28481a("CAR.GAL.VIDEO");

    /* renamed from: h */
    private final oke f37846h;

    /* renamed from: i */
    private int[] f37847i;

    /* renamed from: j */
    private biwj f37848j;

    /* renamed from: k */
    private int f37849k;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m29000a(biwj biwj) {
        boolean z = biwj.f122106b;
        int i = this.f37849k;
        int b = biwi.m102902b(biwj.f122105a);
        if (b == 0) {
            b = 1;
        }
        this.f37849k = b;
        if (i == 0) {
            throw null;
        } else if (i != 1) {
            if (i != 2) {
                if (b == 1) {
                    m29003h();
                } else if (b == 2) {
                    m29001a(false);
                }
            } else if (b == 1) {
                m29003h();
            }
        } else if (b == 2) {
            m29001a(false);
        } else if (b == 3) {
            m29001a(true);
        }
    }

    /* renamed from: g */
    private final okg m29002g() {
        return (okg) this.f37703f;
    }

    /* renamed from: h */
    private final void m29003h() {
        if (this.f37847i == null) {
            this.f37756q.mo21328b(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.EARLY_VIDEO_FOCUS, "Video focus gained before configurations received.");
        } else {
            this.f37846h.mo21905h();
        }
        m29002g().mo21765d();
    }

    /* renamed from: d */
    public final void mo22244d(int i) {
        int b = biwi.m102902b(i);
        if (b == 0) {
            bnsi b2 = f37845g.mo68387b();
            b2.mo68432a("okf", "d", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68409a("sendVideoFocusRequest, unknown mode=%d, setting to PROJECTED", i);
            b = 1;
        }
        bxvd da = biwm.f122109d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biwm biwm = (biwm) da.f164949b;
        biwm.f122112b = b;
        int i2 = biwm.f122111a | 2;
        biwm.f122111a = i2;
        biwm.f122113c = 0;
        biwm.f122111a = i2 | 4;
        mo22206a(32775, da.mo74062i());
    }

    /* renamed from: f */
    public final void mo22245f() {
        mo22244d(1);
    }

    /* renamed from: j */
    public final olk mo22071j() {
        return olk.VIDEO;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public okf(oke oke, birv birv, ojm ojm, okg okg) {
        super(2, oke, ojm, okg, 1, birv, r8);
        oim oim;
        if (ccur.f180000a.mo6606a().mo76856g()) {
            oim = ois.m28865a(okg);
        } else if (!ccur.f180000a.mo6606a().mo76855f()) {
            oim = new oim(okg);
        } else {
            oim = oiq.m28857a(okg);
        }
        this.f37849k = 2;
        this.f37846h = oke;
    }

    /* renamed from: a */
    private final void m29001a(boolean z) {
        this.f37846h.mo21903a(z);
        m29002g().mo21764c();
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        if (this.f37700c) {
            this.f37846h.mo21903a(false);
        }
        super.mo22084a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (i == 32776) {
            biwj biwj = (biwj) GeneratedMessageLite.m124013a(biwj.f122103c, byteBuffer, bxus.m123744c());
            if (this.f37847i == null) {
                this.f37848j = biwj;
            } else {
                m29000a(biwj);
            }
        } else {
            ccux.m131754c();
            super.mo22085a(i, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22070a(bipu bipu) {
        super.mo22070a(bipu);
        if (bipu.f121217c.size() != 0) {
            int[] a = bqcn.m112584a(bipu.f121217c);
            bmxv a2 = this.f37846h.mo21902a(a);
            if (a2.mo66813a()) {
                this.f37756q.mo21328b(bpdn.PROTOCOL_WRONG_CONFIGURATION, (bpdo) a2.mo66814b(), "no working configuration");
            } else {
                this.f37847i = a;
            }
            biwj biwj = this.f37848j;
            if (biwj != null) {
                m29000a(biwj);
                this.f37848j = null;
                return;
            }
            return;
        }
        this.f37756q.mo21328b(bpdn.PROTOCOL_WRONG_MESSAGE, bpdo.NO_VIDEO_CONFIGS, "No configuration indices.");
    }

    /* renamed from: a */
    public final void mo22243a(biwb biwb) {
        bxvd da = biwc.f122068c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biwc biwc = (biwc) da.f164949b;
        biwb.getClass();
        biwc.f122071b = biwb;
        biwc.f122070a |= 1;
        mo22206a(32778, da.mo74062i());
    }
}
