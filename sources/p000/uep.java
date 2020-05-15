package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.UpdatePermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uep extends uci {

    /* renamed from: f */
    private final UpdatePermissionRequest f47364f;

    public uep(ubk ubk, UpdatePermissionRequest updatePermissionRequest, uto uto) {
        super("UpdatePermissionOperation", ubk, uto, (String) twy.f46852aj.mo58455c(), 49);
        this.f47364f = updatePermissionRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        boolean z;
        ujx ujx;
        aaal.m21020a(this.f47364f, "Invalid updatePermission request.");
        aaal.m21020a(this.f47364f.f30929a, "Invalid updatePermission request - No DriveId");
        UpdatePermissionRequest updatePermissionRequest = this.f47364f;
        boolean z2 = updatePermissionRequest.f30932d;
        String str = updatePermissionRequest.f30933e;
        vcy vcy = this.f47239c;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        vcy.mo28293a(z2, z, (Integer) null);
        ubk ubk = this.f47237a;
        UpdatePermissionRequest updatePermissionRequest2 = this.f47364f;
        DriveId driveId = updatePermissionRequest2.f30929a;
        String str2 = updatePermissionRequest2.f30930b;
        int i = updatePermissionRequest2.f30931c;
        vcy vcy2 = this.f47239c;
        ubk.mo27101h(driveId);
        ujx b = ubk.mo27088b(driveId);
        vcy2.mo28287a(b);
        ukc a = ubk.f47144e.mo27403a(b, str2);
        if (a == null) {
            ujx g = ubk.mo27098g(driveId);
            a = ubk.f47144e.mo27403a(g, str2);
            ujx = g;
        } else {
            ujx = b;
        }
        if (a == null || a.mo27648b()) {
            throw new aaaj(10, "The permission to update doesn't exist.");
        }
        vcy2.mo28276a(a.f47845d, i);
        vph.m41009a(ubk.f47143d.f47394a, ujx, str2, i, a.f47847f, a.f47845d);
        uey uey = ubk.f47143d;
        int a2 = ubk.f47146g.mo26999a(new tzt(uey.f47394a, uey.f47396c, ujx.mo27551a(), str2, i, ubk.mo27076a(z2, str)), vcy2);
        if (a2 == 0) {
            this.f47238b.mo27971a();
        } else if (a2 != 6) {
            throw new aaaj(8, "Failed to process updatePermission request.");
        } else {
            throw new aaaj(10, "The permission to update doesn't exist.");
        }
    }
}
