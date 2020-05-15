package p000;

import android.os.Bundle;

/* renamed from: aega */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aega {
    /* renamed from: a */
    public static int m51812a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("vehicle_personal_confidence", -1);
        }
        return -1;
    }

    /* renamed from: a */
    public static Bundle m51813a(Bundle bundle, String str) {
        sdo.m34974b(true);
        sdo.m34974b(str.equals("vehicle_personal_confidence"));
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt(str, 100);
        return bundle;
    }
}
