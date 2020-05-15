package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fitness.sessions.registration.SessionRegistration;
import java.util.Map;
import java.util.Set;

/* renamed from: zpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpe {

    /* renamed from: d */
    private static final srn f55648d = zvt.m46581a();

    /* renamed from: a */
    public final bnot f55649a = bnge.m109299s();

    /* renamed from: b */
    public final String f55650b;

    /* renamed from: c */
    public final ytk f55651c;

    public zpe(ytk ytk, String str) {
        this.f55651c = ytk;
        this.f55650b = str;
    }

    /* renamed from: b */
    private final void m45940b(String str, PendingIntent pendingIntent) {
        for (SessionRegistration sessionRegistration : this.f55651c.mo30751b()) {
            if (sessionRegistration.f32438a.equals(this.f55650b) && sessionRegistration.f32439b.equals(str)) {
                if (pendingIntent == null || sessionRegistration.f32441d.equals(pendingIntent)) {
                    this.f55651c.mo30752b(sessionRegistration);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31305a(String str) {
        this.f55649a.mo67362b(str);
        m45940b(str, null);
    }

    /* renamed from: a */
    public final void mo31306a(String str, PendingIntent pendingIntent) {
        bnot bnot = this.f55649a;
        Set a = bnot.mo67361a(str);
        if (a == null || !a.remove(pendingIntent)) {
            ((bnsl) f55648d.mo68387b()).mo68420a("Pending intent %s not found in the list of intents registered for explicit sessions.", pendingIntent);
        } else if (a.isEmpty()) {
            bnot.mo67362b(str);
        }
        m45940b(str, pendingIntent);
    }

    /* renamed from: b */
    public final Map mo31309b() {
        return this.f55649a.mo67318q();
    }

    /* renamed from: a */
    public final void mo31307a(String str, PendingIntent pendingIntent, ClientIdentity clientIdentity, boolean z) {
        if (pendingIntent != null) {
            this.f55649a.mo67268a(str, pendingIntent);
            if (z) {
                this.f55651c.mo30750a(new SessionRegistration(this.f55650b, str, clientIdentity.f30221a, pendingIntent));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo31308a() {
        return !this.f55649a.mo67314m();
    }
}
