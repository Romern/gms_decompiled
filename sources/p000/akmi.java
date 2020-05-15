package p000;

import android.content.Context;
import android.net.NetworkScoreManager;
import com.google.android.gms.netrec.scoring.service.ClearDatabaseService;

/* renamed from: akmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmi {
    /* renamed from: a */
    public static void m60008a() {
        eoa.m10826b("NetRec", "Now the active scorer.", new Object[0]);
        akka.f72126a.mo10352a((Object) true);
    }

    /* renamed from: b */
    public static boolean m60010b(Context context) {
        NetworkScoreManager networkScoreManager = (NetworkScoreManager) context.getSystemService("network_score");
        if (networkScoreManager == null) {
            return false;
        }
        return context.getPackageName().equals(networkScoreManager.getActiveScorerPackage());
    }

    /* renamed from: a */
    public static void m60009a(Context context) {
        eoa.m10826b("NetRec", "No longer the active scorer.", new Object[0]);
        if (cfpd.f185332a.mo6606a().mo82443h()) {
            ClearDatabaseService.m67657a(context);
        }
    }
}
