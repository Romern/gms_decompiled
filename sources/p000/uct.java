package p000;

import android.content.Context;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uct extends ucg {

    /* renamed from: f */
    private final ubq f47272f;

    /* renamed from: g */
    private final ufe f47273g;

    /* renamed from: h */
    private final uhn f47274h;

    /* renamed from: i */
    private final vfp f47275i;

    /* renamed from: j */
    private final CloseContentsAndUpdateMetadataRequest f47276j;

    public uct(ubk ubk, ubq ubq, ufe ufe, uhn uhn, vfp vfp, CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, uto uto) {
        super("CommitContentsOperation", ubk, uto, 2);
        this.f47272f = ubq;
        this.f47273g = ufe;
        this.f47274h = uhn;
        this.f47275i = vfp;
        this.f47276j = closeContentsAndUpdateMetadataRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void
     arg types: [uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, int, uaw]
     candidates:
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, com.google.android.gms.drive.DriveId, uaw):com.google.android.gms.drive.DriveId
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        int i;
        boolean z;
        boolean z2;
        aaal.m21020a(this.f47276j, "Invalid close request: no request");
        if (!this.f47237a.mo27097f() && !this.f47276j.f30822i) {
            throw new aaaj(10, "Invalid file update options");
        }
        CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest = this.f47276j;
        DriveId driveId = closeContentsAndUpdateMetadataRequest.f30814a;
        MetadataBundle metadataBundle = closeContentsAndUpdateMetadataRequest.f30815b;
        Contents contents = closeContentsAndUpdateMetadataRequest.f30816c;
        if (contents != null) {
            int i2 = contents.f30721b;
            z = contents.f30724e;
            srz.m36170a(contents.f30720a);
            i = i2;
        } else {
            int i3 = closeContentsAndUpdateMetadataRequest.f30820g;
            z = closeContentsAndUpdateMetadataRequest.f30821h;
            i = i3;
        }
        boolean z3 = true;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        aaal.m21021a(z2, "Invalid close request: no contents");
        aaal.m21020a(driveId, "Invalid close request: no DriveId");
        aaal.m21020a(metadataBundle, "Invalid close request: no metadata");
        CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest2 = this.f47276j;
        String str = closeContentsAndUpdateMetadataRequest2.f30818e;
        boolean z4 = closeContentsAndUpdateMetadataRequest2.f30817d;
        ujx b = this.f47237a.mo27088b(driveId);
        if (!b.mo27524B() || driveId.equals(this.f47237a.mo27087b())) {
            throw new aaaj(10, "The user cannot edit the resource.");
        }
        uey b2 = mo27233b();
        uvx.m39532a(b2, b, metadataBundle);
        if (this.f47272f.mo27160a(b2, i) <= this.f47274h.mo27418b(b2.f47394a.f47682a).f47688c) {
            int i4 = this.f47276j.f30819f;
            aaal.m21021a(twv.m37575b(i4), "Invalid commitStrategy.");
            if (twv.m37573a(i4)) {
                aaal.m21021a(z, "Invalid close request: contents not valid for conflict detection");
                if (str != null) {
                    aaal.m21021a(twv.m37574a(str), "Invalid tracking tag");
                }
            }
            boolean z5 = this.f47276j.f30822i;
            vcy vcy = this.f47239c;
            vcy.mo28287a(b);
            if (str == null) {
                z3 = false;
            }
            vcy.mo28293a(z4, z3, Integer.valueOf(i4));
            vcy.mo28282a(metadataBundle);
            Date date = new Date();
            metadataBundle.mo18273b(uzp.f48771c, date);
            metadataBundle.mo18273b(uzp.f48772d, date);
            Boolean bool = (Boolean) metadataBundle.mo18272b(uzm.f48737M);
            this.f47272f.mo27167a(b2, i, metadataBundle, true, uaw.m37852a(i4, z4, this.f47237a.mo27093d(), str, this.f47237a.mo27100h(), z5));
            if (bool != null) {
                vfq.m40318a(this.f47275i, this.f47273g, this.f47274h, b2, b.mo27551a(), !bool.booleanValue() ? uml.UNPINNED : uml.PINNED_ACTIVE);
            }
            this.f47238b.mo27971a();
            return;
        }
        throw new aaaj(1508, "Contents too large to commit");
    }
}
