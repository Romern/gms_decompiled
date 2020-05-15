package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bhnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhnz implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bhoh f119181a;

    public bhnz(bhoh bhoh) {
        this.f119181a = bhoh;
    }

    public final void afterTextChanged(Editable editable) {
        bhoh bhoh = this.f119181a;
        if (bhoh.f119220k.f151334h == null) {
            bhoh.mo64084b(bhoh.m101234a(editable));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
