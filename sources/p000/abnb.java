package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: abnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abnb {
    /* renamed from: a */
    public static bose m47939a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        bxvd da = bose.f134569j.mo74144da();
        if (registerReceiver == null) {
            return (bose) da.mo74062i();
        }
        int intExtra = registerReceiver.getIntExtra("health", Integer.MIN_VALUE);
        if (intExtra != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose = (bose) da.f164949b;
            bose.f134571a |= 1;
            bose.f134572b = intExtra;
        }
        int intExtra2 = registerReceiver.getIntExtra("scale", Integer.MIN_VALUE);
        if (intExtra2 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose2 = (bose) da.f164949b;
            bose2.f134571a |= 2;
            bose2.f134573c = intExtra2;
        }
        int intExtra3 = registerReceiver.getIntExtra("level", Integer.MIN_VALUE);
        if (intExtra3 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose3 = (bose) da.f164949b;
            bose3.f134571a |= 4;
            bose3.f134574d = intExtra3;
        }
        int intExtra4 = registerReceiver.getIntExtra("plugged", Integer.MIN_VALUE);
        if (intExtra4 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose4 = (bose) da.f164949b;
            bose4.f134571a |= 8;
            bose4.f134575e = intExtra4;
        }
        if (registerReceiver.getBooleanExtra("present", false)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose5 = (bose) da.f164949b;
            bose5.f134571a |= 16;
            bose5.f134576f = true;
        }
        int intExtra5 = registerReceiver.getIntExtra("status", Integer.MIN_VALUE);
        if (intExtra5 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose6 = (bose) da.f164949b;
            bose6.f134571a |= 32;
            bose6.f134577g = intExtra5;
        }
        int intExtra6 = registerReceiver.getIntExtra("temperature", Integer.MIN_VALUE);
        if (intExtra6 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose7 = (bose) da.f164949b;
            bose7.f134571a |= 64;
            bose7.f134578h = intExtra6;
        }
        int intExtra7 = registerReceiver.getIntExtra("voltage", Integer.MIN_VALUE);
        if (intExtra7 != Integer.MIN_VALUE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bose bose8 = (bose) da.f164949b;
            bose8.f134571a |= 128;
            bose8.f134579i = intExtra7;
        }
        return (bose) da.mo74062i();
    }
}
