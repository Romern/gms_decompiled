package p000;

import android.app.PendingIntent;
import android.os.Build;
import com.google.android.gms.auth.proximity.Role;
import java.util.List;

/* renamed from: jqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqd {
    /* renamed from: a */
    static boolean m17109a(PendingIntent pendingIntent, String str) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage().equals(str);
    }

    /* renamed from: a */
    static boolean m17110a(Role role) {
        return (role == null || !Role.m6770a(role.f11147c) || role.mo7789a() == 0) ? false : true;
    }

    /* renamed from: a */
    static boolean m17111a(List list, Role role) {
        if (list == null || list.isEmpty() || !m17110a(role)) {
            return false;
        }
        return true;
    }
}
