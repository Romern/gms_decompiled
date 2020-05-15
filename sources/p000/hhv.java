package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: hhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhv extends adcf {

    /* renamed from: a */
    public hhe f19803a;

    /* renamed from: b */
    public hel f19804b;

    /* renamed from: c */
    public View f19805c;

    /* renamed from: d */
    public LinearLayout f19806d;

    /* renamed from: e */
    public View f19807e;

    /* renamed from: f */
    public AccountParticleDisc f19808f;

    /* renamed from: g */
    public TextView f19809g;

    /* renamed from: h */
    public TextView f19810h;

    /* renamed from: i */
    public ImageView f19811i;

    /* renamed from: j */
    public hix f19812j;

    /* renamed from: k */
    private TextView f19813k;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19803a = (hhe) adcj.m50161a(activity).mo3444a(hhe.class);
        this.f19804b = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        this.f19803a.f19763r.mo2445a(this, new hhr(this));
        this.f19812j = new hix(this, this.f19803a.f19751f, null);
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        bqgj a = snp.m35702a(9);
        bdej bdej = new bdej(adap);
        this.f19808f.mo60576a(bdej, hek.class);
        heo heo = new heo(this.f19803a.f19750e);
        AccountParticleDisc.m94876a(getContext(), bdej, a, heo, heo, hek.class);
        String string = getString(C0126R.string.common_asm_google_account_title);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        hhe hhe = this.f19803a;
        SignInPassword signInPassword = hhe.f19752g.f10245a;
        String str = signInPassword.f10255a;
        hek a2 = hek.m14270a(str, str, signInPassword.f10256b, null);
        a2.f19605e = (Bitmap) hhe.f19754i.f26799b;
        this.f19813k.setText(a2.f19602b);
        this.f19803a.f19766u.mo2445a(this, new hhs(this, getContext(), spannableStringBuilder, string, spannableStringBuilder2));
        this.f19805c.getViewTreeObserver().addOnGlobalLayoutListener(new hhu(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getContext(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_gis_password_saving_confirmation, viewGroup, false);
        this.f19805c = inflate.findViewById(C0126R.C0129id.confirmation_container);
        ((TextView) inflate.findViewById(C0126R.C0129id.title_text)).setText((int) C0126R.string.credentials_gis_pw_saving_save_password);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.selected_google_account);
        this.f19806d = linearLayout;
        linearLayout.setOnClickListener(new hho(this));
        inflate.findViewById(C0126R.C0129id.no_thanks_button).setOnClickListener(new hhp(this));
        inflate.findViewById(C0126R.C0129id.save_button).setOnClickListener(new hhq(this));
        this.f19807e = inflate.findViewById(C0126R.C0129id.down_arrow);
        this.f19808f = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.google_profile_img);
        this.f19809g = (TextView) inflate.findViewById(C0126R.C0129id.google_account_email);
        this.f19810h = (TextView) inflate.findViewById(C0126R.C0129id.consent_text);
        this.f19811i = (ImageView) inflate.findViewById(C0126R.C0129id.account_app_image);
        this.f19813k = (TextView) inflate.findViewById(C0126R.C0129id.username_text);
        return inflate;
    }
}
