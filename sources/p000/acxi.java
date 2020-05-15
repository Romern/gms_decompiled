package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: acxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxi {

    /* renamed from: a */
    private static final IntentFilter f61011a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: a */
    public static bpws m49935a(Context context) {
        boolean z;
        boolean z2;
        bxvd da = bpws.f139558h.mo74144da();
        Intent registerReceiver = context.registerReceiver(null, f61011a);
        sdo.m34959a(registerReceiver);
        int intExtra = registerReceiver.getIntExtra("status", -1);
        int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
        int intExtra3 = registerReceiver.getIntExtra("level", -1);
        int intExtra4 = registerReceiver.getIntExtra("scale", -1);
        boolean z3 = true;
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        } else {
            z = false;
        }
        bxvd da2 = bpwr.f139552e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpwr bpwr = (bpwr) da2.f164949b;
        int i = bpwr.f139554a | 1;
        bpwr.f139554a = i;
        bpwr.f139555b = z;
        if (intExtra2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = i | 2;
        bpwr.f139554a = i2;
        bpwr.f139556c = z2;
        if (intExtra2 != 2) {
            z3 = false;
        }
        bpwr.f139554a = i2 | 4;
        bpwr.f139557d = z3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpws bpws = (bpws) da.f164949b;
        bpwr bpwr2 = (bpwr) da2.mo74062i();
        bpwr2.getClass();
        bpws.f139562c = bpwr2;
        bpws.f139560a = 2 | bpws.f139560a;
        double d = -1.0d;
        if (intExtra3 >= 0 && intExtra4 >= 0) {
            double d2 = (double) intExtra3;
            double d3 = (double) intExtra4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpws bpws2 = (bpws) da.f164949b;
        bpws2.f139560a |= 4;
        bpws2.f139563d = d;
        double doubleValue = ((Double) abzt.f58927bO.mo58455c()).doubleValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpws bpws3 = (bpws) da.f164949b;
        bpws3.f139560a |= 8;
        bpws3.f139564e = doubleValue;
        int i3 = Build.VERSION.SDK_INT;
        boolean isPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpws bpws4 = (bpws) da.f164949b;
        int i4 = bpws4.f139560a | 16;
        bpws4.f139560a = i4;
        bpws4.f139565f = isPowerSaveMode;
        bpws4.f139560a = i4 | 32;
        bpws4.f139566g = isPowerSaveMode;
        return (bpws) da.mo74062i();
    }
}
