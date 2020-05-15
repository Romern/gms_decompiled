package p000;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.wallet.p097ui.common.FormSpinner;

/* renamed from: bkdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdz implements bkda {

    /* renamed from: a */
    private final FormSpinner f124074a;

    public bkdz(FormSpinner formSpinner) {
        this.f124074a = formSpinner;
    }

    /* renamed from: a */
    public final void mo52929a(CharSequence charSequence) {
        View selectedView = this.f124074a.getSelectedView();
        if (selectedView instanceof TextView) {
            ((TextView) selectedView).setError(charSequence);
            return;
        }
        this.f124074a.f152065s = charSequence;
        String valueOf = String.valueOf(selectedView);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Cannot set error on view: ");
        sb.append(valueOf);
        Log.w("FormSpinner", sb.toString());
    }

    /* renamed from: m */
    public final CharSequence mo52932m() {
        View selectedView = this.f124074a.getSelectedView();
        return !(selectedView instanceof TextView) ? this.f124074a.f152065s : ((TextView) selectedView).getError();
    }
}
