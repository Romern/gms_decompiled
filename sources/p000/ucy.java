package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucy extends ucg {

    /* renamed from: f */
    private final CreateFolderRequest f47284f;

    public ucy(ubk ubk, CreateFolderRequest createFolderRequest, uto uto) {
        super("CreateFolderOperation", ubk, uto, 6);
        this.f47284f = createFolderRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uvx.a(uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean):void
     arg types: [uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, int]
     candidates:
      uvx.a(java.lang.String, java.lang.String, int):void
      uvx.a(java.lang.String, java.lang.String, java.lang.String):void
      uvx.a(java.lang.String, ujx, com.google.android.gms.drive.metadata.internal.MetadataBundle):void
      uvx.a(uey, ujx, com.google.android.gms.drive.metadata.internal.MetadataBundle):void
      uvx.a(uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean):void */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        int i;
        aaal.m21020a(this.f47284f, "Invalid create request: no request");
        CreateFolderRequest createFolderRequest = this.f47284f;
        DriveId driveId = createFolderRequest.f30843a;
        MetadataBundle metadataBundle = createFolderRequest.f30844b;
        aaal.m21020a(driveId, "Invalid create request: no parent");
        aaal.m21020a(metadataBundle, "Invalid create request: no metadata");
        boolean a = this.f47237a.mo27086a(driveId);
        vcy vcy = this.f47239c;
        vcy.mo28292a(a, "application/vnd.google-apps.folder");
        vcy.mo28282a(metadataBundle);
        Date date = new Date();
        metadataBundle.mo18273b(uzp.f48771c, date);
        metadataBundle.mo18273b(uzp.f48772d, date);
        metadataBundle.mo18273b(uzp.f48769a, date);
        ubk ubk = this.f47237a;
        DriveId e = ubk.mo27094e(driveId);
        uvx.m39531a(ubk.f47143d, metadataBundle, true);
        if (uvw.m39525a(metadataBundle)) {
            uhn uhn = ubk.f47144e;
            uey uey = ubk.f47143d;
            uvw.m39524a(uhn, uey.f47394a, e, metadataBundle, uey.f47395b);
        }
        uey uey2 = ubk.f47143d;
        tyf tyf = new tyf(uey2.f47394a, uey2.f47396c, metadataBundle, e);
        int a2 = ubk.f47146g.mo26998a(tyf);
        if (a2 == 0) {
            this.f47238b.mo27945a(new OnDriveIdResponse(tyf.f46921g));
            return;
        }
        if (a2 != 3) {
            i = a2 == 4 ? 1501 : 8;
        } else {
            i = 1502;
        }
        throw new aaaj(i, "Failed to create folder.");
    }
}
