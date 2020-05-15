package com.google.android.gms.carsetup.frx;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$ResetDefaultCarDockState.class), @oxw(mo22764a = "EVENT_OK_STATE_SKIPPED", mo22765b = SetupFsm$SetupDoneState.class, mo22766c = SetupFsm$ResetDefaultCarDockState.class), @oxw(mo22764a = "EVENT_CAR_DOCK_CHOICE_RESET", mo22765b = SetupFsm$SetupDoneState.class, mo22766c = SetupFsm$ResetDefaultCarDockState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$ResetDefaultCarDockState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 45;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        return !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_CAR_DOCK_CHOICE_RESET".equals(str);
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        bnsn bnsn = oxj.f38565a;
        this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
    }
}
