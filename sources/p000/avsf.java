package p000;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: avsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avsf extends Fragment {

    /* renamed from: a */
    public avsg f93834a;

    /* renamed from: a */
    public abstract void mo51555a(int i);

    /* renamed from: a */
    public abstract void mo51556a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo51557a(boolean z);

    /* renamed from: b */
    public abstract void mo51558b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo51559b(boolean z);

    /* renamed from: c */
    public void mo51560c() {
        mo51567f().setVisibility(8);
        mo51568g().setVisibility(8);
        mo51569h().setVisibility(8);
        mo51570i().setVisibility(0);
        mo51570i().setText((int) C0126R.string.checking_for_update_status_text);
        mo51571j().setVisibility(8);
        mo51572k().setVisibility(8);
        mo51557a(false);
        mo51562c(false);
        mo51564d(false);
        mo51575n();
        ProgressBar l = mo51573l();
        l.setIndeterminate(true);
        l.getProgressDrawable().setAlpha(255);
        l.getProgressDrawable().setColorFilter(null);
        mo51566e(false);
        mo51559b(false);
    }

    /* renamed from: c */
    public abstract void mo51561c(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo51562c(boolean z);

    /* renamed from: d */
    public abstract int mo51563d();

    /* renamed from: d */
    public abstract void mo51564d(boolean z);

    /* renamed from: e */
    public abstract View mo51565e();

    /* renamed from: e */
    public abstract void mo51566e(boolean z);

    /* renamed from: f */
    public abstract TextView mo51567f();

    /* renamed from: g */
    public abstract TextView mo51568g();

    /* renamed from: h */
    public abstract TextView mo51569h();

    /* renamed from: i */
    public abstract TextView mo51570i();

    /* renamed from: j */
    public abstract TextView mo51571j();

    /* renamed from: k */
    public abstract TextView mo51572k();

    /* renamed from: l */
    public abstract ProgressBar mo51573l();

    /* renamed from: m */
    public abstract void mo51574m();

    /* renamed from: n */
    public abstract void mo51575n();

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f93834a = (avsg) activity;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append(valueOf);
            sb.append(" must implement OtaUiCallback");
            throw new ClassCastException(sb.toString());
        }
    }
}
