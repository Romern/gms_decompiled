package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DailyTotalResult;

/* renamed from: zaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zaw extends dcj implements IInterface {
    public zaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDailyTotalCallback");
    }

    /* renamed from: a */
    public final void mo30898a(DailyTotalResult dailyTotalResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dailyTotalResult);
        mo8530c(1, bj);
    }
}
