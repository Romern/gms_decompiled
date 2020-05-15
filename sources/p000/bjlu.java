package p000;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlu extends bjlx implements bjgk {

    /* renamed from: a */
    public bjlv f122948a;

    /* renamed from: b */
    private Dialog f122949b;

    /* renamed from: e */
    private ViewGroup f122950e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9306a() {
        return 81065;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bjlt bjlt = new bjlt(this, getContext());
        this.f122949b = bjlt;
        bjlt.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ViewGroup viewGroup = this.f122950e;
        if (viewGroup != null) {
            this.f122949b.setContentView(viewGroup);
        }
        mo65374a(this.f122949b);
        return this.f122949b;
    }

    /* renamed from: a */
    public final ViewGroup mo65148a(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_dialog_fragment, (ViewGroup) null);
        this.f122950e = linearLayout;
        Dialog dialog = this.f122949b;
        if (dialog != null) {
            dialog.setContentView(linearLayout);
        }
        return this.f122950e;
    }
}
