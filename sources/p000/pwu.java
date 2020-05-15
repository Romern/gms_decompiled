package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.NoSuchElementException;

/* renamed from: pwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwu extends pww implements IBinder.DeathRecipient, aaai {

    /* renamed from: a */
    private final qav f40540a = new qav("CastRemoteDisplayService");

    /* renamed from: b */
    private final Context f40541b;

    /* renamed from: c */
    private final aaag f40542c;

    /* renamed from: d */
    private final pvd f40543d;

    /* renamed from: e */
    private final pwt f40544e;

    /* renamed from: f */
    private pwv f40545f;

    public pwu(Context context, aaag aaag, String str, pvd pvd) {
        this.f40541b = context;
        this.f40542c = aaag;
        this.f40543d = pvd;
        this.f40544e = new pwt(pvd, aaag, this.f40541b, str, this.f40540a);
    }

    /* renamed from: a */
    private final void m31551a(pwv pwv, pwy pwy, PendingIntent pendingIntent, String str, String str2, Bundle bundle) {
        pwv pwv2 = pwv;
        if (this.f40544e.mo23784a()) {
            this.f40545f = pwv2;
            if (pwv2 != null) {
                try {
                    pwv2.f12819a.linkToDeath(this, 0);
                } catch (RemoteException e) {
                    this.f40540a.mo23676c(e, "client died while linking DeathRecipient", new Object[0]);
                    this.f40545f = null;
                    return;
                }
            }
            this.f40542c.mo16658a(new pxc(this.f40543d, pwv, pwy, pendingIntent, str, str2, bundle));
            this.f40544e.mo23785b();
            return;
        }
        this.f40540a.mo23675c("unable to start remote display as app is not in foreground", new Object[0]);
        try {
            pwv.mo23796a(3);
        } catch (RemoteException e2) {
            this.f40540a.mo23674b(e2, "client died while brokering service", new Object[0]);
        }
    }

    /* renamed from: c */
    private final void m31552c() {
        this.f40540a.mo23670a("Cast remote display service destroyed, stopping remote display", new Object[0]);
        this.f40544e.mo23786c();
        mo23788a((pwv) null);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo23793b() {
        throw new UnsupportedOperationException("Call to destroy() is not supported.");
    }

    public final void binderDied() {
        this.f40540a.mo23670a("cast remote display client died, reaping...", new Object[0]);
        m31552c();
    }

    /* renamed from: a */
    public final void mo23787a() {
        m31552c();
        pwv pwv = this.f40545f;
        if (pwv != null) {
            try {
                pwv.f12819a.unlinkToDeath(this, 0);
            } catch (NoSuchElementException e) {
            } finally {
                this.f40545f = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo23788a(pwv pwv) {
        this.f40540a.mo23670a("stopRemoteDisplay", new Object[0]);
        this.f40542c.mo16658a(new pxd(this.f40543d, pwv));
    }

    /* renamed from: a */
    public final void mo23789a(pwv pwv, int i) {
        this.f40540a.mo23670a("provisionVirtualDisplay. displayId:%d", Integer.valueOf(i));
        this.f40542c.mo16658a(new pxb(this.f40543d, pwv, i));
    }

    /* renamed from: a */
    public final void mo23790a(pwv pwv, PendingIntent pendingIntent, String str, String str2, Bundle bundle) {
        this.f40540a.mo23670a("startRemoteDisplayWithConfig. deviceId:%s appId:%s config:%s", str, str2, bundle);
        m31551a(pwv, null, pendingIntent, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo23791a(pwv pwv, pwy pwy, String str, String str2) {
        mo23792a(pwv, pwy, str, str2, (Bundle) null);
    }

    /* renamed from: a */
    public final void mo23792a(pwv pwv, pwy pwy, String str, String str2, Bundle bundle) {
        this.f40540a.mo23670a("startRemoteDisplayWithConfig. deviceId:%s appId:%s config:%s", str, str2, bundle);
        m31551a(pwv, pwy, null, str, str2, bundle);
    }
}
