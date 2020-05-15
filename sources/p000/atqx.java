package p000;

import android.widget.CompoundButton;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;

/* renamed from: atqx */
public final /* synthetic */ class atqx implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final SelectVerificationMethodChimeraActivity f90695a;

    public atqx(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity) {
        this.f90695a = selectVerificationMethodChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = this.f90695a;
        if (z) {
            selectVerificationMethodChimeraActivity.mo59457a(compoundButton);
        }
    }
}
