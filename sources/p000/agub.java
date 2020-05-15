package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.p055ui.ConsentWebView;

/* renamed from: agub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agub extends dnw {

    /* renamed from: j */
    private static final srn f66557j = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public Button f66558a;

    /* renamed from: b */
    public Button f66559b;

    /* renamed from: c */
    public ConsentWebView f66560c;

    /* renamed from: d */
    public final int f66561d;

    /* renamed from: e */
    private Activity f66562e;

    /* renamed from: f */
    private final Intent f66563f;

    /* renamed from: g */
    private ConsentAgreementText f66564g;

    /* renamed from: h */
    private View f66565h;

    /* renamed from: i */
    private boolean f66566i = true;

    public agub() {
        Activity activity = getActivity();
        this.f66562e = activity;
        Intent intent = activity.getIntent();
        this.f66563f = intent;
        this.f66561d = intent.getIntExtra("EventFlowId", agrl.m54949c());
    }

    /* renamed from: a */
    private final void m55132a() {
        Activity activity = this.f66562e;
        if (activity != null) {
            activity.finish();
            this.f66562e = null;
        }
    }

    /* renamed from: b */
    public final void mo36111b(boolean z) {
        Activity activity = this.f66562e;
        if (activity != null) {
            activity.setResult(!z ? 0 : -1);
            m55132a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C1341rz aW;
        String str2;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.consent_fragment, viewGroup, false);
        this.f66565h = inflate;
        if (this.f66562e == null) {
            return inflate;
        }
        if (cfmv.m140309h()) {
            Intent intent = this.f66563f;
            if (intent != null) {
                str = intent.getStringExtra("ComeFrom");
            } else {
                str = null;
            }
            if (str == null) {
                ComponentName callingActivity = this.f66562e.getCallingActivity();
                if (callingActivity != null) {
                    str2 = callingActivity.flattenToString();
                } else {
                    int i = Build.VERSION.SDK_INT;
                    Uri referrer = this.f66562e.getReferrer();
                    if (referrer != null) {
                        str2 = referrer.toString();
                    } else {
                        str2 = str;
                    }
                }
                agrl.m54942a().mo35987a(39, str2, "R.layout.consent_fragment", bygd.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.f66561d));
            } else if (str.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                agrl.m54942a().mo35987a(38, str, "R.layout.consent_fragment", bygd.ENTER_CONSENT_UI_VIA_MDP, System.currentTimeMillis(), Integer.valueOf(this.f66561d));
            } else {
                agrl.m54942a().mo35987a(39, str, "R.layout.consent_fragment", bygd.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.f66561d));
            }
            Activity activity = this.f66562e;
            if ((activity instanceof deu) && (aW = ((deu) activity).mo8628aW()) != null) {
                aW.mo15862e();
            }
            this.f66558a = (Button) this.f66565h.findViewById(C0126R.C0129id.agree_button);
            this.f66559b = (Button) this.f66565h.findViewById(C0126R.C0129id.decline_button);
            this.f66560c = (ConsentWebView) this.f66565h.findViewById(C0126R.C0129id.consent_html_view);
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) sef.m35067a(this.f66563f, "AgreementText", ConsentAgreementText.CREATOR);
            this.f66564g = consentAgreementText;
            if (consentAgreementText == null) {
                ((bnsl) f66557j.mo68388c()).mo68405a("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
                this.f66562e.setResult(0);
                m55132a();
                return this.f66565h;
            }
            this.f66560c.mo44110a(consentAgreementText);
            int i2 = Build.VERSION.SDK_INT;
            this.f66560c.f80320a = new agua(this);
            if (!TextUtils.isEmpty(this.f66564g.f80267f)) {
                this.f66558a.setText(this.f66564g.f80267f);
                this.f66558a.setOnClickListener(new agtx(this));
            } else {
                this.f66566i = false;
                mo36110a(false);
            }
            if (!TextUtils.isEmpty(this.f66564g.f80266e)) {
                this.f66559b.setText(this.f66564g.f80266e);
            }
            this.f66559b.setOnClickListener(new agty(this));
            return this.f66565h;
        }
        ((bnsl) f66557j.mo68388c()).mo68405a("Consent is not required, finish this activity");
        m55132a();
        return this.f66565h;
    }

    public final void onDestroyView() {
        this.f66562e = null;
        this.f66558a = null;
        this.f66559b = null;
        this.f66560c = null;
        this.f66564g = null;
        super.onDestroyView();
    }

    /* renamed from: a */
    public final void mo36110a(boolean z) {
        int i;
        if (!TextUtils.isEmpty(this.f66564g.f80265d)) {
            this.f66558a.setText(this.f66564g.f80265d);
        } else {
            this.f66558a.setText((int) C0126R.string.consent_agree_button_text);
        }
        this.f66558a.setOnClickListener(new agtz(this));
        if (cfmq.m140239j()) {
            boolean z2 = false;
            if (z || (this.f66560c.canScrollVertically(-1) && this.f66566i)) {
                z2 = true;
            }
            if (!z2) {
                i = 48;
            } else {
                i = 49;
            }
            agrl.m54942a().mo35987a(i, this.f66558a.getText().toString(), agvn.m55186b(this.f66560c), z2 ? bygd.CONSENT_BUTTON_CHANGED : bygd.CONSENT_SHOWS_AGREE_ON_LOAD, System.currentTimeMillis(), Integer.valueOf(this.f66561d));
        }
    }

    public agub(Activity activity, Intent intent) {
        this.f66562e = activity;
        this.f66563f = intent;
        this.f66561d = intent.getIntExtra("EventFlowId", agrl.m54949c());
    }
}
