package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.internal.AddPermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucd extends uci {

    /* renamed from: f */
    private final AddPermissionRequest f47233f;

    public ucd(ubk ubk, AddPermissionRequest addPermissionRequest, uto uto) {
        super("AddPermissionOperation", ubk, uto, (String) twy.f46852aj.mo58455c(), 48);
        this.f47233f = addPermissionRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        aaal.m21020a(this.f47233f, "Invalid addPermission request.");
        aaal.m21020a(this.f47233f.f30801a, "Invalid addPermission request - No DriveId");
        aaal.m21020a(this.f47233f.f30802b, "Invalid addPermission request - No Permission");
        AddPermissionRequest addPermissionRequest = this.f47233f;
        boolean z = addPermissionRequest.f30805e;
        String str = addPermissionRequest.f30806f;
        this.f47239c.mo28293a(z, str != null, (Integer) null);
        Permission permission = this.f47233f.f30802b;
        this.f47239c.mo28276a(permission.mo18124b(), permission.mo18125c());
        ubk ubk = this.f47237a;
        AddPermissionRequest addPermissionRequest2 = this.f47233f;
        DriveId driveId = addPermissionRequest2.f30801a;
        boolean z2 = addPermissionRequest2.f30803c;
        String str2 = addPermissionRequest2.f30804d;
        vcy vcy = this.f47239c;
        ubk.mo27101h(driveId);
        ujx b = ubk.mo27088b(driveId);
        vcy.mo28287a(b);
        ukc a = ubk.f47144e.mo27403a(b, permission.mo18123a());
        if (a == null || a.mo27648b()) {
            vph.m41009a(ubk.f47143d.f47394a, b, permission.mo18123a(), permission.mo18125c(), -100, permission.mo18124b());
            uey uey = ubk.f47143d;
            if (ubk.f47146g.mo26999a(new txt(uey.f47394a, uey.f47396c, b.mo27551a(), permission, z2, str2, ubk.mo27076a(z, str)), vcy) == 0) {
                this.f47238b.mo27971a();
                return;
            }
            throw new aaaj(8, "Failed to process addPermission request.");
        }
        String valueOf = String.valueOf(permission.mo18123a());
        throw new aaaj(10, valueOf.length() == 0 ? new String("Permission already exists for account identifier:") : "Permission already exists for account identifier:".concat(valueOf));
    }
}
