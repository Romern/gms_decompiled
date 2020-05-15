package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: ggv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ggv extends dck implements ggw {
    public ggv() {
        super("com.google.android.gms.audit.internal.IAuditService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        if (i != 1) {
            return false;
        }
        LogAuditRecordsRequest logAuditRecordsRequest = (LogAuditRecordsRequest) dcl.m8163a(parcel, LogAuditRecordsRequest.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
        } else {
            rnt = null;
        }
        mo11809a(logAuditRecordsRequest, rnt);
        parcel2.writeNoException();
        return true;
    }
}
