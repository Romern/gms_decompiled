package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.CheckInResponse;

/* renamed from: avxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxf extends dck implements avxg {

    /* renamed from: a */
    private final rnt f94057a;

    public avxf() {
        super("com.google.android.gms.userlocation.internal.IReportCheckInCallback");
    }

    /* renamed from: a */
    public final void mo51684a(Status status, CheckInResponse checkInResponse) {
        this.f94057a.mo11797a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo51684a((Status) dcl.m8163a(parcel, Status.CREATOR), (CheckInResponse) dcl.m8163a(parcel, CheckInResponse.CREATOR));
        return true;
    }

    public avxf(rnt rnt) {
        super("com.google.android.gms.userlocation.internal.IReportCheckInCallback");
        this.f94057a = rnt;
    }
}
