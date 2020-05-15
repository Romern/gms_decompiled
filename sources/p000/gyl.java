package p000;

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
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.button.MaterialButton;

/* renamed from: gyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gyl extends adcf {

    /* renamed from: a */
    public hel f19229a;

    /* renamed from: b */
    public gzz f19230b;

    /* renamed from: c */
    public View f19231c;

    /* renamed from: d */
    public TextView f19232d;

    /* renamed from: e */
    public TextView f19233e;

    /* renamed from: f */
    public AccountParticleDisc f19234f;

    /* renamed from: g */
    public MaterialButton f19235g;

    /* renamed from: h */
    public TextView f19236h;

    /* renamed from: i */
    public TextView f19237i;

    /* renamed from: j */
    public TextView f19238j;

    /* renamed from: k */
    public View f19239k;

    /* renamed from: l */
    public String f19240l;

    /* renamed from: m */
    public boolean f19241m;

    /* renamed from: n */
    public hix f19242n;

    /* renamed from: o */
    private View f19243o;

    /* renamed from: p */
    private View f19244p;

    /* renamed from: a */
    public final String mo12328a(InternalSignInCredentialWrapper internalSignInCredentialWrapper, int i) {
        return new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getContext().getPackageName()).putExtra("extra.screenId", i).putExtra("extra.accountName", internalSignInCredentialWrapper.f10232f.name).toUri(1);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19229a = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        gzz gzz = (gzz) adcj.m50161a(activity).mo3444a(gzz.class);
        this.f19230b = gzz;
        this.f19240l = gzz.f19318g;
        gzz.f19332u.mo2445a(this, new gyd(this));
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        bqgj a = snp.m35702a(9);
        bdej bdej = new bdej(adap);
        this.f19234f.mo60576a(bdej, hek.class);
        heo heo = new heo(this.f19230b.f19317f);
        AccountParticleDisc.m94876a(getContext(), bdej, a, heo, heo, hek.class);
        this.f19242n = new hix(this, this.f19230b.f19321j, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.f19241m = bundle.getBoolean("key_stop_user_interaction", false);
        }
        View inflate = layoutInflater.cloneInContext(new C1416ut(getContext(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_assisted_signin_single_entry, viewGroup, false);
        this.f19231c = inflate.findViewById(C0126R.C0129id.header_with_logo);
        inflate.findViewById(C0126R.C0129id.cancel).setOnClickListener(new gyj(this));
        this.f19243o = inflate.findViewById(C0126R.C0129id.divider);
        this.f19244p = inflate.findViewById(C0126R.C0129id.progress);
        this.f19236h = (TextView) inflate.findViewById(C0126R.C0129id.title);
        this.f19234f = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.account_particle_disc);
        this.f19232d = (TextView) inflate.findViewById(C0126R.C0129id.account_display_name);
        this.f19233e = (TextView) inflate.findViewById(C0126R.C0129id.account_name);
        this.f19235g = (MaterialButton) inflate.findViewById(C0126R.C0129id.continue_button);
        this.f19238j = (TextView) inflate.findViewById(C0126R.C0129id.consent);
        this.f19237i = (TextView) inflate.findViewById(C0126R.C0129id.description);
        this.f19239k = inflate.findViewById(C0126R.C0129id.main_container);
        if (this.f19241m) {
            mo12329a();
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_stop_user_interaction", this.f19241m);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo12329a() {
        this.f19241m = true;
        this.f19235g.setEnabled(false);
        this.f19243o.setVisibility(8);
        this.f19244p.setVisibility(0);
        this.f19239k.setAlpha(0.3f);
    }

    /* renamed from: a */
    public final void mo12330a(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        String string = getString(C0126R.string.common_asm_google_account_title);
        this.f19237i.setMovementMethod(new LinkMovementMethod());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Context context = getContext();
        adcm.m50165a(context, spannableStringBuilder, string, mo12328a(internalSignInCredentialWrapper, getResources().getInteger(C0126R.integer.screen_id_sign_in_with_google_apps)), context.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gyg(this));
        spannableStringBuilder2.append(TextUtils.expandTemplate(getString(C0126R.string.credentials_assisted_signin_description), spannableStringBuilder));
        this.f19237i.setText(spannableStringBuilder2);
        this.f19237i.setVisibility(0);
    }
}
