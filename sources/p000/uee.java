package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.SetResourceParentsRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: uee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uee extends ucg {

    /* renamed from: f */
    private final SetResourceParentsRequest f47340f;

    public uee(ubk ubk, SetResourceParentsRequest setResourceParentsRequest, uto uto) {
        super("SetResourceParentsOperation", ubk, uto, 20);
        this.f47340f = setResourceParentsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47340f, "Invalid set parents request.");
        aaal.m21020a(this.f47340f.f30920a, "Invalid set parents request: no target id provided.");
        aaal.m21020a(this.f47340f.f30921b, "Invalid set parents request: no parent id list provided.");
        ubk ubk = this.f47237a;
        SetResourceParentsRequest setResourceParentsRequest = this.f47340f;
        DriveId driveId = setResourceParentsRequest.f30920a;
        List list = setResourceParentsRequest.f30921b;
        vcy vcy = this.f47239c;
        if (!ubk.mo27091c(driveId)) {
            ujx b = ubk.mo27088b(driveId);
            boolean ai = b.mo27573ai();
            if (ai) {
                ubk.mo27081a(driveId, "Cannot set parents of the App folder.");
            }
            ArrayList arrayList = new ArrayList(list);
            Set a = ubk.f47144e.mo27361a(ubk.f47143d, b);
            arrayList.removeAll(a);
            Set a2 = ubk.mo27075a(driveId, ai, arrayList, b.mo27574aj());
            a.removeAll(list);
            ubk.mo27084a(a);
            HashSet hashSet = new HashSet(list);
            hashSet.addAll(ubk.f47144e.mo27416b(ubk.f47143d, b));
            if (b.mo27640w()) {
                ubk.mo27080a(driveId, hashSet);
            }
            vcy.mo28287a(b);
            ukk a3 = b.mo27551a();
            uey uey = ubk.f47143d;
            if (ubk.f47146g.mo26998a(new tyz(uey.f47394a, uey.f47396c, a3, hashSet, a2, tyq.NORMAL)) == 0) {
                this.f47238b.mo27971a();
                return;
            }
            throw new aaaj(8, "Failed to process update");
        }
        throw new aaaj(10, "Cannot set parents of the root folder.");
    }
}
