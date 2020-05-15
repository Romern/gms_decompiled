package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmi extends dcj implements abmk {
    public abmi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    }

    /* renamed from: a */
    public final void mo32213a(abmh abmh) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32214a(NetworkQualityReport networkQualityReport) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, networkQualityReport);
        mo8530c(1, bj);
    }
}
