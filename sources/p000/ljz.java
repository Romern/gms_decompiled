package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: ljz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ljz extends lim {

    /* renamed from: d */
    public static final srn f26233d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    protected final Executor f26234e;

    /* renamed from: f */
    private final Account[] f26235f;

    /* renamed from: g */
    private final bmxv f26236g;

    /* renamed from: h */
    private Account f26237h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ljz(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmxv bmxv;
        if (ccjf.m130038h()) {
            bmxv = bmxv.m108566b(new ljj());
        } else {
            bmxv = bmvz.f131120a;
        }
        this.f26234e = new lqw(new adzt());
        kwv.m18696a();
        Account[] a = lqo.m19535a(adyd.m51362a((AccountManager) lir.getSystemService(AccountManager.class)));
        this.f26235f = a;
        if (a.length != 0) {
            this.f26236g = bmxv;
            return;
        }
        throw new lik();
    }

    /* renamed from: j */
    private final void m19259j() {
        bqgg a = liw.m19221a(this.f26159a).mo15186a((lis) new ljy(kdi.m17668a(this.f26237h)));
        if (!this.f26160b.getBoolean("api_resolution_started")) {
            bqga.m112781a(a, new ljw(this), this.f26234e);
        }
    }

    /* renamed from: a */
    public void mo15164a() {
        int i;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        Account[] accountArr = this.f26235f;
        if (accountArr.length > 1) {
            res res = new res();
            res.mo24564a(Arrays.asList("com.google"));
            res.mo24566c();
            res.f42828f = 1001;
            res.f42825c = this.f26159a.getString(C0126R.string.autofill_account_chooser_title_save_credential);
            this.f26159a.startActivityForResult(rew.m33488a(res.mo24563a()), 2);
            return;
        }
        this.f26237h = accountArr[0];
        m19259j();
    }

    /* renamed from: h */
    public final void mo15210h() {
        kre a = krc.m18382a(this.f26159a);
        lho e = a.mo14830e();
        e.mo15101a(kdi.m17668a(this.f26237h));
        if (this.f26236g.mo66813a()) {
            ((ljj) this.f26236g.mo66814b()).mo15203a(a.mo14825a(this.f26159a).mo14868f(), a.mo14833h(), e);
        }
        mo15211i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo15211i() {
        mo15167a(-1, null);
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (i2 != -1 || intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
                ((bnsl) f26233d.mo68388c()).mo68405a("Result of Account Picker Request unsuccessful.");
                mo15211i();
                return;
            }
            this.f26237h = new Account(stringExtra, "com.google");
            m19259j();
        } else if (i2 != -1) {
            liw.m19221a(this.f26159a).mo15188a("passphrase_resolution");
            this.f26160b.remove("api_resolution_started");
        } else {
            mo15210h();
        }
    }

    /* renamed from: a */
    public final void mo15168a(int i, Intent intent, int i2) {
        liu b = liw.m19221a(this.f26159a).mo15189b("passphrase_resolution");
        if (b == null || b.isDone()) {
            super.mo15168a(i, intent, i2);
        }
    }
}
