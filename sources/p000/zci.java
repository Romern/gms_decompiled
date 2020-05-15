package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionStopResult;

/* renamed from: zci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zci extends dcj implements IInterface {
    public zci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ISessionStopCallback");
    }

    /* renamed from: a */
    public final void mo30932a(SessionStopResult sessionStopResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionStopResult);
        mo8530c(1, bj);
    }
}
