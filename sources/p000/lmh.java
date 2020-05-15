package p000;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: lmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lmh extends ljz implements bqfp {

    /* renamed from: f */
    public static final srn f26376f = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: g */
    private bqgg f26377g;

    /* renamed from: h */
    private final bmxv f26378h;

    public lmh(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        this.f26378h = bmxv.m108567c((MetricsContext) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.METRICS_CONTEXT")));
    }

    /* renamed from: j */
    private final void m19374j() {
        mo15167a(-1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15211i() {
        AssistStructure assistStructure = (AssistStructure) this.f26160b.getParcelable("android.view.autofill.extra.ASSIST_STRUCTURE");
        if (assistStructure == null) {
            ((bnsl) f26376f.mo68388c()).mo68405a("Missing structure");
            m19374j();
        } else if (assistStructure.getActivityComponent() == null) {
            ((bnsl) f26376f.mo68388c()).mo68405a("Missing activity component");
            m19374j();
        } else {
            Bundle bundle = this.f26160b.getBundle("android.view.autofill.extra.CLIENT_STATE");
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            int i = this.f26160b.getInt("com.google.android.gms.autofill.extra.FILL_REQUEST_ID", -1);
            lir lir = this.f26159a;
            bmxv bmxv = this.f26378h;
            ClientState a = ClientState.m7166a(bundle);
            if (bmxv.mo66813a()) {
                a.f11673e = (MetricsContext) bmxv.mo66814b();
            }
            bqgg a2 = liw.m19221a(this.f26159a).mo15186a((lis) new lmg(lir, assistStructure, a, i));
            this.f26377g = a2;
            m19373a(a2);
        }
    }

    /* renamed from: a */
    private final void m19373a(bqgg bqgg) {
        bqga.m112781a(bqgg, this, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo15164a() {
        super.mo15164a();
        liu b = liw.m19221a(this.f26159a).mo15189b("future_key");
        this.f26377g = b;
        if (b != null) {
            m19373a((bqgg) b);
        }
    }

    /* renamed from: a */
    public final void mo15167a(int i, Intent intent) {
        int i2;
        bqgg bqgg = this.f26377g;
        if (bqgg == null || bqgg.isDone()) {
            if (this.f26378h.mo66813a()) {
                i2 = ((MetricsContext) this.f26378h.mo66814b()).mo7953a();
            } else {
                i2 = 0;
            }
            super.mo15168a(i, (Intent) null, i2);
        }
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        krc.m18382a(this.f26159a).mo14830e().mo15113g(true);
        this.f26159a.startActivity(lio.m19193a((int) C0126R.string.autofill_manage_save_passwords, (int) C0126R.string.common_settings, (int) C0126R.string.common_dismiss));
        Boolean bool = (Boolean) obj;
        m19374j();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f26376f.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        m19374j();
    }
}
