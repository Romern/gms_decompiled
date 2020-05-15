package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: anys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anys implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ anyt f77892a;

    public anys(anyt anyt) {
        this.f77892a = anyt;
    }

    public final void afterTextChanged(Editable editable) {
        this.f77892a.f77856c.mo42408a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f77892a.f77856c.mo42408a();
    }
}
