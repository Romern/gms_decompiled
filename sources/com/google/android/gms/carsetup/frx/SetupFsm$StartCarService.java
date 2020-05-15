package com.google.android.gms.carsetup.frx;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$StartCarService.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$StartCarService.class), @oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_CAR_SERVICE_STARTED", mo22765b = SetupFsm$FrxOptInState.class, mo22766c = SetupFsm$StartCarService.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$StartCarService extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 44;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        return !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_CAR_STARTED_MOVING".equals(str) && !"EVENT_CAR_SERVICE_STARTED".equals(str);
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        if (((oxk) this.f38587c.f38582k).mo22685o()) {
            this.f38587c.mo22754a("EVENT_CAR_SERVICE_STARTED");
        }
    }
}
