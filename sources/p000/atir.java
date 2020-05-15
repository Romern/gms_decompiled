package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;

/* renamed from: atir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atir extends atki {
    public atir(GetActiveAccountRequest getActiveAccountRequest, String str, aswm aswm) {
        super("GetActiveAccount", getActiveAccountRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49251a(status, new GetActiveAccountResponse(null));
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (cgwn.m147265o()) {
            astb.m74740b(SystemClock.elapsedRealtime(), cgxx.f188011a.mo6606a().mo84713a());
        } else {
            astb.m74736a(SystemClock.elapsedRealtime() + 30000);
        }
        this.f90414d.mo49251a(Status.f30107a, new GetActiveAccountResponse(asix.m74201b(context, askc.m74272b())));
    }
}
