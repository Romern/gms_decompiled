package p000;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: afgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgt {
    private afgt() {
    }

    /* renamed from: a */
    public static Parcelable m53060a(Bundle bundle, String str) {
        bundle.setClassLoader(afgt.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(afgt.class.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m53061a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m53060a(bundle, "MapOptions");
            if (a != null) {
                m53062a(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m53060a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m53062a(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m53060a(bundle, "camera");
            if (a3 != null) {
                m53062a(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: a */
    public static void m53062a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(afgt.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(afgt.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
