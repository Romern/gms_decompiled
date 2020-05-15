package com.google.android.location.contexthub;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsHelperNyc$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfll f150713a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsHelperNyc$2(bfll bfll, String str) {
        super(str);
        this.f150713a = bfll;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        bfll bfll = this.f150713a;
        String action = intent.getAction();
        if (action != null) {
            boolean z = true;
            switch (action.hashCode()) {
                case -1875733435:
                    if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1184851779:
                    if (action.equals("android.location.PROVIDERS_CHANGED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1076576821:
                    if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -511271086:
                    if (action.equals("android.location.MODE_CHANGED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                boolean e = bfll.mo61888e();
                bxvd bxvd = bfll.f114348f;
                if (((bugf) bxvd.f164949b).f153778d == e) {
                    boolean z2 = !e;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bugf bugf = (bugf) bxvd.f164949b;
                    bugf bugf2 = bugf.f153773g;
                    bugf.f153775a |= 4;
                    bugf.f153778d = z2;
                    bfll.mo61881a(3, bfll.f114348f);
                }
            } else if (c == 1) {
                int intExtra = intent.getIntExtra("wifi_state", 4);
                if (intExtra == 1 || intExtra == 3) {
                    bfll.mo61883b();
                }
            } else if (c == 2 || c == 3) {
                boolean f = bfll.mo61889f();
                bxvd bxvd2 = bfll.f114348f;
                if (((bugf) bxvd2.f164949b).f153779e != f) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bugf bugf3 = (bugf) bxvd2.f164949b;
                    bugf bugf4 = bugf.f153773g;
                    bugf3.f153775a |= 8;
                    bugf3.f153779e = f;
                } else {
                    z = false;
                }
                boolean g = bfll.mo61890g();
                bxvd bxvd3 = bfll.f114348f;
                if (((bugf) bxvd3.f164949b).f153780f != g) {
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bugf bugf5 = (bugf) bxvd3.f164949b;
                    bugf bugf6 = bugf.f153773g;
                    bugf5.f153775a |= 16;
                    bugf5.f153780f = g;
                } else if (!z) {
                    return;
                }
                bfll.mo61881a(3, bfll.f114348f);
            } else {
                Log.e("SettingsHelperNyc", action.length() == 0 ? new String("received unknown event action: ") : "received unknown event action: ".concat(action));
            }
        }
    }
}
