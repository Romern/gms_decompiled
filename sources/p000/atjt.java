package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;
import com.google.android.gms.tapandpay.firstparty.TransmissionFailureUiInfo;

/* renamed from: atjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjt extends atki {
    public atjt(SendTransmissionEventRequest sendTransmissionEventRequest, String str, aswm aswm) {
        super("SendTransmissionEvent", sendTransmissionEventRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49630g(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        TransmissionEvent transmissionEvent = ((SendTransmissionEventRequest) this.f90410b).f108436a;
        int i = transmissionEvent.f108472a;
        TapFailureUiInfo tapFailureUiInfo = null;
        Intent intent = null;
        if (i == 3) {
            intent = atmz.m76204a(context, atna.m76206a(transmissionEvent.f108473b));
        } else if (i == 4) {
            intent = atmz.m76200a(context);
        } else if (i == 5) {
            int i2 = transmissionEvent.f108475d;
            TransmissionFailureUiInfo transmissionFailureUiInfo = transmissionEvent.f108476e;
            if (transmissionFailureUiInfo != null) {
                asot asot = new asot();
                asot.f89316a = transmissionFailureUiInfo.f108477a;
                asot.f89317b = transmissionFailureUiInfo.f108478b;
                asot.f89318c = transmissionFailureUiInfo.f108479c;
                asot.f89319d = transmissionFailureUiInfo.f108480d;
                tapFailureUiInfo = asot.mo49306a();
            }
            intent = atmz.m76202a(context, i2, tapFailureUiInfo);
        } else if (i == 8) {
            intent = atmz.m76205a(context, atna.m76206a(transmissionEvent.f108473b), transmissionEvent.f108474c);
        }
        if (intent == null) {
            this.f90414d.mo49630g(new Status(10));
            return;
        }
        context.startService(intent);
        this.f90414d.mo49630g(Status.f30107a);
    }
}
