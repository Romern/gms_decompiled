package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: ggu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggu extends dcj implements ggw {
    public ggu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
    }

    /* renamed from: a */
    public final void mo11809a(LogAuditRecordsRequest logAuditRecordsRequest, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, logAuditRecordsRequest);
        dcl.m8164a(bj, rnt);
        mo8528b(1, bj);
    }
}
