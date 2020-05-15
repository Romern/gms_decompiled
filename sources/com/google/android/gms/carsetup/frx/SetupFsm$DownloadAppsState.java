package com.google.android.gms.carsetup.frx;

import android.os.Bundle;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$DownloadAppsState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$DownloadAppsState.class), @oxw(mo22764a = "EVENT_OK_STATE_SKIPPED", mo22765b = SetupFsm$StartCarService.class, mo22766c = SetupFsm$DownloadAppsState.class), @oxw(mo22764a = "EVENT_APPLICATION_INSTALLATION_ALLOWED", mo22765b = SetupFsm$InstallingAppsState.class, mo22766c = SetupFsm$DownloadAppsState.class), @oxw(mo22764a = "EVENT_APPLICATION_INSTALLATION_CANCELLED", mo22765b = SetupFsm$DownloadRetryState.class, mo22766c = SetupFsm$DownloadAppsState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$DownloadAppsState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 5;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        return !"EVENT_CAR_STARTED_MOVING".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) && !"EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.Class, android.os.Bundle, boolean):void
     arg types: [java.lang.Class, ?[OBJECT, ARRAY], int]
     candidates:
      oxr.a(java.lang.Class, java.lang.String, android.os.Parcelable):void
      oxr.a(oxv, oxv, java.lang.String):void
      oxr.a(java.lang.Class, android.os.Bundle, boolean):void */
    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        if (((oxk) this.f38587c.f38582k).mo22676f()) {
            this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
        } else {
            this.f38587c.mo22752a(owx.class, (Bundle) null, true);
        }
    }
}
