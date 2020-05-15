package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhph implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f119262a;

    public bhph(TextInputLayout textInputLayout) {
        this.f119262a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f119262a;
        textInputLayout.mo71260a(!textInputLayout.f151345s);
        TextInputLayout textInputLayout2 = this.f119262a;
        if (textInputLayout2.f151329c) {
            textInputLayout2.mo71251a(editable.length());
        }
        TextInputLayout textInputLayout3 = this.f119262a;
        if (textInputLayout3.f151333g) {
            textInputLayout3.mo71262b(editable.length());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
