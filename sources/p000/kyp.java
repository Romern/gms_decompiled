package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: kyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum kyp {
    UNKNOWN,
    MAIN,
    PERSISTENT,
    UI;

    /* renamed from: a */
    public static kyp m18803a(Context context) {
        String a = ssy.m36271a();
        if (a == null) {
            return UNKNOWN;
        }
        if ("com.google.android.gms".equals(a)) {
            return MAIN;
        }
        if (!"com.google.android.gms.ui".equals(a)) {
            return context.getString(C0126R.string.common_persistent_or_gapps_process).equals(a) ? PERSISTENT : UNKNOWN;
        }
        return UI;
    }
}
