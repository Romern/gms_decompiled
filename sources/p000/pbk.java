package p000;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;

/* renamed from: pbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pbk extends omn {

    /* renamed from: a */
    final /* synthetic */ pbm f38767a;

    public pbk(pbm pbm) {
        this.f38767a = pbm;
    }

    /* renamed from: a */
    private final void m30113a(List list, String str, int i, int i2, CarInfoInternal carInfoInternal, byte[] bArr) {
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbk", "a", 677, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Handoff service discovery complete %d", list.size());
        try {
            bivd bivd = (bivd) GeneratedMessageLite.m124014a(bivd.f121947o, bArr);
            if (this.f38767a.f38784j.mo22878d()) {
                bmxy.m108581a(carInfoInternal);
                carInfoInternal.f29552n = this.f38767a.f38782h;
            } else {
                carInfoInternal = CarInfoInternal.m22107a(bivd, i, i2, str, -1, -1, this.f38767a.f38782h);
            }
            this.f38767a.f38780f.post(new pbi(this, carInfoInternal, bivd, list));
        } catch (bxwf e) {
            throw new IllegalStateException("Invalid serviceDiscoveryResponse provided", e);
        }
    }

    /* renamed from: a */
    public final void mo22305a() {
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbk", "a", 614, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Tear down initiated.");
        pbm pbm = this.f38767a;
        Handler handler = pbm.f38780f;
        pan pan = pbm.f38783i;
        pan.getClass();
        handler.post(new pbh(pan));
    }

    /* renamed from: a */
    public final void mo22306a(int i, int i2, String str) {
        bnsi c = pbm.f38775a.mo68388c();
        c.mo68432a("pbk", "a", 604, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68425a("Protocol error %d (%d): %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        pbm pbm = this.f38767a;
        if (!pbm.f38787m.f38768a || !((Boolean) pbm.f38776b.mo6606a()).booleanValue()) {
            pbm pbm2 = this.f38767a;
            Handler handler = pbm2.f38780f;
            pan pan = pbm2.f38783i;
            pan.getClass();
            handler.post(new pbg(pan));
            return;
        }
        this.f38767a.f38780f.post(new pbf(this, i, i2, str));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo22307a(List list, int i, int i2, byte[] bArr) {
        m30113a(list, "", i, i2, null, bArr);
    }

    /* renamed from: a */
    public final void mo22308a(List list, byte[] bArr, Bundle bundle) {
        ClassLoader classLoader;
        if (ccpz.f179738a.mo6606a().mo76633d() && (classLoader = CarInfoInternal.class.getClassLoader()) != null) {
            bundle.setClassLoader(classLoader);
        }
        bmxy.m108600b(bundle.containsKey("HU_META_SSL_SUBJECT_NAME"));
        bmxy.m108600b(bundle.containsKey("HU_META_SSL_GAL_MAJOR_VERSION"));
        bmxy.m108600b(bundle.containsKey("HU_META_SSL_GAL_MINOR_VERSION"));
        pbm pbm = this.f38767a;
        bnsn bnsn = pbm.f38775a;
        pbr pbr = pbm.f38785k;
        if (nzi.m28224a() || pbr.f38796a >= pbr.mo22877c()) {
            pbr.m30169a(this.f38767a.f38777c, bundle);
        }
        m30113a(list, bundle.getString("HU_META_SSL_SUBJECT_NAME", ""), bundle.getInt("HU_META_SSL_GAL_MAJOR_VERSION"), bundle.getInt("HU_META_SSL_GAL_MINOR_VERSION"), (CarInfoInternal) bundle.getParcelable("HEAD_UNIT_METADATA_CAR_INFO"), bArr);
    }

    /* renamed from: a */
    public final void mo22309a(boolean z) {
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbk", "a", 598, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Handoff status %b", Boolean.valueOf(z));
        this.f38767a.f38780f.post(new pbe(this, z));
    }

    /* renamed from: a */
    public final void mo22310a(boolean z, List list, int i, int i2, byte[] bArr) {
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbk", "a", 722, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Resume complete with status %b", Boolean.valueOf(z));
        pbm pbm = this.f38767a;
        Handler handler = pbm.f38780f;
        pan pan = pbm.f38783i;
        pan.getClass();
        handler.post(new pbj(pan));
    }
}
