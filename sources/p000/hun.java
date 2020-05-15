package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: hun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hun extends aaab {

    /* renamed from: a */
    private static final sbw f20455a = new sbw("AuthEarlyUpdate", "[EUUnrequestFeaturesOperation]");

    /* renamed from: b */
    private final int f20456b;

    /* renamed from: c */
    private final rnt f20457c;

    /* renamed from: d */
    private final hud f20458d;

    @Deprecated
    public hun(hud hud, int i) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        sdo.m34959a(hud);
        this.f20458d = hud;
        this.f20456b = i;
        this.f20457c = null;
    }

    /* renamed from: a */
    private final void m14888a(Status status, boolean z) {
        hud hud = this.f20458d;
        if (hud != null) {
            hud.mo12725a(status, z);
        }
        rnt rnt = this.f20457c;
        if (rnt != null) {
            rnt.mo11797a(status);
        }
    }

    public hun(rnt rnt, int i) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        this.f20458d = null;
        this.f20456b = i;
        sdo.m34959a(rnt);
        this.f20457c = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        hua hua = new hua(context);
        hug a = hug.m14870a(context);
        if (((Status) hua.mo12717a(hua.mo12716a(3, this.f20456b, null, context)).mo9456a(ccdm.m129308b(), TimeUnit.SECONDS)).equals(Status.f30107a)) {
            try {
                aucu.m76783a(hua.f20430b.mo24732b(new qwu()), ccdm.m129308b(), TimeUnit.SECONDS);
            } catch (Exception e) {
                hua.f20429a.mo25378c("AuthEarlyUpdate", "Exception when uploading logs.", e);
            }
        }
        if (!ccdp.m129335b() || a.mo12727b()) {
            a.mo12726a();
            hug.f20436a.mo25366a("AuthEarlyUpdate", "Performing clearGmsCoreData()");
            a.f20439c.clearApplicationUserData();
            m14888a(Status.f30107a, true);
            return;
        }
        f20455a.mo25366a("AuthEarlyUpdate", "SidecarAps was never updated. No need to rollback.");
        m14888a(Status.f30107a, true);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m14888a(status, false);
    }
}
