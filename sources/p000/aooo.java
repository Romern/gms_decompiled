package p000;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: aooo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aooo extends aaab {

    /* renamed from: a */
    private final aooh f78607a;

    public aooo(aooh aooh) {
        super(38, "GetToken");
        sdo.m34959a(aooh);
        this.f78607a = aooh;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    public static PseudonymousIdToken m66219b(Context context) {
        PseudonymousIdToken pseudonymousIdToken;
        synchronized ("PseudonymousIdService") {
            if (aooq.f78612b != null) {
                pseudonymousIdToken = aooq.f78612b;
            } else {
                try {
                    PseudonymousIdToken pseudonymousIdToken2 = new PseudonymousIdToken(context.getSharedPreferences("PseudonymousIdIntentService", 0).getString("pseudonymousId", null));
                    aooq.f78612b = pseudonymousIdToken2;
                    pseudonymousIdToken = pseudonymousIdToken2;
                } catch (IllegalStateException e) {
                    aytw.m84814b();
                    if (!((UserManager) context.getSystemService(UserManager.class)).isUserRunning(Process.myUserHandle())) {
                        throw new aoom("User Stopping", e);
                    }
                    throw e;
                }
            }
        }
        return pseudonymousIdToken;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f78607a.mo43124a(Status.f30107a, m66219b(context));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f78607a.mo43124a(status, (PseudonymousIdToken) null);
    }
}
