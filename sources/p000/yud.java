package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: yud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yud {
    /* renamed from: a */
    public static SharedPreferences m44847a(Context context) {
        return context.getSharedPreferences("session_state", 0);
    }

    /* renamed from: a */
    public static boolean m44848a(Context context, long j, long j2, zrj zrj) {
        Long l = null;
        if (cdyu.f181962a.mo6606a().mo78496A()) {
            try {
                for (cadz cadz : zpc.m45936a(zrj, null, null, null)) {
                    if (j - cadz.f172779e <= j2) {
                        return true;
                    }
                }
                return false;
            } catch (IOException e) {
                return false;
            }
        } else {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j3 = m44847a(context).getLong("session_start", -1);
            if (j3 != -1) {
                l = Long.valueOf(timeUnit.toMillis(j3));
            }
            return l != null && j - l.longValue() <= j2;
        }
    }
}
