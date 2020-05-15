package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bjzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzu implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bkaf f123713a;

    public bjzu(bkaf bkaf) {
        this.f123713a = bkaf;
    }

    public final void afterTextChanged(Editable editable) {
        bkaf bkaf = this.f123713a;
        bjwk bjwk = bkaf.f123752P;
        if (bjwk != null) {
            bjwl.m104781a(bjwk, bkaf.f123769f);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
