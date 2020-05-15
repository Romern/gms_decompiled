package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;

/* renamed from: atjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjm extends atki {
    public atjm(ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest, String str, aswm aswm) {
        super("ReportInAppTransactionCompleted", reportInAppTransactionCompletedRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        atxn.m76509d(context, new Intent("com.google.android.gms.IN_APP_TRANSACTION_ACTION"));
        atkm atkm = new atkm(context);
        synchronized (atkm.f90419b) {
            atkm.f90420c.edit().putInt("inapp_transactions_since_last_unlock", atkm.f90420c.getInt("inapp_transactions_since_last_unlock", 0) + 1).apply();
        }
        this.f90414d.mo49632i(Status.f30107a);
    }
}
