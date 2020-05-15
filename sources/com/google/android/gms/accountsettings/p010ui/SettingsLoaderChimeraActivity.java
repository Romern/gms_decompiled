package com.google.android.gms.accountsettings.p010ui;

import android.content.Intent;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.accountsettings.ui.SettingsLoaderChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsLoaderChimeraActivity extends ffm {

    /* renamed from: i */
    private static final bnic f7807i = bnic.m109490a("org.mozilla.firefox", "com.android.chrome");

    /* renamed from: h */
    boolean f7808h;

    /* renamed from: v */
    private final int m5009v() {
        Uri uri;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("extra.fallbackUrl") : null;
        if (stringExtra == null) {
            return 1;
        }
        Intent intent = getIntent();
        if (Pattern.matches(cbri.f178135a.mo6606a().mo75258h(), stringExtra) && intent != null) {
            if (intent.getBooleanExtra("extra.fallbackAuth", false)) {
                String stringExtra2 = intent.getStringExtra("extra.accountName");
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("hl");
                Uri.Builder appendQueryParameter = Uri.parse(cbri.m128132b()).buildUpon().appendQueryParameter("continue", stringExtra);
                if (!stm.m36302d(stringExtra2)) {
                    appendQueryParameter.appendQueryParameter("Email", stringExtra2);
                }
                if (queryParameter != null) {
                    appendQueryParameter.appendQueryParameter("hl", queryParameter);
                }
                uri = appendQueryParameter.build();
            } else {
                uri = Uri.parse(stringExtra);
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.addCategory("android.intent.category.BROWSABLE");
            String stringExtra3 = intent.getStringExtra("com.android.browser.application_id");
            if (f7807i.contains(stringExtra3)) {
                intent2.setPackage(stringExtra3);
            }
            ffv.m11623a(this, this.f16466c).mo10787a(intent.getIntExtra("extra.screenId", 1), 2021, mo6350q());
            startActivity(intent2);
            mo10780p();
            return 2;
        }
        mo10775a(getString(C0126R.string.accountsettings_error_retry_notice), getString(C0126R.string.common_something_went_wrong), ffz.m11634a(8, "COMMON"));
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo6345e() {
        ffv ffv = this.f16465b;
        if (ffv == null) {
            return;
        }
        if (this.f7808h) {
            ffv.mo10787a(this.f16468e, 2020, mo6350q());
        } else {
            ffv.mo10787a(this.f16468e, 2005, mo6350q());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo6346g() {
        Intent intent = getIntent();
        return (intent == null || intent.getAction() == null || intent.getAction().equals("com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo6347h() {
        Intent intent = getIntent();
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) {
            try {
                spn.m35870c((Activity) this);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        } else {
            this.f7808h = true;
            return Pattern.matches(stm.m36299a(cbri.f178135a.mo6606a().mo75253c()), String.valueOf(intent.getIntExtra("extra.screenId", -1)));
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: k */
    public final Intent mo6352k() {
        Intent k = super.mo6352k();
        if (!cbro.m128206j() && getIntent().hasExtra("com.android.browser.application_id")) {
            k.putExtra("com.android.browser.application_id", getIntent().getStringExtra("com.android.browser.application_id"));
        }
        return k;
    }

    /* renamed from: q */
    public final String mo6350q() {
        Intent intent = getIntent();
        if (cbro.m128206j()) {
            return spn.m35852a((Activity) this);
        }
        if (intent.hasExtra("extra.callingPackageName")) {
            return intent.getStringExtra("extra.callingPackageName");
        }
        String a = spn.m35852a((Activity) this);
        if (!stm.m36302d(a)) {
            return a;
        }
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("com.android.browser.application_id");
            if (f7807i.contains(stringExtra)) {
                return stringExtra;
            }
        }
        return null;
    }

    /* renamed from: r */
    public final int mo6353r() {
        return m5009v();
    }

    /* renamed from: s */
    public final int mo6354s() {
        return m5009v();
    }

    /* renamed from: t */
    public final int mo6355t() {
        if (this.f7808h) {
            return m5009v();
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo6351u() {
        return this.f7808h ? 2 : 4;
    }
}
