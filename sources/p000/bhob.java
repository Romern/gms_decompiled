package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhob implements bhpm {

    /* renamed from: a */
    final /* synthetic */ bhoh f119183a;

    public bhob(bhoh bhoh) {
        this.f119183a = bhoh;
    }

    /* renamed from: a */
    public final void mo64076a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.f151297a;
        textInputLayout.mo71285e(bhoh.m101234a(editText.getText()));
        textInputLayout.mo71287f(false);
        editText.setOnFocusChangeListener(new bhoa(this));
        editText.removeTextChangedListener(this.f119183a.f119189a);
        editText.addTextChangedListener(this.f119183a.f119189a);
    }
}
