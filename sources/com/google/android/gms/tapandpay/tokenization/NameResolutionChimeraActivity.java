package com.google.android.gms.tapandpay.tokenization;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NameResolutionChimeraActivity extends atex {

    /* renamed from: b */
    public TextInputLayout f108822b;

    /* renamed from: c */
    ayxa f108823c;

    /* renamed from: d */
    private AccountInfo f108824d;

    /* renamed from: e */
    private Button f108825e;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        finish();
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_name_resolution);
        C1341rz aW = mo8628aW();
        aW.mo15855c((int) C0126R.string.tp_name_resolution_title);
        aW.mo15860d(12);
        aW.mo15865f((int) C0126R.string.common_cancel);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108824d = accountInfo;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b)) {
            setResult(0);
            finish();
            return;
        }
        atpk atpk = new atpk();
        alir a = aliq.m60909a();
        cazf.m127594a(a);
        atpk.f90633a = a;
        cazf.m127595a(atpk.f90633a, alir.class);
        ayxa a2 = new atpl(atpk.f90633a).f90634a.mo40366a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f108823c = a2;
        if (cgwn.m147275y()) {
            aywx a3 = this.f108823c.f98673b.mo54504a(92626);
            a3.mo54481a(ayxb.m85017a(this.f108824d.f108326b));
            a3.mo54503a(getContainerActivity());
        }
        atam atam = new atam(this, this.f108824d);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C0126R.C0129id.card_holder_name_input);
        this.f108822b = textInputLayout;
        textInputLayout.mo71272c(getString(C0126R.string.tp_card_holder_error_text));
        this.f108822b.mo71266b(true);
        this.f108822b.f151297a.addTextChangedListener(new atqj(this));
        Button button = (Button) findViewById(C0126R.C0129id.continue_button);
        this.f108825e = button;
        button.setOnClickListener(new atqk(this, atam));
    }
}
