package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: lmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lmf extends lim {

    /* renamed from: d */
    public static final srn f26366d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    protected final Executor f26367e;

    /* renamed from: f */
    private final Account[] f26368f;

    /* renamed from: g */
    private Account f26369g;

    /* renamed from: h */
    private final bmxv f26370h;

    /* renamed from: i */
    private final bmxv f26371i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lmf(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmxv bmxv;
        if (ccjf.m130038h()) {
            bmxv = bmxv.m108566b(new ljj());
        } else {
            bmxv = bmvz.f131120a;
        }
        this.f26367e = new lqw(new adzt());
        Account[] a = lqo.m19535a(adyd.m51362a((AccountManager) lir.getSystemService(AccountManager.class)));
        this.f26368f = a;
        if (a.length != 0) {
            this.f26370h = bmxv.m108567c((MetricsContext) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.METRICS_CONTEXT")));
            this.f26371i = bmxv;
            return;
        }
        throw new lik();
    }

    /* renamed from: a */
    private final void m19365a(bqgg bqgg) {
        bqga.m112781a(bqgg, new lmb(this), bqfb.INSTANCE);
    }

    /* renamed from: i */
    private final void m19366i() {
        bqgg a = liw.m19221a(this.f26159a).mo15186a((lis) new lmd(kdi.m17668a(this.f26369g)));
        if (!this.f26160b.getBoolean("api_resolution_started")) {
            bqga.m112781a(a, new lma(this), this.f26367e);
        }
    }

    /* renamed from: h */
    public final void mo15267h() {
        kre a = krc.m18382a(this.f26159a);
        lho e = a.mo14830e();
        e.mo15101a(kdi.m17668a(this.f26369g));
        if (this.f26371i.mo66813a()) {
            ((ljj) this.f26371i.mo66814b()).mo15203a(a.mo14825a(this.f26159a).mo14868f(), a.mo14833h(), e);
        }
        AssistStructure assistStructure = (AssistStructure) this.f26160b.getParcelable("android.view.autofill.extra.ASSIST_STRUCTURE");
        if (assistStructure == null) {
            ((bnsl) f26366d.mo68388c()).mo68405a("Missing structure");
            mo15167a(-1, null);
        } else if (assistStructure.getActivityComponent() == null) {
            ((bnsl) f26366d.mo68388c()).mo68405a("Missing activity component");
            mo15167a(-1, null);
        } else {
            Bundle bundle = this.f26160b.getBundle("android.view.autofill.extra.CLIENT_STATE");
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            int i = this.f26160b.getInt("com.google.android.gms.autofill.extra.FILL_REQUEST_ID", -1);
            ClientState a2 = ClientState.m7166a(bundle);
            if (this.f26370h.mo66813a()) {
                a2.f11673e = (MetricsContext) this.f26370h.mo66814b();
            }
            m19365a(liw.m19221a(this.f26159a).mo15186a((lis) new lme(this.f26159a, assistStructure, a2, i)));
        }
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        Account[] accountArr = this.f26368f;
        if (accountArr.length > 1) {
            res res = new res();
            res.mo24564a(Arrays.asList("com.google"));
            this.f26159a.startActivityForResult(rew.m33488a(res.mo24563a()), 2);
        } else {
            this.f26369g = accountArr[0];
            m19366i();
        }
        liu b = liw.m19221a(this.f26159a).mo15189b("save_future_key");
        if (b != null) {
            m19365a(b);
        }
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (i2 != -1 || intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
                ((bnsl) f26366d.mo68388c()).mo68405a("Result of Account Picker Request unsuccessful.");
                mo15167a(-1, null);
                return;
            }
            this.f26369g = new Account(stringExtra, "com.google");
            m19366i();
        } else if (i2 != -1) {
            liw.m19221a(this.f26159a).mo15188a("passphrase_resolution");
            this.f26160b.remove("api_resolution_started");
        } else {
            mo15267h();
        }
    }

    /* renamed from: a */
    public final void mo15167a(int i, Intent intent) {
        int i2;
        liu b = liw.m19221a(this.f26159a).mo15189b("passphrase_resolution");
        liu b2 = liw.m19221a(this.f26159a).mo15189b("save_future_key");
        if (b2 != null && !b2.isDone()) {
            return;
        }
        if (b == null || b.isDone()) {
            if (this.f26370h.mo66813a()) {
                i2 = ((MetricsContext) this.f26370h.mo66814b()).mo7953a();
            } else {
                i2 = 0;
            }
            super.mo15168a(i, (Intent) null, i2);
        }
    }
}
