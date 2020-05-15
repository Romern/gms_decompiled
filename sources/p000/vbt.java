package p000;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.gms.drive.DriveId;
import java.util.HashSet;

/* renamed from: vbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbt {

    /* renamed from: a */
    public static final sbw f48967a = new sbw("SingleItemSynchronizer", "");

    /* renamed from: b */
    private final Context f48968b;

    /* renamed from: c */
    private final uhj f48969c;

    /* renamed from: d */
    private final vkv f48970d;

    /* renamed from: e */
    private final vbd f48971e;

    /* renamed from: f */
    private final uqe f48972f;

    /* renamed from: g */
    private final ufe f48973g;

    public vbt(vkv vkv, uqe uqe, uhj uhj, vbd vbd, Context context, ufe ufe) {
        sdo.m34959a(uhj);
        this.f48969c = uhj;
        sdo.m34959a(vkv);
        this.f48970d = vkv;
        sdo.m34959a(uqe);
        this.f48972f = uqe;
        sdo.m34959a(vbd);
        this.f48971e = vbd;
        sdo.m34959a(context);
        this.f48968b = context;
        sdo.m34959a(ufe);
        this.f48973g = ufe;
    }

    /* renamed from: a */
    public final void mo28207a(uey uey, String str, vks vks) {
        mo28209a(uey, mo28210b(uey, str, vks));
    }

    /* renamed from: b */
    public final vkr mo28210b(uey uey, String str, vks vks) {
        HashSet hashSet = new HashSet();
        if (!uey.mo27263a() && uey.f47398e.contains(twt.f46773b)) {
            try {
                this.f48971e.mo28190a(uey);
                hashSet.add(uey.f47395b);
            } catch (VolleyError e) {
                f48967a.mo25373b("SingleItemSynchronizer", String.format("Failed to retrieve app folder ID from the server so cannot sync %s", str), e);
                throw e;
            }
        }
        try {
            return this.f48970d.mo28602a(uey.m38255a(uey.f47394a).mo27262a(this.f48968b), str, hashSet, vks);
        } catch (VolleyError e2) {
            if (vkv.m40743a(e2)) {
                return new vky(str);
            }
            throw e2;
        } catch (gid e3) {
            f48967a.mo25377c("SingleItemSynchronizer", "Google Play Services is not authorized with the server. Something is really wrong here!");
            throw new AuthFailureError("Unexpected auth failure", e3);
        }
    }

    /* renamed from: a */
    public final void mo28208a(uey uey, String str, boolean z, vks vks) {
        try {
            mo28207a(uey, this.f48970d.mo28597a(uey.mo27262a(this.f48968b), str, z), vks);
        } catch (VolleyError e) {
            f48967a.mo25373b("SingleItemSynchronizer", String.format("Failed to retrieve resource ID for file with unique ID %s", str), e);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo28209a(uey uey, vkr vkr) {
        DriveId driveId;
        uih uih = uey.f47394a;
        uhp c = this.f48969c.mo27477c();
        try {
            uht uht = c.f47652a;
            uos b = uht.mo27494b(uih.f47682a);
            uht.mo27493a(b, bngx.m109356a(vkr));
            if (vkr.mo28568c()) {
                driveId = vbf.m39919a(b, vkr);
                this.f48973g.mo27275a();
            } else {
                driveId = vbf.m39920a(b, vkr, false);
            }
            c.mo27485a();
            if (driveId != null) {
                this.f48972f.mo27857a(driveId);
            }
        } finally {
            c.mo27486b();
        }
    }
}
