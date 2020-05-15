package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: arpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpx {

    /* renamed from: a */
    private final Context f88109a;

    public arpx(Context context) {
        this.f88109a = context;
    }

    /* renamed from: a */
    public final boolean mo48742a() {
        return mo48744c() == 0;
    }

    /* renamed from: b */
    public final boolean mo48743b() {
        return mo48744c() == 1;
    }

    /* renamed from: c */
    public final int mo48744c() {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) this.f88109a.getSystemService("phone");
        if (telephonyManager != null) {
            int i = Build.VERSION.SDK_INT;
            if (telephonyManager.isVoiceCapable()) {
                z = true;
                int i2 = this.f88109a.getResources().getConfiguration().screenLayout & 15;
                if (z && i2 >= 3) {
                    return 1;
                }
                if (!z && i2 < 3) {
                    return 0;
                }
                return 2;
            }
        }
        z = false;
        int i22 = this.f88109a.getResources().getConfiguration().screenLayout & 15;
        if (z) {
        }
        if (!z) {
            return 2;
        }
        return 0;
    }
}
