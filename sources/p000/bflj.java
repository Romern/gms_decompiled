package p000;

import android.util.Log;

/* renamed from: bflj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bflj implements bugt {
    /* renamed from: a */
    public final void mo61879a(int i) {
        if (i != 0 && i != 1 && Log.isLoggable("SettingsHelperNyc", 6)) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Error sending notification to nanoapp: ");
            sb.append(i);
            Log.e("SettingsHelperNyc", sb.toString());
        }
    }
}
