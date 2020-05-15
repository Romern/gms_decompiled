package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: aabd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabd extends BroadcastReceiver {

    /* renamed from: a */
    public volatile boolean f27870a = false;

    /* renamed from: b */
    public volatile Boolean f27871b = null;

    /* renamed from: c */
    public volatile Boolean f27872c = null;

    /* renamed from: d */
    public volatile Boolean f27873d = null;

    /* renamed from: e */
    public volatile boolean f27874e = false;

    /* renamed from: f */
    public volatile boolean f27875f = false;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r7.equals("android.intent.action.ACTION_POWER_CONNECTED") != false) goto L_0x0066;
     */
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        char c = 0;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1980154005:
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 490310653:
                if (action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 870701415:
                if (action.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1019184907:
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.f27871b = true;
                return;
            case 1:
                this.f27871b = false;
                return;
            case 2:
                this.f27872c = true;
                return;
            case 3:
                this.f27872c = false;
                return;
            case 4:
                this.f27873d = true;
                return;
            case 5:
                this.f27873d = false;
                return;
            case 6:
                this.f27874e = m21046a(context);
                return;
            case 7:
                this.f27875f = m21047b(context);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static final boolean m21046a(Context context) {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isDeviceIdleMode();
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m21047b(Context context) {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }
}
