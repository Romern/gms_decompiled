package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.RemovePermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udy extends uci {

    /* renamed from: f */
    private final RemovePermissionRequest f47333f;

    public udy(ubk ubk, RemovePermissionRequest removePermissionRequest, uto uto) {
        super("RemovePermissionOperation", ubk, uto, (String) twy.f46852aj.mo58455c(), 50);
        this.f47333f = removePermissionRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        boolean z;
        ujx ujx;
        aaal.m21020a(this.f47333f, "Invalid removePermission request.");
        aaal.m21020a(this.f47333f.f30914a, "Invalid removePermission request - No DriveId");
        RemovePermissionRequest removePermissionRequest = this.f47333f;
        boolean z2 = removePermissionRequest.f30916c;
        String str = removePermissionRequest.f30917d;
        vcy vcy = this.f47239c;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        vcy.mo28293a(z2, z, (Integer) null);
        ubk ubk = this.f47237a;
        RemovePermissionRequest removePermissionRequest2 = this.f47333f;
        DriveId driveId = removePermissionRequest2.f30914a;
        String str2 = removePermissionRequest2.f30915b;
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
            throw new aaaj(10, "The permission to remove doesn't exist.");
        }
        vcy2.mo28276a(a.f47845d, -100);
        vph.m41009a(ubk.f47143d.f47394a, ujx, str2, -100, a.f47847f, a.f47845d);
        uey uey = ubk.f47143d;
        int a2 = ubk.f47146g.mo26999a(new tyt(uey.f47394a, uey.f47396c, ujx.mo27551a(), str2, ubk.mo27076a(z2, str)), vcy2);
        if (a2 == 0) {
            this.f47238b.mo27971a();
        } else if (a2 != 6) {
            throw new aaaj(8, "Failed to process removePermission request.");
        } else {
            throw new aaaj(10, "The permission to remove doesn't exist.");
        }
    }
}
