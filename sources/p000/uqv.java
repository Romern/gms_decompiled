package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: uqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqv extends uqi {

    /* renamed from: c */
    public final DriveId f48569c;

    /* renamed from: d */
    public final int f48570d;

    public uqv(utr utr, DriveId driveId, TransferProgressOptions transferProgressOptions) {
        super(8, utr);
        sdo.m34959a(driveId);
        this.f48569c = driveId;
        this.f48570d = transferProgressOptions.f30788a;
    }

    /* renamed from: a */
    public static uqi m39279a(utr utr) {
        return new uqi(8, utr);
    }

    /* renamed from: a */
    public final boolean mo27897a(TransferProgressEvent transferProgressEvent) {
        if (this.f48534a != 8 || !this.f48569c.equals(transferProgressEvent.f30787a.f30792b) || this.f48570d != transferProgressEvent.f30787a.f30791a) {
            return false;
        }
        this.f48535b.mo27248a(new OnEventResponse(transferProgressEvent));
        return true;
    }
}
