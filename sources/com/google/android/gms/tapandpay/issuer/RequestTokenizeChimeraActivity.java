package com.google.android.gms.tapandpay.issuer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestTokenizeChimeraActivity extends atex implements auat {

    /* renamed from: b */
    public static final srn f108577b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    asjn f108578c;

    /* renamed from: d */
    public AccountInfo f108579d;

    /* renamed from: e */
    public CheckBox f108580e;

    /* renamed from: f */
    private askf f108581f;

    /* renamed from: g */
    private String f108582g;

    /* renamed from: h */
    private TextView f108583h;

    /* renamed from: i */
    private AccountParticleDisc f108584i;

    /* renamed from: j */
    private boolean f108585j;

    /* renamed from: k */
    private boolean f108586k;

    /* renamed from: l */
    private rjx f108587l;

    /* renamed from: a */
    public static Intent m93051a(Context context, Intent intent, CardInfo cardInfo, AccountInfo accountInfo, String str, String str2, PushTokenizeRequest pushTokenizeRequest, boolean z) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.tapandpay.issuer.RequestTokenizeActivity").putExtra("extra_account_info", accountInfo).putExtra("extra_card_info", cardInfo).putExtra("extra_next_intent", intent).putExtra("extra_display_name", str).putExtra("extra_calling_package", str2).putExtra("extra_include_issuer_token", z);
        if (pushTokenizeRequest != null) {
            putExtra.putExtra("extra_push_tokenize_request", sef.m35074a(pushTokenizeRequest));
        }
        return putExtra;
    }

    public final void finish() {
        if (this.f108585j) {
            finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asjn.a(boolean, java.lang.String, java.lang.String, bssm):byte[]
     arg types: [int, java.lang.String, java.lang.String, bssm]
     candidates:
      asjn.a(java.lang.String, java.lang.String, bsrf, bssm):byte[]
      asjn.a(boolean, java.lang.String, java.lang.String, bssm):byte[] */
    /* renamed from: g */
    public final void mo59371g() {
        asjl.m74237b(this, "Issuer Tokenize OK");
        if (this.f108580e.isChecked()) {
            bxvd da = bssm.f146877d.mo74144da();
            bsmx bsmx = bsmx.GOOGLE_PAY_GMSCORE_TAPANDPAY_SECOND_PARTY_TOKENIZATION_CONFIRMATION;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssm bssm = (bssm) da.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bxvd da2 = bssi.f146862i.mo74144da();
            bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
            bsqp.mo70703a((int) C0126R.string.tp_request_tokenize_email_opt_in);
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
            asjn asjn = this.f108578c;
            askf askf = this.f108581f;
            byte[] a = asjn.mo49199a(true, askf.f89123a, askf.f89124b, (bssm) da.mo74062i());
            bxvd da3 = btpz.f149912c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((btpz) da3.f164949b).f149914a = true;
            if (a != null) {
                bxtx a2 = bxtx.m123261a(a);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                a2.getClass();
                ((btpz) da3.f164949b).f149915b = a2;
            }
            atff.m75765a(this.f108581f, "t/settings/update", da3.mo74062i(), btqa.f149916a, new atfe(), "RequestTokenizeAct");
        }
        startActivityForResult((Intent) getIntent().getParcelableExtra("extra_next_intent"), 1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        if (i != 1) {
            setResult(0);
            finish();
        } else if (i2 == -1) {
            if (getIntent().getBooleanExtra("extra_include_issuer_token", false)) {
                intent2 = new Intent();
                intent2.putExtra("extra_issuer_token_id", ((CardInfo) intent.getParcelableExtra("new_card_info")).f108353n);
            } else if (intent.hasExtra("extra_tokenization_session_id")) {
                Intent intent3 = new Intent();
                intent3.putExtra("extra_tokenization_session_id", intent.getStringExtra("extra_tokenization_session_id"));
                intent2 = intent3;
            } else {
                intent2 = null;
            }
            setResult(-1, intent2);
            finish();
        } else if (i2 != 15005) {
            setResult(0);
            finish();
        } else {
            setResult(15005);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        bddo bddo;
        int i;
        super.onCreate(bundle);
        setTheme(2132018962);
        setContentView((int) C0126R.C0128layout.tp_request_tokenize_activity);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        sdo.m34959a(accountInfo);
        this.f108579d = accountInfo;
        String stringExtra = getIntent().getStringExtra("extra_calling_package");
        sdo.m34959a((Object) stringExtra);
        this.f108582g = stringExtra;
        this.f108581f = new askf(this.f108579d, askc.m74272b(), this);
        this.f108585j = getIntent().hasExtra("extra_server_provisioning_session_id");
        this.f108586k = getIntent().getBooleanExtra("completing_push_tokenize_session", false);
        this.f108583h = (TextView) findViewById(C0126R.C0129id.tp_owner_address);
        this.f108580e = (CheckBox) findViewById(C0126R.C0129id.request_tokenize_email_optin);
        if (this.f108578c == null) {
            this.f108578c = new asjn(this);
        }
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(C0126R.C0129id.account_particle_disc);
        this.f108584i = accountParticleDisc;
        if (!accountParticleDisc.mo60579b()) {
            bqgj a = snp.m35702a(9);
            bdej bdej = new bdej(a);
            this.f108584i.mo60576a(bdej, bddo.class);
            bddp bddp = new bddp();
            allp a2 = allq.m61232a();
            a2.f73626a = 80;
            AccountParticleDisc.m94876a(this, bdej, a, bddp, new bddr(this, a, a2.mo40491a()), bddo.class);
        }
        AccountParticleDisc accountParticleDisc2 = this.f108584i;
        if (this.f108579d != null) {
            bddn g = bddo.m90606g();
            g.mo57907a(this.f108579d.f108326b);
            g.mo57908b();
            bddo = g.mo57906a();
        } else {
            bddo = null;
        }
        accountParticleDisc2.mo60577a(bddo);
        this.f108583h.setText(this.f108579d.f108326b);
        this.f108587l = rjx.m33697b((Activity) this);
        ((TextView) findViewById(C0126R.C0129id.request_tokenize_display_name)).setText(getIntent().getStringExtra("extra_display_name"));
        PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) sef.m35067a(getIntent(), "extra_push_tokenize_request", PushTokenizeRequest.CREATOR);
        if (pushTokenizeRequest != null && pushTokenizeRequest.f108571b == 9) {
            ((TextView) findViewById(C0126R.C0129id.request_tokenize_title)).setText((int) C0126R.string.tp_request_tokenize_paypal_title);
            ((TextView) findViewById(C0126R.C0129id.request_tokenize_body)).setText((int) C0126R.string.tp_request_tokenize_paypal_body);
        } else if (pushTokenizeRequest != null && ((i = pushTokenizeRequest.f108570a) == 10 || i == 9)) {
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.tp_header_image);
            if (imageView != null) {
                imageView.setImageResource(C0126R.C0127drawable.tp_felica_terminal);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(2, C0126R.C0129id.tp_middle_divider);
                layoutParams.height = (int) getResources().getDimension(C0126R.dimen.tp_request_tokenization_header_image_height);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(layoutParams);
            }
            ((TextView) findViewById(C0126R.C0129id.request_tokenize_body)).setText((int) C0126R.string.tp_request_tokenize_stores_body);
        } else if (this.f108585j || this.f108586k) {
            ((TextView) findViewById(C0126R.C0129id.request_tokenize_title)).setText((int) C0126R.string.tp_request_tokenize_web_push_provisioning_title);
            findViewById(C0126R.C0129id.request_tokenize_body).setVisibility(8);
        }
        findViewById(C0126R.C0129id.continue_button).setOnClickListener(new aszi(this));
        findViewById(C0126R.C0129id.cancel_button).setOnClickListener(new aszj(this));
        if (this.f108586k) {
            mo59370e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Request Tokenize");
        atam atam = new atam(this, this.f108579d);
        String str = this.f108582g;
        bxvd g = atam.mo49765g(54);
        if (str != null) {
            bxvd da = boxo.f135271c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boxo boxo = (boxo) da.f164949b;
            str.getClass();
            boxo.f135273a |= 1;
            boxo.f135274b = str;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            boxo boxo2 = (boxo) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            boxo2.getClass();
            bpbx.f135676v = boxo2;
            bpbx.f135655a |= 4194304;
        }
        atam.mo49741a((bpbx) g.mo74062i());
        if (!this.f108586k) {
            atff.m75765a(this.f108581f, "t/settings/get", btnq.f149676a, btnr.f149678b, new aszn(this), "RequestTokenizeAct");
        }
    }

    public final void onStop() {
        super.onStop();
        atff.m75768a("RequestTokenizeAct");
    }

    /* renamed from: e */
    public final void mo59370e() {
        findViewById(C0126R.C0129id.shade).setVisibility(0);
        findViewById(C0126R.C0129id.tp_request_tokenize_content).setVisibility(8);
        aucb x = this.f108587l.mo24770x();
        x.mo50373a(new aszl(this));
        x.mo50372a(new aszm(this));
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
    /* renamed from: a */
    public static Intent m93052a(Context context, String str, AccountInfo accountInfo, Intent intent) {
        return new Intent().setClassName(context, "com.google.android.gms.tapandpay.issuer.RequestTokenizeActivity").putExtra("extra_account_info", accountInfo).putExtra("extra_next_intent", intent).putExtra("extra_calling_package", str).putExtra("extra_include_issuer_token", true).putExtra("completing_push_tokenize_session", true);
    }

    /* renamed from: a */
    public static Intent m93053a(askf askf, Intent intent, bmuw bmuw) {
        return new Intent().setClassName(askf.f89126d, "com.google.android.gms.tapandpay.issuer.RequestTokenizeActivity").putExtra("extra_account_info", askf.mo49209a()).putExtra("extra_next_intent", intent).putExtra("extra_calling_package", askf.f89126d.getPackageName()).putExtra("extra_display_name", bmuw.f130981e).putExtra("extra_server_provisioning_session_id", bmuw.f130977a).putExtra("extra_client_provisioning_session_id", bmuw.f130978b);
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i2 == 1001 && i == -1) {
            this.f108587l.mo24751i(this.f108579d.f108326b).mo9458a(new aszk(this));
        }
    }
}
