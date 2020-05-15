package com.google.android.gms.carsetup.frx;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_COUNTRY_NOT_WHITELISTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_PHONE_IN_BLACKLIST", mo22765b = SetupFsm$DeviceIncompatibleState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_DEVICE_INCOMPATIBLE", mo22765b = SetupFsm$DeviceIncompatibleState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_DEVICE_COMPATIBLE", mo22765b = SetupFsm$AutoIntroState.class, mo22766c = SetupFsm$EntryState.class), @oxw(mo22764a = "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS", mo22765b = SetupFsm$AutoIntroState.class, mo22766c = SetupFsm$EntryState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$EntryState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 42;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            this.f38587c.mo22754a("EVENT_CAR_DISCONNECTED");
            return true;
        } else if ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_COUNTRY_NOT_WHITELISTED".equals(str) || "EVENT_PHONE_IN_BLACKLIST".equals(str) || "EVENT_DEVICE_INCOMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        int n = ((oxk) this.f38587c.f38582k).mo22684n();
        bnsn bnsn = oxj.f38565a;
        this.f38587c.mo22754a(n != 0 ? n != 1 ? n != 2 ? n != 3 ? (n == 4 || n == 5) ? "EVENT_DEVICE_INCOMPATIBLE" : "EVENT_ERROR" : "EVENT_PHONE_IN_BLACKLIST" : "EVENT_COUNTRY_NOT_WHITELISTED" : "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS" : "EVENT_DEVICE_COMPATIBLE");
    }
}
