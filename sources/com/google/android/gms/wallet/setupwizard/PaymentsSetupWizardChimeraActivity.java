package com.google.android.gms.wallet.setupwizard;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentsSetupWizardChimeraActivity extends awce {

    /* renamed from: i */
    protected Account f110400i;

    /* renamed from: j */
    protected bwgn f110401j;

    /* renamed from: k */
    protected String f110402k;

    /* renamed from: l */
    protected WalletGlifLayout f110403l;

    /* renamed from: m */
    protected boolean f110404m = true;

    /* renamed from: b */
    private final void m94155b(Account account) {
        int i;
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110169b.putInt("windowTransitionsStyle", 4);
        awyb a = BuyFlowConfig.m94175a();
        a.mo52752c("flow_setupwizard");
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52738a(0);
        a2.mo52739a(account);
        a2.mo52744b(((Integer) awjd.f94525a.mo58455c()).intValue());
        if (!bjba.m103134a(this.f110402k)) {
            i = 2;
        } else {
            i = 1;
        }
        a2.mo52745c(i);
        a2.mo52741a(walletCustomTheme);
        a.mo52749a(a2.f95270a);
        a.mo52751b(getPackageName());
        BuyFlowConfig a3 = a.mo52748a();
        Intent intent = getIntent();
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", a3);
        setIntent(intent);
    }

    /* renamed from: v */
    private final void m94156v() {
        int[] a = awxx.m81467a(this.f110402k);
        setTheme(a[0]);
        int length = a.length;
        for (int i = 1; i < length; i++) {
            getTheme().applyStyle(a[i], true);
        }
    }

    /* renamed from: a */
    public final void mo60039a(Drawable drawable) {
        this.f110403l.mo71362a(drawable);
    }

    /* renamed from: a */
    public final void mo51867a(bmoc bmoc, boolean z) {
    }

    /* renamed from: a */
    public final void mo51868a(String str) {
    }

    /* renamed from: g */
    public final boolean mo51880g() {
        WalletGlifLayout walletGlifLayout = this.f110403l;
        return walletGlifLayout != null && walletGlifLayout.mo71369h();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        bwgn bwgn;
        Bundle bundle2 = bundle;
        if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_REQUIRE_CACHED_RESPONSE") && ((Boolean) awjd.f94528d.mo58455c()).booleanValue()) {
            this.f110404m = getIntent().getBooleanExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_REQUIRE_CACHED_RESPONSE", true);
        }
        this.f110402k = mo52134t();
        C1240of ofVar = null;
        if (this.f110404m) {
            Account[] a = adyd.m51363a(this).mo33916a("com.google");
            int length = a.length;
            if (length == 0) {
                super.onCreate(bundle);
                Log.e("PaymentsSwAct", "Cannot find any account.");
                setResult(1);
                finish();
            }
            if (bundle2 == null) {
                awxw awxw = new awxw(this);
                int i = 0;
                while (true) {
                    if (i >= length) {
                        Log.e("PaymentsSwAct", "No responses found for usable accounts.");
                        break;
                    }
                    Account account = a[i];
                    String string = awxw.f95266a.getString(awxw.m81465b(account), null);
                    if (!TextUtils.isEmpty(string)) {
                        bjvz a2 = bjwb.m104763a(string);
                        bwgn = (bwgn) a2.mo65576a((bxxk) bwgn.f159218h.mo74142c(7), (bxxc) null);
                        if (System.currentTimeMillis() - a2.mo65575a(0) > chjb.f188672a.mo6606a().mo85273a()) {
                            bwgn = null;
                        }
                    } else {
                        bwgn = null;
                    }
                    if (bwgn != null) {
                        String valueOf = String.valueOf(account);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Using response for account=");
                        sb.append(valueOf);
                        Log.i("PaymentsSwAct", sb.toString());
                        ofVar = C1240of.m19758a(account, bwgn);
                        break;
                    }
                    i++;
                }
            } else {
                ofVar = C1240of.m19758a((Account) bundle2.getParcelable("account"), (bwgn) bjvp.m104730a(bundle2, "initializeResponse", (bxxk) bwgn.f159218h.mo74142c(7)));
            }
            if (ofVar != null) {
                this.f110400i = (Account) ofVar.f26798a;
                this.f110401j = (bwgn) ofVar.f26799b;
                m94155b(this.f110400i);
                m94156v();
            } else {
                m94155b(a[0]);
            }
        } else {
            m94156v();
        }
        overridePendingTransition(C0126R.anim.sud_slide_next_in, C0126R.anim.sud_slide_next_out);
        mo51862a(bundle2, awij.f94465m, 11, bpis.FLOW_TYPE_SETUPWIZARD);
        super.onCreate(bundle);
        if (this.f110404m && ofVar == null) {
            mo51858a(1);
            return;
        }
        setContentView((int) C0126R.C0128layout.wallet_activity_setupwizard);
        this.f110403l = (WalletGlifLayout) findViewById(C0126R.C0129id.setup_wizard_layout);
        BitmapDrawable l = bkfr.m105626l(this);
        C1173lt.m19601a(l, this.f110403l.f151481g);
        mo60039a(l);
        mo60040b(getResources().getString(C0126R.string.wallet_activity_default_title));
        View findViewById = findViewById(C0126R.C0129id.sticky_button_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (((awxv) mo51879e()) == null) {
            mo51866a(mo60041u(), (int) C0126R.C0129id.fragment_holder);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.f110400i);
        bjvp.m104736a(bundle, "initializeResponse", this.f110401j);
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.f110403l;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo71363a(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo52134t() {
        return getIntent().hasExtra("theme") ? getIntent().getStringExtra("theme") : "glif_light";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awxv.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, bwgn, java.lang.String, boolean, boolean, com.google.android.wallet.clientlog.LogContext):awxv
     arg types: [com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, bwgn, java.lang.String, int, boolean, com.google.android.wallet.clientlog.LogContext]
     candidates:
      awxv.a(bmaq, bwgz, bmar, bwgo, bmav, boolean, java.lang.String):void
      awxv.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, bwgn, java.lang.String, boolean, boolean, com.google.android.wallet.clientlog.LogContext):awxv */
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public awxv mo60041u() {
        return awxv.m81433a(mo51881h(), this.f94163b, this.f110401j, this.f110402k, false, this.f110404m, this.f94164c);
    }

    /* renamed from: a */
    public final void mo51861a(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", mo51880g());
    }

    /* renamed from: b */
    public final void mo51871b(Bundle bundle) {
        mo51872b(bundle.getBoolean("savedSpinnerState"));
    }

    /* renamed from: b */
    public final void mo60040b(String str) {
        ((bjae) this.f110403l.mo71342a(bjae.class)).mo64939a(str);
    }

    /* renamed from: b */
    public final void mo51872b(boolean z) {
        WalletGlifLayout walletGlifLayout = this.f110403l;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo71364b(z);
        }
    }
}
