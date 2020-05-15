package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.concurrent.Executor;

/* renamed from: lju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lju extends lim {

    /* renamed from: d */
    public static final srn f26221d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    private final Executor f26222e = new lqw(new adzt());

    /* renamed from: f */
    private final Intent f26223f;

    /* renamed from: g */
    private final DataIntent$ResultTransformer f26224g;

    /* renamed from: h */
    private final kre f26225h;

    /* renamed from: i */
    private final kck f26226i;

    /* renamed from: j */
    private final FillForm f26227j;

    /* renamed from: k */
    private final bmxv f26228k;

    /* renamed from: l */
    private boolean f26229l = false;

    public lju(lir lir, Bundle bundle, bngx bngx, bmxv bmxv) {
        super(lir, bundle, bngx);
        Intent intent = (Intent) bundle.getParcelable("com.google.android.gms.autofill.extra.INTENT");
        DataIntent$ResultTransformer dataIntent$ResultTransformer = (DataIntent$ResultTransformer) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.INTENT_RESULT_TRANSFORMER"));
        if (intent == null || dataIntent$ResultTransformer == null) {
            throw new lik();
        }
        FillForm fillForm = (FillForm) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL"));
        if (fillForm != null) {
            kck kck = (kck) fillForm.f11644d.mo66815c();
            if (kck != null) {
                this.f26223f = intent;
                this.f26224g = dataIntent$ResultTransformer;
                this.f26225h = krc.m18382a(lir);
                this.f26227j = fillForm;
                this.f26226i = kck;
                this.f26228k = bmxv;
                return;
            }
            throw new lik("Fill form missing application domain.");
        }
        throw new lik("Fill form not provided.");
    }

    /* renamed from: h */
    private final void m19247h() {
        Intent intent;
        if (!this.f26229l && (intent = (Intent) this.f26160b.getParcelable("result_data")) != null) {
            bqga.m112781a(liw.m19221a(this.f26159a).mo15186a((lis) new ljt(this.f26224g, this.f26160b.getInt("result_code", 0), intent, this.f26225h.mo14838m(), this.f26228k, this.f26227j, this.f26226i)), new ljr(this), this.f26222e);
            this.f26229l = true;
        }
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        if (!this.f26160b.getBoolean("started", false)) {
            this.f26160b.putBoolean("started", true);
            this.f26159a.startActivityForResult(this.f26223f, 1);
        }
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
    }

    /* renamed from: b */
    public final void mo15171b() {
        m19247h();
    }

    /* renamed from: c */
    public final void mo15172c() {
        m19247h();
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (intent != null) {
            this.f26160b.putInt("result_code", i2);
            this.f26160b.putParcelable("result_data", intent);
            m19247h();
            return;
        }
        mo15165a(0);
    }
}
