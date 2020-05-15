package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;

/* renamed from: atqt */
public final /* synthetic */ class atqt implements View.OnClickListener {

    /* renamed from: a */
    private final SelectVerificationMethodChimeraActivity f90688a;

    public atqt(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity) {
        this.f90688a = selectVerificationMethodChimeraActivity;
    }

    public void onClick(View view) {
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = this.f90688a;
        if (selectVerificationMethodChimeraActivity.f108866g == null) {
            selectVerificationMethodChimeraActivity.setResult(0);
            selectVerificationMethodChimeraActivity.finish();
            return;
        }
        selectVerificationMethodChimeraActivity.mo59465b(false);
    }
}
