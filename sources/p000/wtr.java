package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: wtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wtr implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ Button f51312a;

    /* renamed from: b */
    final /* synthetic */ wts f51313b;

    public wtr(wts wts, Button button) {
        this.f51313b = wts;
        this.f51312a = button;
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.trim().length() <= 0) {
            this.f51312a.setEnabled(false);
        } else {
            this.f51312a.setEnabled(!obj.equals(this.f51313b.mo29403f()));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
