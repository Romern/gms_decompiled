package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;

/* renamed from: bkbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkbi extends bkgj implements bkce {

    /* renamed from: a */
    private final FormEditText f123940a;

    /* renamed from: e */
    private final CreditCardNumberEditText f123941e;

    /* renamed from: f */
    private final int f123942f;

    /* renamed from: g */
    private final int f123943g;

    public bkbi(FormEditText formEditText, int i) {
        this.f123940a = formEditText;
        this.f123941e = null;
        this.f123942f = i;
        this.f123943g = i;
    }

    /* renamed from: c */
    private final boolean m105228c() {
        if (!TextUtils.isEmpty(this.f123940a.getText())) {
            if (this.f123942f != -1) {
                return this.f123940a.getText().length() == this.f123942f;
            }
            bmhu h = this.f123941e.mo66002h();
            return h != null && this.f123940a.getText().length() == h.f129494d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText()) || m105228c()) {
            this.f124209b = null;
            return true;
        }
        this.f124209b = textView.getContext().getString(C0126R.string.wallet_uic_error_cvc_invalid);
        return false;
    }

    /* renamed from: cO */
    public final boolean mo65775cO() {
        return m105228c() || this.f123940a.getText().length() == this.f123943g;
    }

    public bkbi(FormEditText formEditText, CreditCardNumberEditText creditCardNumberEditText) {
        this.f123940a = formEditText;
        this.f123941e = creditCardNumberEditText;
        this.f123942f = -1;
        this.f123943g = 4;
    }
}
