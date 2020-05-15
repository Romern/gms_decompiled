package p000;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;

/* renamed from: aidc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aidc {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /* renamed from: a */
    public static int m57025a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1724415528) {
            if (hashCode != -618582347) {
                if (hashCode == -292229199 && str.equals("DEVICES_REBRANDED")) {
                    c = 1;
                    if (c != 0) {
                        return 1;
                    }
                    if (c == 1) {
                        return -1;
                    }
                    if (c == 2) {
                        return -2;
                    }
                    throw new IllegalArgumentException(String.format("Unexpected channel %s: unknown priority", str));
                }
            } else if (str.equals("DEVICES_WITHIN_REACH_REBRANDED")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (str.equals("DEVICES_WITH_YOUR_ACCOUNT")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: a */
    public static boolean m57026a() {
        if (!cfod.f184793a.mo6606a().mo81936y()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    static boolean m57027a(Context context, String str) {
        NotificationChannel a = ((ahgp) ahgz.m55754a(context, ahgp.class)).mo36447a(str);
        return (a == null || a.getImportance() == 0 || a.getImportance() == -1000) ? false : true;
    }
}
