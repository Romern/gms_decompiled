package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: afzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzx {

    /* renamed from: a */
    public static final IntentFilter f65048a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: a */
    public static cajs m53781a(Context context) {
        int i;
        Intent registerReceiver = context.registerReceiver(null, f65048a);
        if (registerReceiver == null) {
            registerReceiver = new Intent();
        }
        bxvd da = cajs.f174855h.mo74144da();
        boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs = (cajs) da.f164949b;
        int i2 = 1;
        cajs.f174857a |= 1;
        cajs.f174858b = booleanExtra;
        int intExtra = registerReceiver.getIntExtra("level", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs2 = (cajs) da.f164949b;
        cajs2.f174857a |= 2;
        cajs2.f174859c = intExtra;
        int intExtra2 = registerReceiver.getIntExtra("scale", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs3 = (cajs) da.f164949b;
        cajs3.f174857a |= 4;
        cajs3.f174860d = intExtra2;
        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
        int i3 = intExtra3 != 0 ? intExtra3 != 1 ? intExtra3 != 2 ? intExtra3 != 4 ? 1 : 5 : 4 : 3 : 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs4 = (cajs) da.f164949b;
        cajs4.f174861e = i3 - 1;
        cajs4.f174857a |= 8;
        int intExtra4 = registerReceiver.getIntExtra("status", 1);
        if (intExtra4 != 2) {
            i = intExtra4 != 3 ? intExtra4 != 4 ? intExtra4 != 5 ? 1 : 5 : 4 : 3;
        } else {
            i = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs5 = (cajs) da.f164949b;
        cajs5.f174862f = i - 1;
        cajs5.f174857a |= 16;
        switch (registerReceiver.getIntExtra("health", 1)) {
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajs cajs6 = (cajs) da.f164949b;
        cajs6.f174863g = i2 - 1;
        cajs6.f174857a |= 32;
        return (cajs) da.mo74062i();
    }
}
