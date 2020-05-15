package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: ucp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucp extends ucg {

    /* renamed from: f */
    private final ChangeResourceParentsRequest f47251f;

    public ucp(ubk ubk, ChangeResourceParentsRequest changeResourceParentsRequest, uto uto) {
        super("ChangeResourceParentsOperation", ubk, uto, 63);
        this.f47251f = changeResourceParentsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47251f, "Invalid change parents request.");
        aaal.m21020a(this.f47251f.f30810a, "Invalid change parents request: no target id provided.");
        aaal.m21020a(this.f47251f.f30811b, "Invalid set parents request: no add parent id list provided.");
        aaal.m21020a(this.f47251f.f30812c, "Invalid set parents request: no remove parent id list provided.");
        ubk ubk = this.f47237a;
        ChangeResourceParentsRequest changeResourceParentsRequest = this.f47251f;
        DriveId driveId = changeResourceParentsRequest.f30810a;
        List list = changeResourceParentsRequest.f30811b;
        List list2 = changeResourceParentsRequest.f30812c;
        vcy vcy = this.f47239c;
        if (!ubk.mo27091c(driveId)) {
            ujx b = ubk.mo27088b(driveId);
            boolean ai = b.mo27573ai();
            if (ai) {
                ubk.mo27081a(driveId, "Cannot set parents of the App folder.");
            }
            Set a = ubk.mo27075a(driveId, ai, list, b.mo27574aj());
            ubk.mo27084a(list2);
            if (b.mo27640w()) {
                ubk.mo27080a(driveId, list);
            }
            vcy.mo28287a(b);
            ukk a2 = b.mo27551a();
            uey uey = ubk.f47143d;
            if (ubk.f47146g.mo26998a(new txz(uey.f47394a, uey.f47396c, a2, new C1225nr(list), new C1225nr(list2), a)) == 0) {
                this.f47238b.mo27971a();
                return;
            }
            throw new aaaj(8, "Failed to process update");
        }
        throw new aaaj(10, "Cannot set parents of the root folder.");
    }
}
