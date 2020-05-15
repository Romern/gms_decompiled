package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.tokenization.SelectOtherPaymentMethodChimeraActivity;

/* renamed from: atql */
public final /* synthetic */ class atql implements View.OnClickListener {

    /* renamed from: a */
    private final SelectOtherPaymentMethodChimeraActivity f90671a;

    public atql(SelectOtherPaymentMethodChimeraActivity selectOtherPaymentMethodChimeraActivity) {
        this.f90671a = selectOtherPaymentMethodChimeraActivity;
    }

    public void onClick(View view) {
        SelectOtherPaymentMethodChimeraActivity selectOtherPaymentMethodChimeraActivity = this.f90671a;
        rjx.m33697b((Activity) selectOtherPaymentMethodChimeraActivity).mo24718a(selectOtherPaymentMethodChimeraActivity.getContainerActivity(), 1100, selectOtherPaymentMethodChimeraActivity.f108827b);
        selectOtherPaymentMethodChimeraActivity.mo59452a(3);
    }
}
