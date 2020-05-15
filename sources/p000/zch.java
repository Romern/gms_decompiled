package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionReadResult;

/* renamed from: zch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zch extends dcj implements IInterface {
    public zch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ISessionReadCallback");
    }

    /* renamed from: a */
    public final void mo30931a(SessionReadResult sessionReadResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionReadResult);
        mo8530c(1, bj);
    }
}
