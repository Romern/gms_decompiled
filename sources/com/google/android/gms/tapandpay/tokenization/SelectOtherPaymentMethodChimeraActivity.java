package com.google.android.gms.tapandpay.tokenization;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectOtherPaymentMethodChimeraActivity extends atex {

    /* renamed from: f */
    private static final srn f108826f = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public String f108827b;

    /* renamed from: c */
    atqn f108828c;

    /* renamed from: d */
    atam f108829d;

    /* renamed from: e */
    int f108830e = 1;

    /* renamed from: a */
    public final void mo59452a(int i) {
        atam atam = this.f108829d;
        int i2 = this.f108830e;
        bxvd g = atam.mo49765g(47);
        bxvd da = bpag.f135480d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpag bpag = (bpag) da.f164949b;
        bpag.f135483b = i - 1;
        int i3 = bpag.f135482a | 1;
        bpag.f135482a = i3;
        int i4 = i2 - 1;
        if (i2 != 0) {
            bpag.f135484c = i4;
            bpag.f135482a = i3 | 4;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            bpag bpag2 = (bpag) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            bpag2.getClass();
            bpbx.f135674t = bpag2;
            bpbx.f135655a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            atam.mo49741a((bpbx) g.mo74062i());
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1100 && i2 == -1) {
            Intent intent2 = intent != null ? new Intent(intent) : new Intent();
            intent2.putExtra("other_payment_option_type_extra", 2);
            setResult(-1, intent2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1341rz aW = mo8628aW();
        aW.mo15855c((int) C0126R.string.tp_other_payment_methods_title);
        aW.mo15860d(12);
        aW.mo15865f((int) C0126R.string.common_back);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (accountInfo == null) {
            bnsl bnsl = (bnsl) f108826f.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectOtherPaymentMethodChimeraActivity", "onCreate", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Activity started without account info, finishing");
            finish();
            return;
        }
        this.f108827b = getIntent().getStringExtra("extra_calling_package");
        if (this.f108829d == null) {
            this.f108829d = new atam(getApplicationContext(), accountInfo);
        }
        setContentView((int) C0126R.C0128layout.tp_select_other_payment_method_activity);
        this.f108828c = new atqn(this, new ArrayList());
        ((ListView) findViewById(C0126R.C0129id.PaymentMethodList)).setAdapter((ListAdapter) this.f108828c);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        int i;
        super.onStart();
        asjl.m74236a(this, "Choose Type of Payment");
        String string = asjw.m74255a() ? getString(C0126R.string.tp_paypal_payment_option_sub_label) : getString(C0126R.string.tp_paypal_payment_option_non_hce_sub_label);
        this.f108828c.clear();
        if (cgxf.m147444b()) {
            this.f108828c.add(new atqm(getString(C0126R.string.tp_paypal), string, getResources().getDrawable(C0126R.C0127drawable.tp_paypal_color_48dp), new atql(this)));
        }
        this.f108828c.notifyDataSetChanged();
        if (!cgxf.m147444b()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f108830e = i;
        mo59452a(2);
    }
}
