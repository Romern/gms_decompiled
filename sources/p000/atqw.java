package p000;

import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;
import com.google.android.gms.tapandpay.tokenization.VerificationMethodView;

/* renamed from: atqw */
public final /* synthetic */ class atqw implements View.OnClickListener {

    /* renamed from: a */
    private final SelectVerificationMethodChimeraActivity f90693a;

    /* renamed from: b */
    private final VerificationMethodView f90694b;

    public atqw(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity, VerificationMethodView verificationMethodView) {
        this.f90693a = selectVerificationMethodChimeraActivity;
        this.f90694b = verificationMethodView;
    }

    public void onClick(View view) {
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = this.f90693a;
        VerificationMethodView verificationMethodView = this.f90694b;
        if (view instanceof VerificationMethodView) {
            selectVerificationMethodChimeraActivity.mo59457a((CompoundButton) verificationMethodView.findViewById(C0126R.C0129id.RadioButton));
        }
    }
}
