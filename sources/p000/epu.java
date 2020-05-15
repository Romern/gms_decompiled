package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: epu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epu {
    /* renamed from: a */
    public static int m10942a(bsxn bsxn) {
        return m10943a((String) Collections.unmodifiableMap(bsxn.f147590c).get("screenFlavor"));
    }

    /* renamed from: b */
    public static int m10945b(Map map) {
        try {
            return Integer.parseInt((String) map.get("gmscoreSettingsCategoryId"));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m10943a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m10944a(Map map) {
        try {
            return Integer.parseInt((String) map.get("gmscoreSettingsItemId"));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
