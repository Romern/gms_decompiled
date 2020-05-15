package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;

/* renamed from: avsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsn extends avsf implements View.OnClickListener, bjbh {

    /* renamed from: b */
    private SetupWizardLayout f93842b;

    /* renamed from: a */
    public final void mo7768a() {
    }

    /* renamed from: a */
    public final void mo51556a(CharSequence charSequence) {
    }

    /* renamed from: b */
    public final void mo51558b(CharSequence charSequence) {
    }

    /* renamed from: b */
    public final void mo51559b(boolean z) {
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        activity.onBackPressed();
    }

    /* renamed from: c */
    public final void mo51561c(CharSequence charSequence) {
    }

    /* renamed from: c */
    public final void mo51562c(boolean z) {
    }

    /* renamed from: d */
    public final int mo51563d() {
        return 2;
    }

    /* renamed from: d */
    public final void mo51564d(boolean z) {
    }

    /* renamed from: e */
    public final View mo51565e() {
        return this.f93842b;
    }

    /* renamed from: e */
    public final void mo51566e(boolean z) {
    }

    /* renamed from: f */
    public final TextView mo51567f() {
        return (TextView) this.f93842b.findViewById(C0126R.C0129id.description);
    }

    /* renamed from: g */
    public final TextView mo51568g() {
        return (TextView) this.f93842b.findViewById(C0126R.C0129id.size);
    }

    /* renamed from: h */
    public final TextView mo51569h() {
        return this.f93842b.mo71378e();
    }

    /* renamed from: i */
    public final TextView mo51570i() {
        return this.f93842b.mo71378e();
    }

    /* renamed from: j */
    public final TextView mo51571j() {
        return (TextView) this.f93842b.findViewById(C0126R.C0129id.snackbar);
    }

    /* renamed from: k */
    public final TextView mo51572k() {
        return (TextView) this.f93842b.findViewById(C0126R.C0129id.status2);
    }

    /* renamed from: l */
    public final ProgressBar mo51573l() {
        ProgressBar progressBar = (ProgressBar) this.f93842b.findViewById(C0126R.C0129id.progress);
        progressBar.setVisibility(0);
        return progressBar;
    }

    /* renamed from: m */
    public final void mo51574m() {
        this.f93842b.findViewById(C0126R.C0129id.progress).setVisibility(8);
    }

    /* renamed from: n */
    public final void mo51575n() {
        this.f93842b.findViewById(C0126R.C0129id.action_button_2).setVisibility(8);
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.action_button) {
            this.f93834a.mo51576a();
        } else if (view.getId() == C0126R.C0129id.action_button_2) {
            this.f93834a.mo51577b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        Intent intent = activity.getIntent();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.system_update_activity_common, viewGroup, false);
        SetupWizardLayout setupWizardLayout = (SetupWizardLayout) inflate.findViewById(C0126R.C0129id.setup_wizard_layout);
        this.f93842b = setupWizardLayout;
        NavigationBar navigationBar = (NavigationBar) setupWizardLayout.findViewById(C0126R.C0129id.sud_layout_navigation_bar);
        if (!bizc.m103025a(intent) || TextUtils.isEmpty((CharSequence) avma.f93361g.mo51364a())) {
            navigationBar.setVisibility(8);
        } else {
            navigationBar.f151533a.setEnabled(false);
            navigationBar.mo71422a(this);
            navigationBar.setVisibility(0);
            if (intent.getBooleanExtra("useImmersiveMode", false)) {
                bizb.m103017a(activity.getWindow());
            }
        }
        inflate.findViewById(C0126R.C0129id.action_button).setOnClickListener(this);
        inflate.findViewById(C0126R.C0129id.action_button_2).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: a */
    public final void mo51555a(int i) {
        ((Button) this.f93842b.findViewById(C0126R.C0129id.action_button)).setText(i);
    }

    /* renamed from: a */
    public final void mo51557a(boolean z) {
        this.f93842b.findViewById(C0126R.C0129id.action_button).setVisibility(!z ? 8 : 0);
    }
}
