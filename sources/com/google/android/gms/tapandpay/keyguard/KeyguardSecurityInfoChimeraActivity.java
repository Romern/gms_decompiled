package com.google.android.gms.tapandpay.keyguard;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyguardSecurityInfoChimeraActivity extends atex {

    /* renamed from: b */
    public atam f108609b;

    /* renamed from: c */
    ayxa f108610c;

    /* renamed from: d */
    boolean f108611d;

    /* renamed from: a */
    private final void m93063a(AccountInfo accountInfo) {
        if (cgwn.m147275y() && accountInfo != null) {
            aywx a = this.f108610c.f98673b.mo54504a(92634);
            a.mo54481a(ayxb.m85017a(accountInfo.f108326b));
            a.mo54503a(getContainerActivity());
        }
    }

    /* renamed from: e */
    private final View.OnClickListener m93064e() {
        return new atad(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (getIntent().getBooleanExtra("intent_to_settings", false)) {
            Intent className = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
            className.setFlags(268435456);
            startActivity(className);
        }
        atam atam = this.f108609b;
        if (!asjk.m74228b(this)) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        atam.mo49760c(i3);
        setResult(i2);
        finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void
     arg types: [android.widget.TextView, java.lang.String, int, android.view.View$OnClickListener[]]
     candidates:
      atyg.a(android.content.Context, android.widget.TextView, java.lang.String, android.content.Intent[]):void
      atyg.a(java.lang.String, java.lang.String, android.widget.TextView, android.content.Intent):void
      atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        aszw aszw = new aszw();
        alir a = aliq.m60909a();
        cazf.m127594a(a);
        aszw.f89933a = a;
        cazf.m127595a(aszw.f89933a, alir.class);
        ayxa a2 = new aszx(aszw.f89933a).f89934a.mo40366a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f108610c = a2;
        setTheme(2132018962);
        this.f108611d = getIntent().getBooleanExtra("EXTRA_MONET_ONBOARDING", false);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        boolean booleanExtra = getIntent().getBooleanExtra("extra_us_mode", false);
        this.f108609b = new atam(this, accountInfo);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/androidpay/?p=lock_required"));
        boolean booleanExtra2 = getIntent().getBooleanExtra("extra.KEYGUARD_VALID", false);
        sre.m36089i(this);
        if (cgwn.m147257g() && this.f108611d) {
            setContentView((int) C0126R.C0128layout.tp_monet_onboarding_layout);
            m93063a(accountInfo);
            TextView textView = (TextView) findViewById(C0126R.C0129id.TitleText);
            TextView textView2 = (TextView) findViewById(C0126R.C0129id.SubtitleText);
            Button button = (Button) findViewById(C0126R.C0129id.SetUpButton);
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.IconImage);
            imageView.setVisibility(0);
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_lock_outline_white_48);
            C1329rn.m20096a(imageView, ColorStateList.valueOf(getResources().getColor(C0126R.color.google_grey700)));
            if (!booleanExtra2) {
                if (!booleanExtra) {
                    i3 = C0126R.string.tp_screen_lock_prompt_title_monet_nonus;
                } else {
                    i3 = C0126R.string.tp_screen_lock_prompt_title_monet;
                }
                textView.setText(i3);
                button.setText((int) C0126R.string.tp_secure_keyguard_prompt_button);
                button.setOnClickListener(m93064e());
            } else {
                textView.setText(!booleanExtra ? C0126R.string.tp_screen_lock_notification_title_monet_nonus : C0126R.string.tp_screen_lock_notification_title_monet);
                button.setText((int) C0126R.string.common_continue);
                button.setOnClickListener(new aszz(this));
            }
            if (!booleanExtra) {
                i2 = C0126R.string.tp_screen_lock_body_text_nonus_monet;
            } else {
                i2 = C0126R.string.tp_screen_lock_body_text_us_monet;
            }
            atyg.m76551a(textView2, getString(i2), false, new atxj(this, intent), new ataa(this));
            ((NetworkImageView) findViewById(C0126R.C0129id.ScreenLockImage)).setImageUrl(cgwt.m147406b(), atyg.m76548a());
            return;
        }
        String string = getString(C0126R.string.tp_google_pay);
        if (getIntent().getStringExtra("extra_alt_brand_name") != null) {
            string = getIntent().getStringExtra("extra_alt_brand_name");
        }
        setContentView((int) C0126R.C0128layout.tp_device_admin_prompt_activity);
        m93063a(accountInfo);
        TextView textView3 = (TextView) findViewById(C0126R.C0129id.Body);
        if (!booleanExtra) {
            i = C0126R.string.tp_screen_lock_body_text_nonus;
        } else {
            i = C0126R.string.tp_screen_lock_body_text_us;
        }
        atyg.m76551a(textView3, getString(i), false, new atxj(this, intent), new atab(this));
        Button button2 = (Button) findViewById(C0126R.C0129id.Button);
        TextView textView4 = (TextView) findViewById(C0126R.C0129id.Title);
        if (booleanExtra2) {
            textView4.setText(getString(C0126R.string.tp_screen_lock_notification_title, new Object[]{string}));
            button2.setText((int) C0126R.string.common_got_it);
            button2.setOnClickListener(new atac(this));
            return;
        }
        textView4.setText(getString(C0126R.string.tp_screen_lock_prompt_title, new Object[]{string}));
        button2.setText((int) C0126R.string.tp_button_setup);
        button2.setOnClickListener(m93064e());
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Setup Keyguard on 23+");
        atam atam = this.f108609b;
        atam.mo49741a(atam.mo49734a(42));
    }
}
