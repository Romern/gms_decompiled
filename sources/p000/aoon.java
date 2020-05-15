package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: aoon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoon extends aaab {

    /* renamed from: a */
    private final aooh f78606a;

    public aoon(aooh aooh) {
        super(38, "GetLastResetWallTimeMs");
        sdo.m34959a(aooh);
        this.f78606a = aooh;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        aooh aooh = this.f78606a;
        Status status = Status.f30107a;
        synchronized ("PseudonymousIdService") {
            j = context.getSharedPreferences("PseudonymousIdIntentService", 0).getLong("wallTimeMillisLastPseudonymousIdReset", 0);
        }
        aooh.mo43123a(status, j);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f78606a.mo43123a(status, 0);
    }
}
