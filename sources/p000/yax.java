package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: yax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yax extends dcj implements IInterface {
    public yax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks");
    }

    /* renamed from: a */
    public final void mo30334a(Status status, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, pendingIntent);
        mo8530c(1, bj);
    }
}
