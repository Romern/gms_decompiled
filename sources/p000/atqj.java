package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.NameResolutionChimeraActivity;

/* renamed from: atqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqj implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ NameResolutionChimeraActivity f90668a;

    public atqj(NameResolutionChimeraActivity nameResolutionChimeraActivity) {
        this.f90668a = nameResolutionChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() == 0) {
            this.f90668a.f108822b.mo71266b(true);
            NameResolutionChimeraActivity nameResolutionChimeraActivity = this.f90668a;
            nameResolutionChimeraActivity.f108822b.mo71272c(nameResolutionChimeraActivity.getString(C0126R.string.tp_card_holder_error_text));
        }
        if (charSequence.length() > 0) {
            this.f90668a.f108822b.mo71272c((CharSequence) null);
            this.f90668a.f108822b.mo71266b(false);
        }
    }
}
