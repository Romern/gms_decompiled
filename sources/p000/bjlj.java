package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlj extends bjlx implements bjgk {

    /* renamed from: a */
    public bjll f122929a;

    /* renamed from: b */
    public bhfq f122930b;

    /* renamed from: e */
    private ViewGroup f122931e;

    /* renamed from: b */
    private final void m103830b() {
        this.f122930b.mo63666a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9306a() {
        return 81064;
    }

    public final void dismiss() {
        m103830b();
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        m103830b();
        super.dismissAllowingStateLoss();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bjli bjli = new bjli(this, getContext(), getTheme());
        this.f122930b = bjli;
        ViewGroup viewGroup = this.f122931e;
        if (viewGroup != null) {
            bjli.setContentView(viewGroup);
            ((ViewGroup) this.f122931e.getParent()).getLayoutParams().height = -1;
        }
        this.f122930b.setCanceledOnTouchOutside(false);
        bjll bjll = this.f122929a;
        if (bjll != null) {
            bjll.mo65369a(this.f122930b.mo63666a());
        }
        mo65374a(this.f122930b);
        return this.f122930b;
    }

    /* renamed from: a */
    public final ViewGroup mo65148a(LayoutInflater layoutInflater) {
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_dialog_fragment, (ViewGroup) null);
        this.f122931e = viewGroup;
        bhfq bhfq = this.f122930b;
        if (bhfq != null) {
            bhfq.setContentView(viewGroup);
        }
        return this.f122931e;
    }
}
