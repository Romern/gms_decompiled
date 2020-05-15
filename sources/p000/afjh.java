package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;

/* renamed from: afjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afjh extends dcj implements afjj {
    public afjh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    /* renamed from: a */
    public final void mo34903a(Status status, FileGroupResponse fileGroupResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, fileGroupResponse);
        mo8530c(1, bj);
    }
}
