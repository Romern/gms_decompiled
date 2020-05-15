package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.p024ui.UserConsentPromptChimeraActivity;

/* renamed from: iav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iav implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RequestResult f20656a;

    /* renamed from: b */
    final /* synthetic */ String f20657b;

    /* renamed from: c */
    final /* synthetic */ String f20658c;

    /* renamed from: d */
    final /* synthetic */ UserConsentPromptChimeraActivity f20659d;

    public iav(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity, RequestResult requestResult, String str, String str2) {
        this.f20659d = userConsentPromptChimeraActivity;
        this.f20656a = requestResult;
        this.f20657b = str;
        this.f20658c = str2;
    }

    public void onClick(View view) {
        this.f20659d.f10292e = 1;
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", this.f20656a.f10261b);
        int i = this.f20656a.f10262c;
        if (i != -1) {
            intent.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID", i);
        }
        this.f20659d.setResult(-1, intent);
        bhfq bhfq = this.f20659d.f10293f;
        if (bhfq != null && bhfq.isShowing()) {
            this.f20659d.f10293f.dismiss();
        }
        this.f20659d.mo7516a(this.f20657b, this.f20658c);
    }
}
