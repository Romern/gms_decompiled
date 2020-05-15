package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bkbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkbc implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bkbh f123911a;

    public bkbc(bkbh bkbh) {
        this.f123911a = bkbh;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        bjep bjep = this.f123911a.f123936s;
        if (bjep != null) {
            bjep.mo65062h();
        }
    }
}
