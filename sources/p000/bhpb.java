package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: bhpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhpb implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bhpf f119253a;

    public bhpb(bhpf bhpf) {
        this.f119253a = bhpf;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        bhpf bhpf = this.f119253a;
        bhpf.f119222m.setChecked(!bhpf.mo64128c());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
