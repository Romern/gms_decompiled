package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqd implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EnterVerificationCodeChimeraActivity f90653a;

    public atqd(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90653a = enterVerificationCodeChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90653a;
        enterVerificationCodeChimeraActivity.f108809o = false;
        if (!stm.m36302d(charSequence.toString())) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        enterVerificationCodeChimeraActivity.mo59447b(i4);
    }
}
