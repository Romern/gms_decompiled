package com.google.android.gms.car.usb;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FailedConnectionDetector$1 extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ onl f29526a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FailedConnectionDetector$1(onl onl, String str) {
        super(str);
        this.f29526a = onl;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        try {
            onl onl = this.f29526a;
            bnsn bnsn = onl.f38008a;
            String action = intent.getAction();
            if (UiModeManager.ACTION_ENTER_CAR_MODE.equals(action)) {
                onl.mo22356a(onj.PROJECTING);
            } else if (UiModeManager.ACTION_EXIT_CAR_MODE.equals(action)) {
                onl.mo22356a(onj.START);
            } else if ("com.google.android.gms.car.PROJECTION_STARTED".equals(action)) {
                onl.mo22356a(onj.PROJECTING);
            } else if ("com.google.android.gms.car.PROJECTION_ENDED".equals(action)) {
                onl.mo22356a(onj.START);
            } else if (onl.f38015h != onj.PROJECTING) {
                String action2 = intent.getAction();
                if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action2)) {
                    oew oew = (oew) ofd.m28610a(intent, oew.values());
                    if (onl.f38015h == onj.FIRST_ACTIVITY_LAUNCHED) {
                        return;
                    }
                    if (!onl.f38011d.contains(oew)) {
                        onl.mo22356a(onj.FIRST_ACTIVITY_LAUNCHED);
                    } else {
                        onl.mo22356a(onj.START);
                    }
                } else if ("com.google.android.gms.car.FRX".equals(action2)) {
                    if (((ofa) ofd.m28610a(intent, ofa.values())) != ofa.COMPLETED) {
                        onl.mo22356a(onj.START);
                    } else {
                        onl.mo22356a(onj.ACCESSORY_MODE);
                    }
                } else if (!onl.f38010c.contains(action2)) {
                    onl.m29233a("received unexpected intent %s", action2);
                } else if (((ofa) ofd.m28610a(intent, ofa.values())) == ofa.FAILED) {
                    onl.mo22356a(onj.START);
                }
            }
        } catch (oex e) {
            onl.m29233a("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}
