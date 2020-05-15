package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avkh extends dcj implements avkj {
    public avkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.ISystemUpdateStatusCallback");
    }

    /* renamed from: a */
    public final void mo51332a(SystemUpdateStatus systemUpdateStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, systemUpdateStatus);
        mo8530c(1, bj);
    }
}
