package p000;

import android.os.Build;
import com.felicanetworks.mfc.BuildConfig;

/* renamed from: nzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzi {
    /* renamed from: a */
    public static boolean m28224a() {
        int i;
        if (ccrv.f179815a.mo6606a().mo76698h()) {
            return ssw.m36269a();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 30 && !Build.VERSION.CODENAME.equals("R") && ((!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 30) && (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'R' || Build.VERSION.CODENAME.charAt(0) > 'Z'))) {
            return false;
        }
        if (!ccrv.f179815a.mo6606a().mo76696f()) {
            i = 5954562;
        } else {
            i = 6283131;
        }
        try {
            if (!BuildConfig.FLAVOR_client.equals(Build.BRAND) || Integer.parseInt(Build.VERSION.INCREMENTAL) < i) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
