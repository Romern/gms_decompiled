package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atqa */
public final /* synthetic */ class atqa implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90650a;

    public atqa(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90650a = enterVerificationCodeChimeraActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90650a;
        if (i != 6) {
            return false;
        }
        enterVerificationCodeChimeraActivity.mo59444a(textView.getText().toString());
        return true;
    }
}
