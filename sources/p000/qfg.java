package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: qfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfg extends dcj implements qfi {
    public qfg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
    }

    /* renamed from: a */
    public final void mo24012a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(5, bj);
    }
}
