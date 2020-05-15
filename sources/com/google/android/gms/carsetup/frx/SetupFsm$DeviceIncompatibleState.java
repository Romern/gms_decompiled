package com.google.android.gms.carsetup.frx;

import android.content.Intent;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$DeviceIncompatibleState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$DeviceIncompatibleState.class), @oxw(mo22764a = "EVENT_INTRO_DECLINED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$DeviceIncompatibleState.class), @oxw(mo22764a = "EVENT_USER_EXIT", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$DeviceIncompatibleState.class), @oxw(mo22764a = "EVENT_USE_VANAGON_CLICKED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$DeviceIncompatibleState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$DeviceIncompatibleState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 39;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        oxk oxk = (oxk) this.f38587c.f38582k;
        if ("EVENT_USE_VANAGON_CLICKED".equals(str)) {
            if (!oxk.mo22672b()) {
                Intent b = oyi.m29998b(this.f38587c.f38573b, "com.google.android.projection.gearhead", null);
                b.addFlags(268435456);
                this.f38586b.startActivity(b);
            }
            return false;
        } else if ("EVENT_INTRO_DECLINED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        if (((oxk) this.f38587c.f38582k).mo22684n() == 5) {
            this.f38587c.mo22751a(owq.class);
        } else {
            this.f38587c.mo22751a(owo.class);
        }
    }
}
