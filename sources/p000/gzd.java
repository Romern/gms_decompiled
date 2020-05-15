package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: gzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gzd extends adcf {

    /* renamed from: a */
    public hay f19278a;

    /* renamed from: b */
    public hix f19279b;

    /* renamed from: c */
    public View f19280c;

    /* renamed from: d */
    public ProgressBar f19281d;

    /* renamed from: e */
    private AccountParticleDisc f19282e;

    /* renamed from: f */
    private TextView f19283f;

    /* renamed from: g */
    private TextView f19284g;

    /* renamed from: h */
    private View f19285h;

    /* renamed from: i */
    private Button f19286i;

    /* renamed from: j */
    private Button f19287j;

    /* renamed from: a */
    public final void mo12347a() {
        this.f19287j.setEnabled(false);
        this.f19286i.setEnabled(false);
        this.f19278a.mo12369a(true);
    }

    public final void onActivityCreated(Bundle bundle) {
        hba hba;
        SpannableStringBuilder spannableStringBuilder;
        super.onActivityCreated(bundle);
        hay hay = (hay) adcj.m50161a(getActivity()).mo3444a(hay.class);
        this.f19278a = hay;
        hay.f19389m.mo2445a(this, new gyu(this));
        this.f19279b = new hix(this, this.f19278a.f19381e.f10226c, null);
        View view = getView();
        ((ImageView) view.findViewById(C0126R.C0129id.app_icon)).setImageBitmap(this.f19278a.f19383g);
        ((TextView) view.findViewById(C0126R.C0129id.title)).setText(getString(C0126R.string.credentials_google_sign_in_consent_title, this.f19278a.f19382f));
        this.f19282e = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        bqgj a = snp.m35702a(9);
        bdej bdej = new bdej(adap);
        this.f19282e.mo60576a(bdej, hay.class);
        gzc gzc = new gzc(this);
        AccountParticleDisc.m94876a(getContext(), bdej, a, gzc, gzc, hay.class);
        this.f19282e.mo60577a(this.f19278a);
        ((TextView) view.findViewById(C0126R.C0129id.account_id)).setText(((Account) this.f19278a.f19384h.mo2448b()).name);
        this.f19283f = (TextView) view.findViewById(C0126R.C0129id.consent);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.f19283f.setMovementMethod(new LinkMovementMethod());
        String string = getString(C0126R.string.common_privacy_policy_composed_string);
        String string2 = getString(C0126R.string.common_terms_of_service_composed_string);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        Context context = getContext();
        hba hba2 = this.f19278a.f19387k;
        if (hba2.f19394b.mo66813a()) {
            hba = hba2;
            adcm.m50165a(context, spannableStringBuilder3, string, (String) hba2.f19394b.mo66814b(), context.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gyy(this));
        } else {
            hba = hba2;
            spannableStringBuilder3.append((CharSequence) string);
        }
        if (hba.f19393a.mo66813a()) {
            spannableStringBuilder = spannableStringBuilder4;
            adcm.m50165a(context, spannableStringBuilder4, string2, (String) hba.f19393a.mo66814b(), context.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gyz(this));
        } else {
            spannableStringBuilder = spannableStringBuilder4;
            spannableStringBuilder.append((CharSequence) string2);
        }
        spannableStringBuilder2.append(TextUtils.expandTemplate(getString(C0126R.string.credentials_assisted_signin_consent), this.f19278a.f19382f, spannableStringBuilder3, spannableStringBuilder));
        this.f19283f.setText(spannableStringBuilder2);
        this.f19284g = (TextView) view.findViewById(C0126R.C0129id.description);
        String string3 = getString(C0126R.string.common_asm_google_account_title);
        this.f19284g.setMovementMethod(new LinkMovementMethod());
        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        Context context2 = getContext();
        adcm.m50165a(context2, spannableStringBuilder5, string3, new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getContext().getPackageName()).putExtra("extra.screenId", getResources().getInteger(C0126R.integer.screen_id_sign_in_with_google_apps)).putExtra("extra.accountName", ((Account) this.f19278a.f19384h.mo2448b()).name).toUri(1), context2.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gza(this));
        spannableStringBuilder6.append(TextUtils.expandTemplate(getString(C0126R.string.credentials_assisted_signin_description), spannableStringBuilder5));
        this.f19284g.setText(spannableStringBuilder6);
        this.f19284g.setVisibility(0);
        this.f19285h = view.findViewById(C0126R.C0129id.consent_gradient_bottom_rectangle);
        View findViewById = view.findViewById(C0126R.C0129id.parent_scroll_view);
        View findViewById2 = view.findViewById(C0126R.C0129id.child_linear_view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new gzb(this, view, findViewById2, findViewById));
        findViewById.getViewTreeObserver().addOnScrollChangedListener(new gyv(this, findViewById2, findViewById));
        Button button = (Button) view.findViewById(C0126R.C0129id.cancel_button);
        this.f19286i = button;
        button.setOnClickListener(new gyw(this));
        Button button2 = (Button) view.findViewById(C0126R.C0129id.agree_and_share_button);
        this.f19287j = button2;
        button2.setOnClickListener(new gyx(this));
        this.f19280c = view.findViewById(C0126R.C0129id.container_overlay);
        this.f19281d = (ProgressBar) view.findViewById(C0126R.C0129id.loading_progress);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.cloneInContext(new C1416ut(getActivity(), (int) C0126R.style.CredentialsDialogTheme)).inflate((int) C0126R.C0128layout.credentials_google_sign_in_consent_fragment, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo12348a(boolean z) {
        if (!z) {
            this.f19285h.setVisibility(8);
        } else {
            this.f19285h.setVisibility(0);
        }
    }
}
