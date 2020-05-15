package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.ListParentsRequest;
import com.google.android.gms.drive.internal.OnListParentsResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udp extends ucg {

    /* renamed from: f */
    private static final sbw f47303f = new sbw("ListParentsOperation", "");

    /* renamed from: g */
    private final ListParentsRequest f47304g;

    public udp(ubk ubk, ListParentsRequest listParentsRequest, uto uto) {
        super("ListParentsOperation", ubk, uto, 12);
        this.f47304g = listParentsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47304g, "Invalid getParents request: request must be provided");
        aaal.m21020a(this.f47304g.f30862a, "Invalid getParents request: DriveId must be provided");
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47304g.f30862a;
        vcy vcy = this.f47239c;
        ujx b = ubk.mo27088b(driveId);
        vcy.mo28287a(b);
        uhn uhn = ubk.f47144e;
        ugz ugz = (ugz) uhn;
        vpe a = ugz.mo27409a(ubk.f47143d, DriveSpace.f30737d, voz.m40960a(b.mo27613h()), null, bnon.f131923a, false, ubk.mo27105l(), false);
        uyu.m39798a(a.f49703a, ubk.f47150k);
        OnListParentsResponse onListParentsResponse = new OnListParentsResponse(a.f49703a);
        try {
            this.f47238b.mo27952a(onListParentsResponse);
            if (!onListParentsResponse.f30754a) {
                return;
            }
        } catch (RemoteException e) {
            spn.m35858a(e);
            f47303f.mo25372b("ListParentsOperation", "Cannot pass complete response over binder!");
            mo6503a(Status.f30109c);
        } catch (Throwable th) {
            a.mo28719a();
            throw th;
        }
        a.mo28719a();
    }
}
