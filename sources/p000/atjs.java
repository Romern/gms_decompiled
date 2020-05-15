package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.TapEvent;
import com.google.android.gms.tapandpay.internal.firstparty.SendTapEventRequest;

/* renamed from: atjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjs extends atki {
    public atjs(SendTapEventRequest sendTapEventRequest, String str, aswm aswm) {
        super("SendTapEvent", sendTapEventRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49630g(status);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atmz.a(android.content.Context, com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):android.content.Intent
     arg types: [android.content.Context, com.google.android.gms.tapandpay.firstparty.ValuableInfo[], int]
     candidates:
      atmz.a(android.content.Context, int, com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo):android.content.Intent
      atmz.a(android.content.Context, com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):android.content.Intent */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        Intent intent;
        TapEvent tapEvent = ((SendTapEventRequest) this.f90410b).f108551a;
        int i = tapEvent.f108438a;
        if (i == 3) {
            intent = atmz.m76204a(context, tapEvent.f108440c);
        } else if (i == 4) {
            intent = atmz.m76200a(context);
        } else if (i == 5) {
            intent = atmz.m76202a(context, tapEvent.f108439b, tapEvent.f108441d);
        } else if (i == 8) {
            intent = atmz.m76205a(context, tapEvent.f108440c, false);
        } else {
            throw new aaaj(13, "Illegal tap event type");
        }
        context.startService(intent);
        this.f90414d.mo49630g(Status.f30107a);
    }
}
