package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bjzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzt implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bkaf f123712a;

    public bjzt(bkaf bkaf) {
        this.f123712a = bkaf;
    }

    public final void afterTextChanged(Editable editable) {
        bkae bkae = this.f123712a.f123789z;
        if (bkae != null) {
            editable.toString();
            bkae.mo65692c();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
