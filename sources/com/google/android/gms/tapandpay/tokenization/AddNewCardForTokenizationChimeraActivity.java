package com.google.android.gms.tapandpay.tokenization;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddNewCardForTokenizationChimeraActivity extends Activity implements ateu {

    /* renamed from: a */
    private AccountInfo f108761a;

    /* renamed from: b */
    private byte[] f108762b;

    /* renamed from: c */
    private String f108763c;

    /* renamed from: d */
    private String f108764d;

    /* renamed from: e */
    private atew f108765e;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final atew mo59436a() {
        if (this.f108765e == null) {
            this.f108765e = new atew(this, (LayoutInflater) super.getSystemService("layout_inflater"));
        }
        return this.f108765e;
    }

    /* renamed from: d */
    public final AccountInfo mo49909d() {
        return mo59436a().f90210a;
    }

    public final Object getSystemService(String str) {
        if (str.equals("layout_inflater")) {
            return mo59436a().mo49912a();
        }
        return super.getSystemService(str);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                Intent intent2 = new Intent();
                if (intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                    this.f108762b = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                    this.f108764d = intent.getStringExtra("com.google.android.gms.wallet.f1InstrumentId");
                    intent2.putExtra("output_integrator_callback_data", this.f108762b);
                    intent2.putExtra("card_id", this.f108764d);
                    setResult(-1, intent2);
                } else {
                    setResult(2);
                }
            } else {
                setResult(i2);
            }
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        if (bundle == null) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("extra_orchestration_add_token");
            this.f108761a = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
            awlc awlc = new awlc(this);
            awlc.mo52187a(askc.m74269a());
            awlc.mo52188a(new Account(this.f108761a.f108326b, "com.google"));
            awlc.mo52233a(byteArrayExtra);
            awlc.mo52190a(atvh.m76455a(this));
            awlc.mo52192b(3);
            startActivityForResult(awlc.mo52186a(), 1);
        } else if (bundle.containsKey("key_integrator_callback_data")) {
            this.f108762b = bundle.getByteArray("key_integrator_callback_data");
            this.f108763c = bundle.getString("key_cvv");
            this.f108764d = bundle.getString("key_added_card_id");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putByteArray("key_integrator_callback_data", this.f108762b);
        bundle.putString("key_integrator_callback_data", this.f108763c);
        bundle.putString("key_added_card_id", this.f108764d);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Add New Card");
        AccountInfo accountInfo = mo59436a().f90210a;
        if (accountInfo != null) {
            new atam(new askf(accountInfo, askc.m74272b(), this)).mo49748a(getContainerActivity().getClass().getCanonicalName());
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        sre.m36089i(this);
        mo59436a().mo49913a(intent);
        super.startActivityForResult(intent, i);
    }
}
