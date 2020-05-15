package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: hui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hui extends aaab {

    /* renamed from: a */
    private static final sbw f20443a = new sbw("AuthEarlyUpdate", "[EUIsSidecarUpdatedOperation]");

    /* renamed from: b */
    private final rnt f20444b;

    /* renamed from: c */
    private final hud f20445c;

    @Deprecated
    public hui(hud hud) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        this.f20445c = hud;
        this.f20444b = null;
    }

    /* renamed from: a */
    private final void m14876a(Status status, boolean z) {
        hud hud = this.f20445c;
        if (hud != null) {
            hud.mo12725a(status, z);
        }
        rnt rnt = this.f20444b;
        if (rnt != null) {
            rnt.mo11797a(status);
        }
    }

    public hui(rnt rnt) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        this.f20445c = null;
        this.f20444b = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (hug.m14870a(context).mo12727b()) {
            f20443a.mo25366a("AuthEarlyUpdate", "Current version of SidecarAps is higher than prebuilt!");
            m14876a(Status.f30107a, true);
            return;
        }
        f20443a.mo25366a("AuthEarlyUpdate", "Sidecar is not updated!");
        m14876a(Status.f30107a, false);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m14876a(status, false);
    }
}
