package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: tti */
final /* synthetic */ class tti implements Runnable {

    /* renamed from: a */
    private final ttp f46635a;

    /* renamed from: b */
    private final String f46636b;

    public tti(ttp ttp, String str) {
        this.f46635a = ttp;
        this.f46636b = str;
    }

    public final void run() {
        ttp ttp = this.f46635a;
        if (!ttp.f46649b.getText().toString().equals(this.f46636b)) {
            ttp.f46652e = tto.WAS_EDITED;
        }
        if (ttp.f46649b.getText().toString().isEmpty()) {
            ((TextInputLayout) ttp.getView().findViewById(C0126R.C0129id.password_edit_textinputlayout)).mo71272c(ttp.getResources().getText(C0126R.string.pwm_password_empty_error));
        } else {
            ((TextInputLayout) ttp.getView().findViewById(C0126R.C0129id.password_edit_textinputlayout)).mo71272c((CharSequence) null);
        }
        ttp.mo26796e();
    }
}
