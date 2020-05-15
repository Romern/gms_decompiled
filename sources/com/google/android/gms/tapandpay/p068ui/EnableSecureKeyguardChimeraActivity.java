package com.google.android.gms.tapandpay.p068ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;

/* renamed from: com.google.android.gms.tapandpay.ui.EnableSecureKeyguardChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnableSecureKeyguardChimeraActivity extends atex implements ateu {

    /* renamed from: b */
    public AccountInfo f108948b;

    /* renamed from: c */
    public boolean f108949c = false;

    /* renamed from: d */
    public rjx f108950d;

    /* renamed from: e */
    private boolean f108951e = false;

    /* renamed from: g */
    private final boolean m93309g() {
        InStoreCvmConfig inStoreCvmConfig;
        CardInfo cardInfo = (CardInfo) getIntent().getParcelableExtra("extra_card_info");
        if (cardInfo == null || (inStoreCvmConfig = cardInfo.f108358s) == null) {
            return false;
        }
        return inStoreCvmConfig.f108384a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: e */
    public final void mo59495e() {
        if (!this.f108951e && this.f108949c) {
            atah.m75277b();
            boolean booleanExtra = getIntent().getBooleanExtra("data_keyguard_setup_required", false);
            if (!asjk.m74228b(this)) {
                asjj.m74220a(this, asjj.f89069a, "com.google.android.gms.tapandpay.SETUP_KEYGUARD_TIMEOUT");
                atah.m75277b();
                Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoActivity").putExtra("extra_account_info", this.f108948b).putExtra("extra_alt_brand_name", getIntent().getStringExtra("extra_alt_brand_name")).putExtra("extra_us_mode", m93309g());
                if (cgwn.m147257g()) {
                    putExtra.putExtra("EXTRA_MONET_ONBOARDING", getIntent().getBooleanExtra("EXTRA_MONET_ONBOARDING", false));
                }
                startActivityForResult(putExtra, 2);
            } else if (booleanExtra) {
                Intent putExtra2 = new Intent().setClassName(this, "com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoActivity").putExtra("extra_account_info", this.f108948b).putExtra("extra_alt_brand_name", getIntent().getStringExtra("extra_alt_brand_name")).putExtra("extra_us_mode", m93309g());
                putExtra2.putExtra("extra.KEYGUARD_VALID", true);
                if (cgwn.m147257g()) {
                    putExtra2.putExtra("EXTRA_MONET_ONBOARDING", getIntent().getBooleanExtra("EXTRA_MONET_ONBOARDING", false));
                }
                startActivityForResult(putExtra2, 2);
            } else {
                aszy.m75270b(this);
                aszy.m75267a();
                setResult(-1);
                finish();
            }
            this.f108951e = true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                if (i == 3) {
                    atam atam = new atam(this, this.f108948b);
                    if (asjk.m74232f(this)) {
                        i3 = 3;
                    }
                    atam.mo49755b(i3);
                    setResult(i2);
                    finish();
                    return;
                } else if (i == 4) {
                    atam atam2 = new atam(this, this.f108948b);
                    if (asjk.m74228b(this)) {
                        i3 = 3;
                    }
                    atam2.mo49760c(i3);
                } else {
                    return;
                }
            }
            if (!asjk.m74228b(this)) {
                asjj.m74222b(this);
                setResult(0);
            } else {
                aszy.m75270b(this);
                aszy.m75267a();
                asjj.m74225e(this);
                setResult(-1);
            }
            finish();
        } else if (!asjk.m74232f(this)) {
            asjj.m74219a(this);
            setResult(0);
            finish();
        } else {
            this.f108951e = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132018963);
        if (bundle != null) {
            this.f108951e = bundle.getBoolean("has_started_activity");
        }
        if (this.f108950d == null) {
            this.f108950d = rjx.m33697b((Activity) this);
        }
        this.f108950d.mo24770x().mo50369a(getContainerActivity(), new atwn(this));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        rjx.m33696b(getApplicationContext()).mo24772z();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo59495e();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_started_activity", this.f108951e);
    }
}
