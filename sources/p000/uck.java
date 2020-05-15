package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uck extends uch {

    /* renamed from: f */
    private final AuthorizeAccessRequest f47243f;

    public uck(ubk ubk, AuthorizeAccessRequest authorizeAccessRequest, uto uto) {
        super("AuthorizeAccessOperation", ubk, uto);
        this.f47243f = authorizeAccessRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c);
    }

    /* renamed from: d */
    public final void mo27234d(Context context) {
        boolean z;
        aaal.m21020a(this.f47243f, "Invalid authorize access request: no request");
        long j = this.f47243f.f30807a;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        aaal.m21021a(z, "Invalid authorize access request: app id is zero");
        aaal.m21020a(this.f47243f.f30808b, "Invalid authorize access request: no drive id");
        ubk ubk = this.f47237a;
        String l = Long.toString(j);
        DriveId driveId = this.f47243f.f30808b;
        if (!ubk.mo27091c(driveId)) {
            ujx b = ubk.mo27088b(driveId);
            if (b.mo27574aj().contains(DriveSpace.f30734a)) {
                uey uey = ubk.f47143d;
                if (ubk.f47146g.mo26998a(new tyx(uey.f47394a, uey.f47396c, b.mo27551a(), l, ueq.AUTHORIZED, tyq.NORMAL)) != 0) {
                    throw new aaaj(8, "Failed to process authorization");
                }
            } else {
                throw new aaaj(10, "Can only authorize access to resources in the DRIVE space");
            }
        }
        this.f47238b.mo27971a();
    }
}
