package com.google.android.gms.tapandpay.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationSettingsChimeraActivity extends atex implements auat {

    /* renamed from: b */
    public static final srn f108662b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public asjn f108663c;

    /* renamed from: d */
    public asjs f108664d;

    /* renamed from: e */
    public AccountInfo f108665e;

    /* renamed from: f */
    public boolean f108666f;

    /* renamed from: g */
    public SwitchCompat f108667g;

    /* renamed from: h */
    public SwitchCompat f108668h;

    /* renamed from: i */
    public SwitchCompat f108669i;

    /* renamed from: j */
    public int f108670j;

    /* renamed from: k */
    public boolean f108671k;

    /* renamed from: l */
    public boolean f108672l;

    /* renamed from: m */
    rjx f108673m;

    /* renamed from: n */
    private SharedPreferences f108674n;

    /* renamed from: a */
    public static Intent m93113a(Context context, String str, String str2) {
        return new Intent().setClassName(context, "com.google.android.gms.tapandpay.settings.NotificationSettingsActivity").putExtra("extra_account_info", new AccountInfo(str2, str));
    }

    /* renamed from: b */
    public static bssm m93117b(int i, int i2) {
        bxvd da = bssm.f146877d.mo74144da();
        bsmx bsmx = bsmx.GOOGLE_PAY_GMSCORE_TAPANDPAY_SETTINGS;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssm bssm = (bssm) da.f164949b;
        bssm.f146880b = bsmx.f145962iC;
        bssm.f146879a |= 1;
        bxvd da2 = bssi.f146862i.mo74144da();
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        bsqp.mo70703a(i);
        bsqp.mo70703a(i2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssi bssi = (bssi) da2.f164949b;
        bsqq bsqq = (bsqq) bsqp.mo74062i();
        bsqq.getClass();
        bssi.f146868e = bsqq;
        bssi.f146864a |= 128;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssm bssm2 = (bssm) da.f164949b;
        bssi bssi2 = (bssi) da2.mo74062i();
        bssi2.getClass();
        bssm2.f146881c = bssi2;
        bssm2.f146879a |= 8;
        return (bssm) da.mo74062i();
    }

    /* renamed from: c */
    private final void m93118c(int i, int i2) {
        auar auar = new auar();
        auar.f91333a = i2;
        auar.f91334b = getString(i);
        auar.f91335c = getString(C0126R.string.tp_notification_channel_enable_message);
        auar.f91337e = getString(C0126R.string.common_cancel);
        auar.f91336d = getString(C0126R.string.common_continue);
        auar.mo50344a().show(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: e */
    public final void mo59405e() {
        int i;
        if (this.f108666f && atbf.TRANSACTION_RECEIPTS.mo49776a(this)) {
            m93118c(atbf.TRANSACTION_RECEIPTS.f89995f, 1002);
            return;
        }
        this.f108667g.toggle();
        boolean isChecked = this.f108667g.isChecked();
        bssm bssm = (bssm) this.f108667g.getTag();
        asjn asjn = this.f108663c;
        AccountInfo accountInfo = this.f108665e;
        String str = accountInfo.f108325a;
        String str2 = accountInfo.f108326b;
        bxvd da = bsrr.f146791c.mo74144da();
        bxvd da2 = bssl.f146873c.mo74144da();
        if (!isChecked) {
            i = 3;
        } else {
            i = 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssl bssl = (bssl) da2.f164949b;
        bssl.f146876b = i - 1;
        bssl.f146875a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrr bsrr = (bsrr) da.f164949b;
        bssl bssl2 = (bssl) da2.mo74062i();
        bssl2.getClass();
        bsrr.f146794b = bssl2;
        bsrr.f146793a |= 1;
        bsrr bsrr2 = (bsrr) da.mo74062i();
        bxvd da3 = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.GOOGLE_PAY_SETTING_CHANGE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf = (bsrf) da3.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da4 = bsrg.f146749m.mo74144da();
        bxvd da5 = bsru.f146799c.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsru bsru = (bsru) da5.f164949b;
        bsrr2.getClass();
        bsru.f146802b = bsrr2;
        bsru.f146801a = 5;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrg bsrg = (bsrg) da4.f164949b;
        bsru bsru2 = (bsru) da5.mo74062i();
        bsru2.getClass();
        bsrg.f146759i = bsru2;
        bsrg.f146751a |= 134217728;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da3.f164949b;
        bsrg bsrg2 = (bsrg) da4.mo74062i();
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a = 2 | bsrf2.f146746a;
        asjn.mo49198a(str, str2, (bsrf) da3.mo74062i(), bssm);
        this.f108673m.mo24711a(new NotificationSettings(isChecked, false, this.f108668h.isChecked())).mo9458a(new atkw(this));
    }

    /* renamed from: g */
    public final void mo59406g() {
        if (this.f108666f && atbf.PROMOTIONS.mo49776a(this)) {
            m93118c(atbf.PROMOTIONS.f89995f, 1003);
            return;
        }
        this.f108668h.toggle();
        boolean isChecked = this.f108668h.isChecked();
        asjn asjn = this.f108663c;
        AccountInfo accountInfo = this.f108665e;
        asjn.mo49200b(isChecked, accountInfo.f108325a, accountInfo.f108326b, (bssm) this.f108668h.getTag());
        this.f108673m.mo24711a(new NotificationSettings(this.f108667g.isChecked(), false, isChecked)).mo9458a(new atkx(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C0126R.style.TpActivityTheme);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108665e = accountInfo;
        if (accountInfo == null) {
            bnsl bnsl = (bnsl) f108662b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity", "onCreate", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NotificationSettingsActivity started without account info, finishing");
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.tp_activity_notification_settings);
        setTitle((int) C0126R.string.common_settings);
        mo8628aW().mo15855c((int) C0126R.string.common_settings);
        mo8628aW().mo15853b(true);
        mo8628aW().mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
        mo8628aW().mo15865f((int) C0126R.string.close_button_label);
        this.f108674n = getSharedPreferences("com.google.android.gms.tapandpay.settings.NotificationSettingsActivity", 0);
        int i = Build.VERSION.SDK_INT;
        boolean x = cgwn.m147274x();
        this.f108666f = x;
        if (x) {
            atbg.m75369a(this);
        }
        View findViewById = findViewById(C0126R.C0129id.TransactionNotifications);
        m93114a(findViewById, atbf.TRANSACTION_RECEIPTS.f89995f, atbf.TRANSACTION_RECEIPTS.f89996g);
        findViewById.setOnClickListener(new atkn(this));
        this.f108667g = (SwitchCompat) findViewById.findViewById(C0126R.C0129id.Switch);
        View findViewById2 = findViewById(C0126R.C0129id.PromoNotifications);
        m93114a(findViewById2, atbf.PROMOTIONS.f89995f, atbf.PROMOTIONS.f89996g);
        findViewById2.setOnClickListener(new atks(this));
        this.f108668h = (SwitchCompat) findViewById2.findViewById(C0126R.C0129id.Switch);
        View findViewById3 = findViewById(C0126R.C0129id.EmailSettings);
        m93114a(findViewById3, (int) C0126R.string.tp_emails_notification_setting_label, (int) C0126R.string.tp_emails_notification_setting_description);
        findViewById3.setOnClickListener(new atkt(this));
        this.f108669i = (SwitchCompat) findViewById3.findViewById(C0126R.C0129id.Switch);
        this.f108663c = new asjn(this);
        this.f108673m = rjx.m33697b((Activity) this);
        this.f108664d = new asjs(this, this.f108665e.f108326b);
        if (bundle != null) {
            this.f108671k = bundle.getBoolean("promoChannelPending");
            this.f108672l = bundle.getBoolean("transactionChannelPending");
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("promoChannelPending", this.f108671k);
        bundle.putBoolean("transactionChannelPending", this.f108672l);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Notification Settings");
        rkb rkb = this.f108673m.f43165D;
        asxh asxh = new asxh(rkb);
        rkb.mo24787a((rle) asxh);
        asxh.mo9458a((rkl) new atku(this));
        if (this.f108674n.contains("g/settings/getmarketingsettings")) {
            this.f108669i.setChecked(this.f108674n.getBoolean("g/settings/getmarketingsettings", false));
        }
        atff.m75770b(new askf(this.f108665e, askc.m74272b(), this), "g/settings/getmarketingsettings", bzui.f171425a, bzuj.f171427b, new atky(this), atkz.f90433a, "NotificationSettingsAct");
        this.f108673m.mo24769w().mo9458a(new atkv(this));
    }

    public final void onStop() {
        super.onStop();
        atff.m75768a("NotificationSettingsAct");
        this.f108670j = 0;
    }

    /* renamed from: a */
    private static void m93114a(View view, int i, int i2) {
        ((TextView) view.findViewById(C0126R.C0129id.Title)).setText(i);
        ((TextView) view.findViewById(C0126R.C0129id.Description)).setText(i2);
        view.findViewById(C0126R.C0129id.Switch).setTag(m93117b(i, i2));
    }

    /* renamed from: a */
    private final void m93115a(atbf atbf) {
        Intent intent = new Intent();
        sex a = sex.m35104a(this);
        if (a != null && a.mo25453e()) {
            int i = Build.VERSION.SDK_INT;
            if (!atbf.mo49775a(a.mo25449c("tapandpay"))) {
                intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", atbf.f89994e);
                intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
                startActivity(intent);
            }
        }
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        startActivity(intent);
    }

    /* renamed from: a */
    static final /* synthetic */ void m93116a(VolleyError volleyError) {
        bnsl bnsl = (bnsl) f108662b.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity", "a", 380, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Email setting request failed");
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        switch (i2) {
            case 1001:
                finish();
                return;
            case 1002:
                if (i == -1) {
                    this.f108672l = true;
                    m93115a(atbf.TRANSACTION_RECEIPTS);
                    return;
                }
                return;
            case 1003:
                if (i == -1) {
                    this.f108671k = true;
                    m93115a(atbf.PROMOTIONS);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo59403a(bzuk bzuk) {
        if (bzuk != null) {
            int i = bzuk.f171432a;
            boolean z = false;
            char c = 2;
            if (i != 0) {
                c = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
            }
            if (c == 0) {
                z = true;
            } else if (c != 3) {
                z = true;
            }
            this.f108674n.edit().putBoolean("g/settings/getmarketingsettings", z).apply();
            if (this.f108670j == 0) {
                this.f108669i.setChecked(z);
                return;
            }
            return;
        }
        mo59404a(new IllegalArgumentException("EmailSettings response invalid"));
    }

    /* renamed from: a */
    public final void mo59404a(Exception exc) {
        bnsl bnsl = (bnsl) f108662b.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68448m();
        auar auar = new auar();
        auar.f91333a = 1001;
        auar.f91334b = getString(C0126R.string.common_something_went_wrong);
        auar.f91335c = getString(C0126R.string.tp_generic_error_content);
        auar.f91336d = getString(17039370);
        auar.mo50344a().show(getSupportFragmentManager(), (String) null);
    }
}
