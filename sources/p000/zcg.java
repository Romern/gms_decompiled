package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataStatsResult;

/* renamed from: zcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcg extends dcj implements IInterface {
    public zcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IReadStatsCallback");
    }

    /* renamed from: a */
    public final void mo30930a(DataStatsResult dataStatsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataStatsResult);
        mo8530c(1, bj);
    }
}
