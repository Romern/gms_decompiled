package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bkbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkbd implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bkbh f123912a;

    public bkbd(bkbh bkbh) {
        this.f123912a = bkbh;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        bjep bjep = this.f123912a.f123936s;
        if (bjep != null) {
            bjep.mo65063i();
        }
    }
}
