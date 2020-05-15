package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.CheckInResponse;

/* renamed from: avxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxe extends dcj implements avxg {
    public avxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.IReportCheckInCallback");
    }

    /* renamed from: a */
    public final void mo51684a(Status status, CheckInResponse checkInResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, checkInResponse);
        mo8530c(1, bj);
    }
}
