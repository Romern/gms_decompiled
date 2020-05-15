package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.analytics.CreditCardEntryAction;

/* renamed from: bkar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkar implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ bkas f123855a;

    public bkar(bkas bkas) {
        this.f123855a = bkas;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        bkas bkas = this.f123855a;
        CreditCardEntryAction creditCardEntryAction = bkas.f123894u;
        if (creditCardEntryAction.f151725b != 1) {
            creditCardEntryAction.f151725b = 1;
            bkas.mo65755x();
        }
    }
}
