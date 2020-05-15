package com.google.android.location.util;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceIdleHelper$PowerManagerReciever extends aacn {

    /* renamed from: a */
    final /* synthetic */ bhbg f150966a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceIdleHelper$PowerManagerReciever(bhbg bhbg) {
        super("location");
        this.f150966a = bhbg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            boolean isDeviceIdleMode = this.f150966a.f118232b.isDeviceIdleMode();
            bhbg bhbg = this.f150966a;
            if (isDeviceIdleMode != bhbg.f118235e) {
                bhbg.f118235e = isDeviceIdleMode;
                DeviceActiveAlarmTimer deviceActiveAlarmTimer = bhbg.f118236f;
                if (deviceActiveAlarmTimer != null && deviceActiveAlarmTimer.f150956c && isDeviceIdleMode != deviceActiveAlarmTimer.f150958e) {
                    deviceActiveAlarmTimer.f150958e = isDeviceIdleMode;
                    if (isDeviceIdleMode) {
                        deviceActiveAlarmTimer.f150955b.mo25932a(deviceActiveAlarmTimer);
                        long elapsedRealtime = deviceActiveAlarmTimer.f150957d - (SystemClock.elapsedRealtime() - deviceActiveAlarmTimer.f150959f);
                        deviceActiveAlarmTimer.f150957d = elapsedRealtime;
                        if (elapsedRealtime <= 0) {
                            deviceActiveAlarmTimer.mo70958d();
                            return;
                        }
                        return;
                    }
                    deviceActiveAlarmTimer.mo70959e();
                }
            }
        }
    }
}
