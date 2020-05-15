package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: fvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvd extends dcj implements IInterface {
    public fvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
    }

    /* renamed from: a */
    public final void mo11389a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo11390a(Status status, Intent intent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, intent);
        mo8528b(2, bj);
    }
}
