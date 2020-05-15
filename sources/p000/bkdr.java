package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdr implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ FormEditText f124060a;

    public bkdr(FormEditText formEditText) {
        this.f124060a = formEditText;
    }

    public final void afterTextChanged(Editable editable) {
        FormEditText formEditText = this.f124060a;
        boolean b = formEditText.f152043z.mo65994b(formEditText);
        FormEditText formEditText2 = this.f124060a;
        CharSequence charSequence = formEditText2.f152043z.f124209b;
        if (!b && charSequence != null) {
            formEditText2.setError(charSequence);
        } else if (formEditText2.isFocused() && this.f124060a.mo71938n() > 0 && this.f124060a.getError() != null) {
            this.f124060a.setError(null);
            this.f124060a.f151988H = null;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
