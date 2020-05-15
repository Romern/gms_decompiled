package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetLastAttestationResultResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetLastAttestationResultRequest;

/* renamed from: atiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atiz extends atki {
    public atiz(GetLastAttestationResultRequest getLastAttestationResultRequest, String str, aswm aswm) {
        super("GetLastAttestationResult", getLastAttestationResultRequest, str, aswm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        atkm atkm = new atkm(context);
        long j = atkm.f90420c.getLong("last_attestation_result_time", 0);
        int i = 1;
        if (j == 0) {
            i = 0;
        } else if (!atkm.f90420c.getBoolean("last_attestation_result", true)) {
            i = 2;
        }
        this.f90414d.mo49248a(Status.f30107a, new GetLastAttestationResultResponse(i, j));
    }
}
