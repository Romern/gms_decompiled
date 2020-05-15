package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.EnablePayOnWearRequest;

/* renamed from: atip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atip extends atki {
    public atip(EnablePayOnWearRequest enablePayOnWearRequest, String str, aswm aswm) {
        super("EnablePayOnWear", enablePayOnWearRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49633j(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (cgwn.m147265o()) {
            astb.m74740b(SystemClock.elapsedRealtime(), ((EnablePayOnWearRequest) this.f90410b).f108526a);
        } else {
            astb.m74736a(SystemClock.elapsedRealtime() + ((EnablePayOnWearRequest) this.f90410b).f108526a);
        }
        this.f90414d.mo49633j(Status.f30107a);
    }
}
