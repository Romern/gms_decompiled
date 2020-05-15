package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* renamed from: bhol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhol implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bhou f119198a;

    public bhol(bhou bhou) {
        this.f119198a = bhou;
    }

    public final void afterTextChanged(Editable editable) {
        bhou bhou = this.f119198a;
        AutoCompleteTextView a = bhou.mo64096a(bhou.f119220k.f151297a);
        a.post(new bhok(this, a));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
