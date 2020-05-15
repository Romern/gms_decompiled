package p000;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: aoyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyc {

    /* renamed from: b */
    private static aoyc f83835b;

    /* renamed from: a */
    public final TelephonyManager f83836a;

    private aoyc(Context context) {
        this.f83836a = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public static synchronized aoyc m69800a(Context context) {
        aoyc aoyc;
        synchronized (aoyc.class) {
            if (f83835b == null) {
                f83835b = new aoyc(context.getApplicationContext());
            }
            aoyc = f83835b;
        }
        return aoyc;
    }
}
