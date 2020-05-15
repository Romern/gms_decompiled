package com.google.android.gms.auth.api.phone.p024ui;

import android.content.Intent;
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
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;

/* renamed from: com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserConsentPromptChimeraActivity extends deu {

    /* renamed from: b */
    public final sek f10289b = new sek("UserConsentPromptChimeraActivity");

    /* renamed from: c */
    public final ibh f10290c = new ibh();

    /* renamed from: d */
    public RequestResult f10291d = null;

    /* renamed from: e */
    public int f10292e = 0;

    /* renamed from: f */
    public bhfq f10293f;

    /* renamed from: g */
    private iai f10294g;

    /* renamed from: a */
    public final void mo7515a(String str, RequestResult requestResult, String str2) {
        CharSequence charSequence;
        bhfq bhfq = new bhfq(this, C0126R.style.BottomSheetDialogTheme);
        this.f10293f = bhfq;
        bhfq.setCanceledOnTouchOutside(false);
        bhfq bhfq2 = this.f10293f;
        View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.sms_user_consent_fragment, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.matched_sms)).setText(requestResult.f10261b);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.consent_description);
        SpannableString spannableString = new SpannableString(str);
        try {
            charSequence = svr.m36484b(this).mo26177b(str);
        } catch (PackageManager.NameNotFoundException e) {
            this.f10289b.mo25416d("Cannot find calling package: %s", str);
            charSequence = str;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String string = getString(C0126R.string.user_consent_description, new Object[]{charSequence});
            spannableString = new SpannableString(string);
            int indexOf = string.indexOf(charSequence.toString());
            spannableString.setSpan(new StyleSpan(1), indexOf, charSequence.length() + indexOf, 33);
        }
        textView.setText(spannableString);
        ((Button) inflate.findViewById(C0126R.C0129id.negative_button)).setOnClickListener(new iat(this));
        ((Button) inflate.findViewById(C0126R.C0129id.positive_button)).setOnClickListener(new iav(this, requestResult, str, str2));
        bhfq2.setContentView(inflate);
        this.f10293f.setOnCancelListener(new iau(this, str, str2));
        this.f10293f.show();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.google.android.gms.auth.api.phone.extra.verification_token")) {
            this.f10289b.mo25418e("Illegal intent.", new Object[0]);
            finish();
            return;
        }
        if (bundle != null) {
            this.f10291d = (RequestResult) bundle.getParcelable("saved_request_result");
        }
        String a = spn.m35852a((Activity) this);
        if (TextUtils.isEmpty(a)) {
            this.f10289b.mo25418e("Activity was not launched via startActivityForResult().", new Object[0]);
            finish();
            return;
        }
        VerificationToken verificationToken = (VerificationToken) sef.m35067a(intent, "com.google.android.gms.auth.api.phone.extra.verification_token", VerificationToken.CREATOR);
        RequestResult requestResult = this.f10291d;
        if (requestResult != null) {
            mo7515a(a, requestResult, verificationToken.f10278b);
            return;
        }
        iai iai = new iai(getApplicationContext());
        this.f10294g = iai;
        roz b = rpa.m34196b();
        b.f43472a = new iae(a, verificationToken);
        aucb a2 = iai.mo24701a(b.mo24977a());
        a2.mo50373a(new iar(this, a, verificationToken));
        a2.mo50372a(new ias(this));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        bhfq bhfq = this.f10293f;
        if (bhfq != null && bhfq.isShowing()) {
            this.f10293f.dismiss();
        }
        this.f10294g = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_request_result", this.f10291d);
    }

    /* renamed from: a */
    public final void mo7516a(String str, String str2) {
        if (this.f10294g == null) {
            this.f10294g = new iai(getApplicationContext());
        }
        iai iai = this.f10294g;
        ConsentPromptUserResponse consentPromptUserResponse = new hyg().f20565a;
        consentPromptUserResponse.f10258b = str;
        consentPromptUserResponse.f10259c = str2;
        consentPromptUserResponse.f10257a = this.f10292e;
        roz b = rpa.m34196b();
        b.f43472a = new iaf(consentPromptUserResponse);
        iai.mo24732b(b.mo24977a());
        RequestResult requestResult = this.f10291d;
        bmxy.m108581a(requestResult);
        this.f10290c.mo12887a(getApplicationContext(), ibh.m15174a(str, requestResult.f10263d, this.f10292e == 1 ? bofz.CLICK_AGREE : bofz.CLICK_CANCEL));
        if (!isFinishing()) {
            finish();
        }
    }
}
