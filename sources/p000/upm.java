package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: upm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class upm extends uqi {

    /* renamed from: c */
    private final DriveId f48489c;

    /* renamed from: d */
    private final long f48490d;

    public upm(utr utr, DriveId driveId, long j) {
        super(1, utr);
        sdo.m34959a(driveId);
        this.f48489c = driveId;
        this.f48490d = j;
    }

    /* renamed from: a */
    public static uqi m39205a(utr utr) {
        return new uqi(1, utr);
    }

    /* renamed from: a */
    public final boolean mo27828a(ChangeEvent changeEvent, long j) {
        if (!this.f48489c.equals(changeEvent.f30770a) || j <= this.f48490d) {
            return false;
        }
        this.f48535b.mo27248a(new OnEventResponse(changeEvent));
        return true;
    }
}
