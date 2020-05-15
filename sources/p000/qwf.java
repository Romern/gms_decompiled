package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: qwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qwf implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ qwg f42310a;

    public qwf(qwg qwg) {
        this.f42310a = qwg;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f42310a.f42312e.f30017c.setEnabled(charSequence.length() > 0);
    }
}
