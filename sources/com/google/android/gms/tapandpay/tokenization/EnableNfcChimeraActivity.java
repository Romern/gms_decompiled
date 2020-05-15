package com.google.android.gms.tapandpay.tokenization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnableNfcChimeraActivity extends atex implements View.OnClickListener, auat, auas {

    /* renamed from: d */
    public static final /* synthetic */ int f108774d = 0;

    /* renamed from: e */
    private static final srn f108775e = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    ayxa f108776b;

    /* renamed from: c */
    atph f108777c;

    /* renamed from: f */
    private atya f108778f;

    /* renamed from: g */
    private Button f108779g;

    /* renamed from: h */
    private boolean f108780h;

    /* renamed from: i */
    private final BroadcastReceiver f108781i = new aacn("tapandpay") {
        /* class com.google.android.gms.tapandpay.tokenization.EnableNfcChimeraActivity.C16641 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            EnableNfcChimeraActivity enableNfcChimeraActivity = EnableNfcChimeraActivity.this;
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            int i = EnableNfcChimeraActivity.f108774d;
            enableNfcChimeraActivity.mo59437b(intExtra);
        }
    };

    /* renamed from: h */
    private final void m93208h() {
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (cgwn.m147275y()) {
            aywx a = this.f108776b.f98673b.mo54504a(92629);
            a.mo54481a(ayxb.m85017a(accountInfo.f108326b));
            a.mo54503a(getContainerActivity());
        }
    }

    /* renamed from: a */
    public final void mo50172a(int i) {
    }

    /* renamed from: b */
    public final void mo59437b(int i) {
        if (i == 1) {
            this.f108779g.setEnabled(true);
        } else if (i == 2 || i == 3) {
            setResult(-1);
            finish();
        } else if (i != 4) {
            bnsl bnsl = (bnsl) f108775e.mo68388c();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.EnableNfcChimeraActivity", "b", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Unexpected NFC adapter state: %d", i);
        } else {
            this.f108779g.setEnabled(false);
        }
    }

    /* renamed from: e */
    public final void mo59438e() {
        auar auar = new auar();
        auar.f91337e = getString(C0126R.string.common_turn_on_nfc);
        auar.f91336d = getString(C0126R.string.common_got_it);
        auar.f91335c = getString(C0126R.string.tp_enable_nfc_dialog_message);
        auar.f91340h = bpan.CONFIRM_NFC;
        auar.mo50344a().show(getSupportFragmentManager(), "EnableNfcDialog");
    }

    /* renamed from: g */
    public final void mo59439g() {
        this.f108778f.mo50313b();
        mo59437b(2);
    }

    public final void onBackPressed() {
        mo59438e();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.EnableNfcButton) {
            mo59439g();
        } else if (id == C0126R.C0129id.EnableNfcNegative) {
            mo59438e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132018962);
        atya a = atyb.m76543a(this);
        this.f108778f = a;
        if (a == null) {
            finish();
        }
        this.f108780h = getIntent().getBooleanExtra("EXTRA_MONET_ONBOARDING", false) && cgwn.m147257g();
        if (this.f108777c == null) {
            atpg atpg = new atpg();
            alir a2 = aliq.m60909a();
            cazf.m127594a(a2);
            atpg.f90629a = a2;
            cazf.m127595a(atpg.f90629a, alir.class);
            this.f108777c = new atph(atpg.f90629a);
        }
        ayxa a3 = this.f108777c.f90630a.mo40366a();
        cazf.m127593a(a3, "Cannot return null from a non-@Nullable component method");
        this.f108776b = a3;
        if (this.f108780h) {
            setContentView((int) C0126R.C0128layout.tp_monet_onboarding_layout);
            ((TextView) findViewById(C0126R.C0129id.TitleText)).setText((int) C0126R.string.tp_enable_nfc_title_monet);
            ((TextView) findViewById(C0126R.C0129id.SubtitleText)).setText((int) C0126R.string.tp_enable_nfc_body_monet);
            Button button = (Button) findViewById(C0126R.C0129id.SetUpButton);
            this.f108779g = button;
            button.setText((int) C0126R.string.tp_enable_nfc_positive_button);
            this.f108779g.setOnClickListener(new atpq(this));
            ((NetworkImageView) findViewById(C0126R.C0129id.ScreenLockImage)).setImageUrl(cgwt.m147406b(), atyg.m76548a());
            NetworkImageView networkImageView = (NetworkImageView) findViewById(C0126R.C0129id.NetworkImage);
            networkImageView.setVisibility(0);
            networkImageView.setImageUrl(cgwt.f187939a.mo6606a().mo84652b(), atyg.m76548a());
            Button button2 = (Button) findViewById(C0126R.C0129id.SkipButton);
            button2.setVisibility(0);
            button2.setText((int) C0126R.string.tp_enable_nfc_negative_button);
            button2.setOnClickListener(new atpr(this));
            m93208h();
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setContentView((int) C0126R.C0128layout.tp_activity_enable_nfc);
        m93208h();
        setTitle((int) C0126R.string.tp_enable_nfc_title);
        atyg.m76553a(getString(C0126R.string.tp_enable_nfc_body, new Object[]{getString(C0126R.string.tp_enable_nfc_settings_link)}), getString(C0126R.string.tp_enable_nfc_settings_link), (TextView) findViewById(C0126R.C0129id.BodyWithLink), new Intent("android.settings.NFC_SETTINGS"));
        Button button3 = (Button) findViewById(C0126R.C0129id.EnableNfcButton);
        this.f108779g = button3;
        button3.setOnClickListener(this);
        findViewById(C0126R.C0129id.EnableNfcNegative).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        unregisterReceiver(this.f108781i);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo59437b(!this.f108778f.mo50312a() ? 1 : 3);
        registerReceiver(this.f108781i, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i == -1) {
            finish();
        } else if (i == -2) {
            mo59439g();
        }
    }
}
