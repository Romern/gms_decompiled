package p000;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.service.CastRemoteControlNotificationChimeraService;

/* renamed from: pxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxj extends alm {

    /* renamed from: a */
    final /* synthetic */ CastRemoteControlNotificationChimeraService f40570a;

    public pxj(CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService) {
        this.f40570a = castRemoteControlNotificationChimeraService;
    }

    /* renamed from: d */
    private final void m31584d(alv alv) {
        CastRemoteControlNotificationChimeraService.f29907a.mo23856a("onRouteDiscovered: %s", alv);
        boolean z = false;
        if (alv == null) {
            CastRemoteControlNotificationChimeraService.f29907a.mo23675c("onRouteDiscovered called with null routeInfo", new Object[0]);
        } else if (!alv.mo998a(this.f40570a.f29908b)) {
            CastRemoteControlNotificationChimeraService.f29907a.mo23675c("Skipping routeInfo because it does not support the media namespace", new Object[0]);
        } else {
            CastDevice b = CastDevice.m22257b(alv.f883l);
            if (b == null) {
                CastRemoteControlNotificationChimeraService.f29907a.mo23675c("onRouteDiscovered called with null CastDevice inside routeInfo", new Object[0]);
                return;
            }
            pwr pwr = this.f40570a.f29912f;
            String str = alv.f874c;
            String a = b.mo17494a();
            pwr.f40525g.put(a, b);
            pwr.f40526h.put(a, str);
            if (this.f40570a.f29914h.mo23749a(b.mo17494a()) != null) {
                z = true;
            }
            this.f40570a.mo17602a(b.mo17494a(), z);
        }
    }

    /* renamed from: a */
    public final void mo980a(alv alv) {
        m31584d(alv);
    }

    /* renamed from: b */
    public final void mo981b(alv alv) {
        m31584d(alv);
    }

    /* renamed from: c */
    public final void mo982c(alv alv) {
        CastRemoteControlNotificationChimeraService.f29907a.mo23856a("onRouteRemoved: %s", alv);
        if (alv == null) {
            CastRemoteControlNotificationChimeraService.f29907a.mo23675c("onRouteRemoved called with null routeInfo", new Object[0]);
            return;
        }
        CastDevice b = CastDevice.m22257b(alv.f883l);
        if (b == null) {
            CastRemoteControlNotificationChimeraService.f29907a.mo23675c("onRouteDiscovered called with null CastDevice inside routeInfo", new Object[0]);
            return;
        }
        pwr pwr = this.f40570a.f29912f;
        String a = b.mo17494a();
        pwr.mo23780a(a, false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_OFFLINE);
        pwr.f40526h.remove(a);
        if (pwr.f40523e) {
            pwr.f40525g.remove(a);
        }
    }
}
