package p000;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: vvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvd extends vvb implements aaai {

    /* renamed from: a */
    public static final Status f50014a = new Status(13, "Caller package not allowed to access this API.");

    /* renamed from: b */
    private final Context f50015b;

    /* renamed from: c */
    private final aaag f50016c;

    /* renamed from: d */
    private final vrb f50017d;

    public vvd(Context context, aaag aaag) {
        this.f50015b = context;
        this.f50016c = aaag;
        this.f50017d = new vrb(context);
    }

    /* renamed from: a */
    private static final void m41443a(rnt rnt, Status status) {
        try {
            rnt.mo11797a(status);
        } catch (RemoteException e) {
            Log.w("CAR.DRIVINGMODE", "Client died during Driving Mode API call", e);
        }
    }

    /* renamed from: b */
    public final void mo28898b(rnt rnt, int i) {
        if (m41444a("endDrivingMode")) {
            this.f50016c.mo16658a(new vve(rnt, i));
        } else {
            m41443a(rnt, f50014a);
        }
    }

    /* renamed from: a */
    private final boolean m41444a(String str) {
        boolean z;
        String[] packagesForUid = this.f50015b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            z = false;
            for (String str2 : packagesForUid) {
                if (bnjd.m109581a(bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) ccra.f179780a.mo6606a().mo76671g()), str2)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            Log.e("CAR.DRIVINGMODE", String.format("Calling package %s is not whitelisted to access %s method", this.f50015b.getPackageManager().getNameForUid(Binder.getCallingUid()), str));
            this.f50017d.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_PACKAGE_VERIFICATION_FAIL);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo28895a(rnt rnt) {
        this.f50016c.mo16658a(new vvf(rnt));
    }

    /* renamed from: a */
    public final void mo28896a(rnt rnt, int i) {
        if (m41444a("startDrivingMode")) {
            this.f50016c.mo16658a(new vvg(rnt, i));
        } else {
            m41443a(rnt, f50014a);
        }
    }

    /* renamed from: a */
    public final void mo28897a(rnt rnt, int i, boolean z) {
        if (m41444a("startDrivingModeSetup")) {
            this.f50016c.mo16658a(new vvh(rnt, i, z));
        } else {
            m41443a(rnt, f50014a);
        }
    }
}
