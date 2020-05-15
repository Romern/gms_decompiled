package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: avsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsj extends avsf {

    /* renamed from: b */
    private GlifLayout f93837b;

    /* renamed from: a */
    public final void mo51555a(int i) {
        biyp biyp = ((biyn) this.f93837b.mo71342a(biyn.class)).f122314f;
        Context context = getContext();
        bmxy.m108581a(context);
        biyp.mo64886a(context, i);
    }

    /* renamed from: b */
    public final void mo51558b(CharSequence charSequence) {
        ((TextView) this.f93837b.findViewById(C0126R.C0129id.warning)).setText(charSequence);
    }

    /* renamed from: c */
    public final void mo51560c() {
        GlifLayout glifLayout = this.f93837b;
        Drawable g = glifLayout.mo71368g();
        g.setColorFilter(new PorterDuffColorFilter(getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
        glifLayout.mo71362a(g);
        super.mo51560c();
        mo51574m();
        mo51559b(true);
    }

    /* renamed from: d */
    public final int mo51563d() {
        return 5;
    }

    /* renamed from: e */
    public final View mo51565e() {
        return this.f93837b;
    }

    /* renamed from: f */
    public final TextView mo51567f() {
        return (TextView) this.f93837b.findViewById(C0126R.C0129id.description);
    }

    /* renamed from: g */
    public final TextView mo51568g() {
        return (TextView) this.f93837b.findViewById(C0126R.C0129id.size);
    }

    /* renamed from: h */
    public final TextView mo51569h() {
        return this.f93837b.mo71366e();
    }

    /* renamed from: i */
    public final TextView mo51570i() {
        return this.f93837b.mo71366e();
    }

    /* renamed from: j */
    public final TextView mo51571j() {
        return (TextView) this.f93837b.findViewById(C0126R.C0129id.button_qualifier);
    }

    /* renamed from: k */
    public final TextView mo51572k() {
        return (TextView) this.f93837b.findViewById(C0126R.C0129id.progress_bar_status);
    }

    /* renamed from: l */
    public final ProgressBar mo51573l() {
        this.f93837b.mo71364b(true);
        return this.f93837b.mo71370i();
    }

    /* renamed from: m */
    public final void mo51574m() {
        this.f93837b.findViewById(C0126R.C0129id.progress_bar_status).setVisibility(8);
        this.f93837b.mo71364b(false);
    }

    /* renamed from: n */
    public final void mo51575n() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.system_update_activity_glif3, viewGroup, false);
        GlifLayout glifLayout = (GlifLayout) inflate.findViewById(C0126R.C0129id.setup_wizard_layout);
        this.f93837b = glifLayout;
        glifLayout.mo71368g().setColorFilter(new PorterDuffColorFilter(getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
        biyn biyn = (biyn) this.f93837b.mo71342a(biyn.class);
        Context context = getContext();
        bmxy.m108581a(context);
        if (biyn != null) {
            biyo biyo = new biyo(context);
            biyo.f122326a = "";
            biyo.f122329d = 2132018230;
            biyo.f122327b = new avsh(this);
            biyn.mo52735b(biyo.mo64882a());
            biyo biyo2 = new biyo(context);
            biyo2.f122326a = "";
            biyo2.f122329d = 2132018229;
            biyo2.f122327b = new avsi(this);
            biyn.mo52733a(biyo2.mo64882a());
            mo51557a(false);
            mo51562c(false);
        }
        mo51573l().setIndeterminate(true);
        return inflate;
    }

    /* renamed from: b */
    public final void mo51559b(boolean z) {
        ProgressBar progressBar = (ProgressBar) this.f93837b.findViewById(C0126R.C0129id.circular_progress_bar);
        if (z) {
            progressBar.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo51564d(boolean z) {
        View findViewById = this.f93837b.findViewById(C0126R.C0129id.warning_container);
        if (z) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo51566e(boolean z) {
        TextView textView = (TextView) this.f93837b.findViewById(C0126R.C0129id.progress_bar_information);
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo51556a(CharSequence charSequence) {
        ((biyn) this.f93837b.mo71342a(biyn.class)).f122315g.mo64887a(charSequence);
    }

    /* renamed from: a */
    public final void mo51557a(boolean z) {
        if (!z) {
            ((biyn) this.f93837b.mo71342a(biyn.class)).mo64874a().setVisibility(4);
        } else {
            ((biyn) this.f93837b.mo71342a(biyn.class)).mo64874a().setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo51561c(CharSequence charSequence) {
        ((TextView) this.f93837b.findViewById(C0126R.C0129id.progress_bar_information)).setText(charSequence);
    }

    /* renamed from: c */
    public final void mo51562c(boolean z) {
        if (!z) {
            ((biyn) this.f93837b.mo71342a(biyn.class)).mo64880e().setVisibility(4);
        } else {
            ((biyn) this.f93837b.mo71342a(biyn.class)).mo64880e().setVisibility(0);
        }
    }
}
