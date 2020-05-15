package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.FetchThumbnailRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udd extends uch {

    /* renamed from: g */
    private static final sbw f47290g = new sbw("FetchThumbnailOperation", "");

    /* renamed from: f */
    public final FetchThumbnailRequest f47291f;

    public udd(ubk ubk, FetchThumbnailRequest fetchThumbnailRequest, uto uto) {
        super("FetchThumbnailOperation", ubk, uto, 39, null);
        this.f47291f = fetchThumbnailRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27244b(Status status) {
        vcv g = this.f47239c.mo28306g();
        g.mo28257b(status.f30115i);
        try {
            this.f47238b.mo27107a(status);
        } catch (RemoteException e) {
            g.mo28256b();
            f47290g.mo25378c("FetchThumbnailOperation", "Error notifying client.", e);
        }
        g.mo28254a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhn.a(ujx, boolean):java.lang.String
     arg types: [ujx, int]
     candidates:
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(ujx, boolean):java.lang.String */
    /* renamed from: d */
    public final void mo27234d(Context context) {
        uga uga;
        aaal.m21020a(this.f47291f, "Invalid fetch thumbnail request: no request");
        aaal.m21020a(this.f47291f.f30847a, "Invalid fetch thumbnail request: no id");
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47291f.f30847a;
        C1595udc udc = new C1595udc(this);
        ujx b = ubk.mo27088b(driveId);
        vfb a = ubk.f47142c.f49745D.mo28380a();
        ufu ufu = ubk.f47145f;
        uey a2 = uey.m38255a(ubk.f47143d.f47394a);
        if (ufu.f47477g.mo27390a(b, false) != null) {
            ufu.f47470a.mo25368a("ContentDownloadManager", "Up-to-date thumbnail is already available locally: %s", b.mo27551a());
            uga = new uga(3);
        } else if (b.mo27566ab()) {
            uga = new uga(5);
        } else if (!b.mo27545W()) {
            uga = new uga(5);
        } else {
            uga = ufu.f47476f.mo27301a(b.mo27551a(), new ufp(ufu, a2, b, a));
        }
        uga.mo27306a(udc);
    }
}
