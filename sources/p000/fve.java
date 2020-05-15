package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: fve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fve extends dcj implements IInterface {
    public fve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.internal.IAppInviteInternalCallbacks");
    }

    /* renamed from: a */
    public final void mo11391a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeStringList(list);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo11392b(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeList(list);
        mo8530c(2, bj);
    }
}
