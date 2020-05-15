package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ueo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ueo extends ucg {

    /* renamed from: f */
    private final UpdateMetadataRequest f47363f;

    public ueo(ubk ubk, UpdateMetadataRequest updateMetadataRequest, uto uto) {
        super("UpdateMetadataOperation", ubk, uto, 22);
        this.f47363f = updateMetadataRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubk.a(com.google.android.gms.drive.DriveId, boolean):com.google.android.gms.drive.metadata.internal.MetadataBundle
     arg types: [com.google.android.gms.drive.DriveId, int]
     candidates:
      ubk.a(boolean, java.lang.String):uaw
      ubk.a(com.google.android.gms.drive.DriveId, ufx):uga
      ubk.a(uey, com.google.android.gms.drive.DriveId):ujx
      ubk.a(com.google.android.gms.drive.DriveId, java.lang.Iterable):void
      ubk.a(com.google.android.gms.drive.DriveId, java.lang.String):void
      ubk.a(vcy, com.google.android.gms.drive.DriveId):void
      ubk.a(com.google.android.gms.drive.DriveId, boolean):com.google.android.gms.drive.metadata.internal.MetadataBundle */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47363f, "Invalid update request.");
        aaal.m21020a(this.f47363f.f30927a, "Invalid update request.");
        aaal.m21020a(this.f47363f.f30928b, "Invalid update request.");
        MetadataBundle metadataBundle = this.f47363f.f30928b;
        this.f47239c.mo28282a(metadataBundle);
        if (metadataBundle.mo18275c(uzm.f48741Q) || metadataBundle.mo18275c(uzm.f48744c) || metadataBundle.mo18275c(uzm.f48738N) || metadataBundle.mo18275c(uzm.f48750i) || metadataBundle.mo18275c(uzm.f48730F) || metadataBundle.mo18275c(uzm.f48736L)) {
            Date date = new Date();
            metadataBundle.mo18273b(uzp.f48771c, date);
            metadataBundle.mo18273b(uzp.f48772d, date);
        }
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47363f.f30927a;
        vcy vcy = this.f47239c;
        if (ubk.mo27091c(driveId)) {
            throw new aaaj(10, "Cannot edit metadata of the root folder");
        } else if (!metadataBundle.mo18275c(uzm.f48748g) || ubk.mo27097f()) {
            ujx b = ubk.mo27088b(driveId);
            if (b.mo27573ai()) {
                ubk.mo27081a(driveId, "Cannot edit metadata of the App Folder");
            }
            if (!b.mo27524B()) {
                if (!rsr.m34361b(metadataBundle.mo18274c(), ubk.f47138b).isEmpty()) {
                    throw new aaaj(10, "Cannot update the provided metadata fields on a non-editable resource");
                }
            } else if (((Boolean) twy.f46887n.mo58455c()).booleanValue()) {
                if (!metadataBundle.mo18275c(uzp.f48771c)) {
                    metadataBundle.mo18273b(uzp.f48771c, b.mo27525C());
                }
                if (!metadataBundle.mo18275c(uzp.f48772d)) {
                    metadataBundle.mo18273b(uzp.f48772d, b.mo27526D());
                }
            }
            uvx.m39532a(ubk.f47143d, b, metadataBundle);
            vcy.mo28287a(b);
            Boolean bool = (Boolean) metadataBundle.mo18272b(uzm.f48737M);
            ukk a = b.mo27551a();
            uey uey = ubk.f47143d;
            if (ubk.f47146g.mo26998a(new tyn(uey.f47394a, uey.f47396c, a, metadataBundle)) == 0) {
                if (bool != null) {
                    vfq.m40318a(ubk.f47153n, ubk.f47154o, ubk.f47144e, ubk.f47143d, a, !bool.booleanValue() ? uml.UNPINNED : uml.PINNED_ACTIVE);
                }
                this.f47238b.mo27946a(new OnMetadataResponse(ubk.mo27071a(driveId, false)));
                return;
            }
            throw new aaaj(8, "Failed to process update");
        } else {
            throw new aaaj(10, "Field is not modifiable by the app");
        }
    }
}
