package p000;

import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdu extends InputConnectionWrapper {

    /* renamed from: a */
    final /* synthetic */ FormEditText f124066a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkdu(FormEditText formEditText, InputConnection inputConnection) {
        super(inputConnection, true);
        this.f124066a = formEditText;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        FormEditText formEditText = this.f124066a;
        formEditText.f151988H = formEditText.getError();
        boolean commitText = super.commitText(charSequence, i);
        FormEditText formEditText2 = this.f124066a;
        CharSequence charSequence2 = formEditText2.f151988H;
        if (charSequence2 != null) {
            formEditText2.setError(charSequence2);
        }
        return commitText;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        View focusSearch;
        FormEditText formEditText = this.f124066a;
        int i3 = FormEditText.f151980ao;
        if (formEditText.f151987G && i == 1 && i2 == 0 && formEditText.mo71938n() == 0 && ((!bjvb.m104683a(this.f124066a.getContext()) || this.f124066a.f151982B.mo65799cM()) && (focusSearch = this.f124066a.focusSearch(1)) != null)) {
            focusSearch.requestFocus();
        }
        return super.deleteSurroundingText(i, i2);
    }
}
