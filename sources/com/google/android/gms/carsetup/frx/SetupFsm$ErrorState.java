package com.google.android.gms.carsetup.frx;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$ErrorState.class), @oxw(mo22764a = "EVENT_USER_EXIT", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$ErrorState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$ErrorState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 10;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        return !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_USER_EXIT".equals(str);
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        this.f38587c.mo22751a(owk.class);
    }
}
