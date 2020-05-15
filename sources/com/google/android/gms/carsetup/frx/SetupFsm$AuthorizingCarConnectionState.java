package com.google.android.gms.carsetup.frx;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class), @oxw(mo22764a = "EVENT_OK_STATE_SKIPPED", mo22765b = SetupFsm$CheckPermissionsState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class), @oxw(mo22764a = "EVENT_CAR_CONNECTION_ALLOWED", mo22765b = SetupFsm$CheckPermissionsState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class), @oxw(mo22764a = "EVENT_CAR_CONNECTION_DISALLOWED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class), @oxw(mo22764a = "EVENT_CAR_CONNECTION_CANCELLED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AuthorizingCarConnectionState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$AuthorizingCarConnectionState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 4;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        oxk oxk = (oxk) this.f38587c.f38582k;
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            bnsn bnsn = oxj.f38565a;
            oxk.mo22681k();
        }
        if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
            oxk.mo22683m();
        }
        return !"EVENT_CAR_STARTED_MOVING".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_CAR_CONNECTION_ALLOWED".equals(str) && !"EVENT_CAR_CONNECTION_DISALLOWED".equals(str) && !"EVENT_CAR_CONNECTION_CANCELLED".equals(str);
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        oxk oxk = (oxk) this.f38587c.f38582k;
        if (oxk.mo22673c()) {
            this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
        } else if (oxk.mo22674d()) {
            this.f38587c.mo22751a(owc.class);
        } else {
            bnsi b = oxj.f38565a.mo68387b();
            b.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$AuthorizingCarConnectionState", "a", 429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Critical error: car is rejected");
            this.f38587c.mo22754a("EVENT_CAR_CONNECTION_DISALLOWED");
        }
        oxk.mo22666a();
    }
}
