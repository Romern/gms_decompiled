package com.google.android.gms.carsetup.frx;

import android.content.Intent;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$FrxOptInState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$FrxOptInState.class), @oxw(mo22764a = "EVENT_FRX_OPT_IN_ACCEPTED", mo22765b = SetupFsm$ResetDefaultCarDockState.class, mo22766c = SetupFsm$FrxOptInState.class), @oxw(mo22764a = "EVENT_FRX_OPT_IN_CANCELLED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$FrxOptInState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$FrxOptInState extends oxv {
    /* renamed from: a */
    public final int mo17457a() {
        return 8;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
            return !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_FRX_OPT_IN_ACCEPTED".equals(str) && !"EVENT_FRX_OPT_IN_CANCELLED".equals(str);
        }
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f29664b;
        if (intent == null) {
            this.f38587c.mo22754a("EVENT_FRX_OPT_IN_CANCELLED");
            return true;
        }
        bnsn bnsn = oxj.f38565a;
        intent.toUri(0);
        int i = activityResult.f29663a;
        if (activityResult.f29664b.getBooleanExtra("EXTRA_FRX_HAS_ERROR", false)) {
            bnsi b = oxj.f38565a.mo68387b();
            b.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$FrxOptInState", "b", 1143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Critical error: frx error");
            this.f38587c.mo22754a("EVENT_ERROR");
            return true;
        } else if (i != -1) {
            bnsi b2 = oxj.f38565a.mo68387b();
            b2.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$FrxOptInState", "b", 1149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("Critical error: opt in cancelled");
            this.f38587c.mo22754a("EVENT_FRX_OPT_IN_CANCELLED");
            return true;
        } else {
            this.f38587c.mo22754a("EVENT_FRX_OPT_IN_ACCEPTED");
            return true;
        }
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        this.f38586b.getPackageManager();
        Intent r = ((oxk) this.f38587c.f38582k).mo22688r();
        if (r.resolveActivity(this.f38586b.getPackageManager()) != null) {
            this.f38587c.mo22749a(r);
        } else {
            this.f38587c.mo22754a("EVENT_ERROR");
        }
    }
}
