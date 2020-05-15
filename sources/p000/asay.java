package p000;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: asay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asay implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f88636a;

    /* renamed from: b */
    final /* synthetic */ asbb f88637b;

    public asay(asbb asbb, AlertDialog alertDialog) {
        this.f88637b = asbb;
        this.f88636a = alertDialog;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f88637b.f88642c = charSequence.toString();
        this.f88637b.mo49019a(this.f88636a);
    }
}
