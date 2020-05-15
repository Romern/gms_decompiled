package com.google.android.gms.auth.api.phone.p024ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: com.google.android.gms.auth.api.phone.ui.AutofillConsentChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillConsentChimeraActivity extends deu {

    /* renamed from: g */
    private static final srn f10283g = srn.m36124a();

    /* renamed from: b */
    public final ibh f10284b = new ibh();

    /* renamed from: c */
    public Context f10285c;

    /* renamed from: d */
    public String f10286d;

    /* renamed from: e */
    public iac f10287e;

    /* renamed from: f */
    bhfq f10288f;

    /* renamed from: a */
    private final boolean m6403a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((bnsl) f10283g.mo68390d()).mo68405a("Not from startActivityForResult(). This calling is invalid.");
            return false;
        } else if (ibb.m15153a(this.f10285c, str)) {
            return true;
        } else {
            ((bnsl) f10283g.mo68390d()).mo68405a("Caller is not current autofill service. This calling is invalid.");
            return false;
        }
    }

    /* renamed from: e */
    public final void mo7514e() {
        this.f10287e.mo12859d();
        setResult(0);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cceb.m129359c()) {
            finish();
            return;
        }
        this.f10285c = getApplicationContext();
        String a = spn.m35852a((Activity) this);
        if (!m6403a(a)) {
            this.f10284b.mo12886a(this.f10285c, ibh.m15183d(a, 10));
            finish();
            return;
        }
        this.f10286d = a;
        this.f10284b.mo12886a(this.f10285c, ibh.m15183d(a, 0));
        this.f10287e = new iac(this.f10285c);
        bhfq bhfq = new bhfq(this, C0126R.style.BottomSheetDialogTheme);
        this.f10288f = bhfq;
        bhfq.setCanceledOnTouchOutside(false);
        bhfq bhfq2 = this.f10288f;
        String str = this.f10286d;
        View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.sms_user_consent_fragment, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.consent_description);
        try {
            String charSequence = svr.m36484b(this.f10285c).mo26177b(str).toString();
            if (!TextUtils.isEmpty(charSequence)) {
                str = charSequence;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        String string = getString(C0126R.string.sms_code_autofill_consent_title, new Object[]{str});
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(str);
        spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
        textView.setText(spannableString);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.matched_sms);
        if (cceb.m129363g()) {
            textView2.setText(getString(C0126R.string.f7405xe4702c20));
        } else {
            textView2.setText(getString(C0126R.string.sms_code_autofill_consent_message));
        }
        ((Button) inflate.findViewById(C0126R.C0129id.negative_button)).setOnClickListener(new ian(this));
        ((Button) inflate.findViewById(C0126R.C0129id.positive_button)).setOnClickListener(new iao(this));
        bhfq2.setContentView(inflate);
        this.f10288f.setOnCancelListener(new iam(this));
        this.f10288f.show();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        bhfq bhfq = this.f10288f;
        if (bhfq != null && bhfq.isShowing()) {
            this.f10288f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!m6403a(spn.m35852a((Activity) this))) {
            finish();
        }
    }
}
