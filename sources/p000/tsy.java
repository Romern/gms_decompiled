package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: tsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsy implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ tsz f46618a;

    public tsy(tsz tsz) {
        this.f46618a = tsz;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f46618a.f46623e.mo2450b(charSequence.toString());
        this.f46618a.mo26780a();
    }
}
