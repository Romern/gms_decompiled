package com.google.android.gms.carsetup.frx;

import com.google.android.gms.carsetup.fsm.impl.ActivityResult;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$CheckPermissionsState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$CheckPermissionsState.class), @oxw(mo22764a = "EVENT_OK_STATE_SKIPPED", mo22765b = SetupFsm$DownloadAppsState.class, mo22766c = SetupFsm$CheckPermissionsState.class), @oxw(mo22764a = "EVENT_PERMISSION_DENIED", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$CheckPermissionsState.class), @oxw(mo22764a = "EVENT_ALL_PERMISSIONS_GRANTED", mo22765b = SetupFsm$DownloadAppsState.class, mo22766c = SetupFsm$CheckPermissionsState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$CheckPermissionsState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 13;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        if ("EVENT_ACTIVITY_RESULT".equals(str) && obj != null) {
            bnsn bnsn = oxj.f38565a;
            if (((ActivityResult) obj).f29663a == -1) {
                this.f38587c.mo22754a("EVENT_ALL_PERMISSIONS_GRANTED");
            } else {
                this.f38587c.mo22754a("EVENT_PERMISSION_DENIED");
            }
            return true;
        } else if ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_PERMISSION_DENIED".equals(str) || "EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        if (((oxk) this.f38587c.f38582k).mo22675e()) {
            this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
        } else {
            bnsn bnsn = oxj.f38565a;
        }
    }
}
