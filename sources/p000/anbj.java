package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: anbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbj {
    /* renamed from: a */
    public static String m63920a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("feed");
        }
        return null;
    }

    /* renamed from: b */
    public static int m63921b(Bundle bundle) {
        if (bundle == null) {
            return 3;
        }
        if (cgay.m144129b() && bundle.getBoolean("container_update", false)) {
            return 5;
        }
        if (cgay.m144131d() && bundle.getBoolean("db_upgrade", false)) {
            return 6;
        }
        if (cgay.m144130c() && bundle.getBoolean("db_downgrade", false)) {
            return 7;
        }
        if (TextUtils.isEmpty(m63920a(bundle))) {
            if (cgav.m144110c() && bundle.getBoolean("periodic_gcm", false)) {
                return 8;
            }
            if (bundle.getBoolean("periodic_sync", false)) {
                return 1;
            }
            if (bundle.getBoolean("upload", false)) {
                return 4;
            }
            return 3;
        } else if (!cfxy.m143780b()) {
            return 2;
        } else {
            String string = bundle.getString("tickle_feed_source");
            return (TextUtils.isEmpty(string) || !string.equals("chime_tickle_sync")) ? 2 : 9;
        }
    }
}
