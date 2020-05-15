package p000;

import android.accounts.Account;
import android.app.AlertDialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: lkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lkh extends ljv {

    /* renamed from: d */
    public final bmxv f26250d;

    /* renamed from: e */
    private final bmxv f26251e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lkh(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmxv bmxv;
        if (ccjf.m130038h()) {
            bmxv = bmxv.m108566b(new ljj());
        } else {
            bmxv = bmvz.f131120a;
        }
        Bundle bundle2 = bundle.getBundle("com.google.android.gms.autofill.extra.METRICS_CONTEXT");
        this.f26250d = bundle2 != null ? bmxv.m108567c((MetricsContext) lqx.m19548a(bundle2)) : bmvz.f131120a;
        this.f26251e = bmxv;
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        lir lir = this.f26159a;
        if (!cciw.f179109a.mo6606a().mo76079l()) {
            i = 2132019640;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        Account account = (Account) this.f26160b.getParcelable("com.google.android.gms.autofill.extra.OPT_IN_ACCOUNT");
        kre a = krc.m18382a(this.f26159a);
        lho e = a.mo14830e();
        if (account != null) {
            e.mo15101a(kdi.m17668a(account));
            if (this.f26251e.mo66813a()) {
                ((ljj) this.f26251e.mo66814b()).mo15203a(a.mo14825a(this.f26159a).mo14868f(), a.mo14833h(), e);
            }
        }
        e.mo15113g(false);
        new AlertDialog.Builder(this.f26159a).setTitle((int) C0126R.string.autofill_label).setMessage((int) C0126R.string.autofill_setup_summary_new).setNegativeButton((int) C0126R.string.common_settings, new lke(this)).setPositiveButton((int) C0126R.string.common_got_it, new lkf(this)).setOnDismissListener(new lkg(this)).show();
    }
}
