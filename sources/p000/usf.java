package p000;

import com.google.android.gms.drive.DriveId;

@Deprecated
/* renamed from: usf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class usf implements two {
    /* renamed from: a */
    public static final utb m39302a(usn usn, vmc vmc) {
        utb utb = new utb(usn.f43949s, usn.f43948r, vmc);
        utb.f48627b.add(3);
        return utb;
    }

    /* renamed from: a */
    public final usx mo26842a(rkb rkb) {
        usn usn = (usn) rkb.mo24786a(twn.f46760f);
        if (usn.f48602b) {
            DriveId driveId = usn.f48601a;
            if (driveId != null) {
                return new usx(driveId);
            }
            return null;
        }
        throw new IllegalStateException("Client is not yet connected");
    }

    /* renamed from: a */
    public final usx mo26843a(rkb rkb, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (rkb.mo24805i()) {
            return new usx(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }
}
