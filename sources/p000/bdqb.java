package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: bdqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqb {
    static {
        int i = aytg.f98445a;
    }

    /* renamed from: a */
    public static boolean m91276a(SharedPreferences sharedPreferences, String str, long j) {
        beel.m91856c();
        long j2 = sharedPreferences.getLong(str, -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j2) {
            sharedPreferences.edit().remove(str).commit();
            j2 = -1;
        }
        return j2 != -1 && elapsedRealtime <= j2 + j;
    }
}
