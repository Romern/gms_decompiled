package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;

/* renamed from: bgzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzf {

    /* renamed from: a */
    static final IntentFilter f118155a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    public final Context f118156b;

    public bgzf(Context context) {
        this.f118156b = context;
    }

    /* renamed from: a */
    public static bgvj m100440a(Context context) {
        Intent intent = null;
        try {
            intent = context.registerReceiver(null, f118155a);
        } catch (ReceiverCallNotAllowedException e) {
        }
        bxvd da = bgvj.f117660f.mo74144da();
        if (intent != null) {
            int a = bgvi.m100126a(intent.getIntExtra("plugged", 0));
            if (a == 0) {
                a = 4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvj bgvj = (bgvj) da.f164949b;
            bgvj.f117663b = a - 1;
            bgvj.f117662a |= 1;
            int intExtra = intent.getIntExtra("level", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvj bgvj2 = (bgvj) da.f164949b;
            bgvj2.f117662a |= 2;
            bgvj2.f117664c = intExtra;
            int intExtra2 = intent.getIntExtra("scale", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvj bgvj3 = (bgvj) da.f164949b;
            bgvj3.f117662a = 4 | bgvj3.f117662a;
            bgvj3.f117665d = intExtra2;
            int intExtra3 = intent.getIntExtra("voltage", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvj bgvj4 = (bgvj) da.f164949b;
            bgvj4.f117662a |= 8;
            bgvj4.f117666e = intExtra3;
        }
        return (bgvj) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m100441a(bgvj bgvj) {
        int a;
        return (bgvj == null || (bgvj.f117662a & 1) == 0 || (a = bgvi.m100126a(bgvj.f117663b)) == 0 || a == 1) ? false : true;
    }
}
