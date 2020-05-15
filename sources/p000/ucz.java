package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.DeleteResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucz extends ucg {

    /* renamed from: f */
    private final DeleteResourceRequest f47285f;

    public ucz(ubk ubk, DeleteResourceRequest deleteResourceRequest, uto uto) {
        super("DeleteResourceOperation", ubk, uto, 7);
        this.f47285f = deleteResourceRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47285f, "Invalid delete request.");
        aaal.m21020a(this.f47285f.f30845a, "Invalid delete request.");
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47285f.f30845a;
        vcy vcy = this.f47239c;
        if (!ubk.mo27091c(driveId)) {
            ujx b = ubk.mo27088b(driveId);
            if (b.mo27573ai()) {
                try {
                    DriveId c = ubk.mo27090c();
                    if (c == null) {
                        throw new aaaj(10, "Check that your app has access to the App Folder.");
                    } else if (c.equals(driveId)) {
                        throw new aaaj(10, "Cannot delete App Folder");
                    }
                } catch (gid e) {
                    throw ubk.mo27106n();
                }
            }
            if (b.mo27621j()) {
                vcy.mo28287a(b);
                ukk a = b.mo27551a();
                uey uey = ubk.f47143d;
                int a2 = ubk.f47146g.mo26999a(new tyk(uey.f47394a, uey.f47396c, a), vcy);
                if (a2 == 0) {
                    this.f47238b.mo27971a();
                } else if (a2 != 5) {
                    throw new aaaj(8, "Failed to delete resource.");
                } else {
                    throw new aaaj(10, "App has no access to a descendant of the folder to be deleted.");
                }
            } else {
                throw new aaaj(10, "Cannot delete resources that the user does not own.");
            }
        } else {
            throw new aaaj(10, "Cannot delete root folder");
        }
    }
}
