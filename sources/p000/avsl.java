package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: avsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsl extends avsf implements View.OnClickListener {
    /* renamed from: a */
    public final void mo51555a(int i) {
        View view = getView();
        bmxy.m108581a(view);
        ((TextView) view.findViewById(C0126R.C0129id.action_button)).setText(i);
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

    /* renamed from: c */
    public final void mo51561c(CharSequence charSequence) {
    }

    /* renamed from: c */
    public final void mo51562c(boolean z) {
    }

    /* renamed from: d */
    public final int mo51563d() {
        return 3;
    }

    /* renamed from: d */
    public final void mo51564d(boolean z) {
    }

    /* renamed from: e */
    public final View mo51565e() {
        View view = getView();
        bmxy.m108581a(view);
        return view;
    }

    /* renamed from: e */
    public final void mo51566e(boolean z) {
    }

    /* renamed from: f */
    public final TextView mo51567f() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.description);
    }

    /* renamed from: g */
    public final TextView mo51568g() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.size);
    }

    /* renamed from: h */
    public final TextView mo51569h() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.title);
    }

    /* renamed from: i */
    public final TextView mo51570i() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.status);
    }

    /* renamed from: j */
    public final TextView mo51571j() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.button_qualifier);
    }

    /* renamed from: k */
    public final TextView mo51572k() {
        View view = getView();
        bmxy.m108581a(view);
        return (TextView) view.findViewById(C0126R.C0129id.status2);
    }

    /* renamed from: l */
    public final ProgressBar mo51573l() {
        View view = getView();
        bmxy.m108581a(view);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C0126R.C0129id.progress);
        progressBar.setVisibility(0);
        return progressBar;
    }

    /* renamed from: m */
    public final void mo51574m() {
        View view = getView();
        bmxy.m108581a(view);
        view.findViewById(C0126R.C0129id.progress).setVisibility(8);
    }

    /* renamed from: n */
    public final void mo51575n() {
        View view = getView();
        bmxy.m108581a(view);
        view.findViewById(C0126R.C0129id.action_button_2).setVisibility(8);
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.system_update_activity, viewGroup, false);
        inflate.findViewById(C0126R.C0129id.action_button).setOnClickListener(this);
        inflate.findViewById(C0126R.C0129id.action_button_2).setOnClickListener(this);
        int i = Build.VERSION.SDK_INT;
        inflate.setLayoutDirection(3);
        return inflate;
    }

    /* renamed from: a */
    public final void mo51557a(boolean z) {
        View view = getView();
        bmxy.m108581a(view);
        view.findViewById(C0126R.C0129id.action_button).setVisibility(!z ? 8 : 0);
    }
}
