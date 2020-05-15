package p000;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: lni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lni extends lnb implements bqfp {

    /* renamed from: h */
    public static final srn f26446h = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: i */
    private final lnc f26447i;

    /* renamed from: j */
    private bqgg f26448j;

    /* renamed from: k */
    private final bmxv f26449k;

    public lni(lir lir, Bundle bundle, bngx bngx, lnc lnc) {
        super(lir, bundle, bngx);
        this.f26447i = lnc;
        this.f26449k = bmxv.m108567c((MetricsContext) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.METRICS_CONTEXT")));
    }

    /* renamed from: a */
    private final void m19432a(Intent intent) {
        mo15167a(-1, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15285i() {
        Bundle bundle;
        AssistStructure assistStructure = (AssistStructure) this.f26160b.getParcelable("android.view.autofill.extra.ASSIST_STRUCTURE");
        if (assistStructure == null) {
            ((bnsl) f26446h.mo68388c()).mo68405a("Missing structure");
            m19432a((Intent) null);
        } else if (assistStructure.getActivityComponent() == null) {
            ((bnsl) f26446h.mo68388c()).mo68405a("Missing activity component");
            m19432a((Intent) null);
        } else {
            Bundle bundle2 = this.f26160b.getBundle("android.view.autofill.extra.CLIENT_STATE");
            if (bundle2 == null) {
                bundle = Bundle.EMPTY;
            } else {
                bundle = bundle2;
            }
            bqgg a = liw.m19221a(this.f26159a).mo15186a(this.f26447i.mo15291a(this.f26159a, assistStructure, this.f26449k, bundle, this.f26160b.getInt("com.google.android.gms.autofill.extra.FILL_REQUEST_ID", -1)));
            this.f26448j = a;
            m19433a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo15286j() {
        return this.f26449k.mo66813a() ? ((MetricsContext) this.f26449k.mo66814b()).mo7953a() : this.f26432f;
    }

    /* renamed from: a */
    private final void m19433a(bqgg bqgg) {
        this.f26433g.setVisibility(0);
        bqga.m112781a(bqgg, this, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo15164a() {
        super.mo15164a();
        liu b = liw.m19221a(this.f26159a).mo15189b("future_key");
        this.f26448j = b;
        if (b != null) {
            m19433a((bqgg) b);
        }
    }

    /* renamed from: a */
    public final void mo15167a(int i, Intent intent) {
        int i2;
        bqgg bqgg = this.f26448j;
        if (bqgg == null || bqgg.isDone()) {
            if (this.f26449k.mo66813a()) {
                i2 = ((MetricsContext) this.f26449k.mo66814b()).mo7953a();
            } else {
                i2 = 0;
            }
            super.mo15168a(i, intent, i2);
        }
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        m19432a(this.f26447i.mo15290a(obj));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f26446h.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        m19432a((Intent) null);
    }
}
