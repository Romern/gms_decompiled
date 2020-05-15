package p000;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bhbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbd {
    /* renamed from: a */
    public static long m100559a(boolean z) {
        if (!cesn.m138187b()) {
            return 0;
        }
        if (z) {
            return cesn.f183405a.mo6606a().flpBackgroundBatchRequestMinIntervalMs();
        }
        return cesn.m138188c();
    }

    /* renamed from: b */
    public static long m100562b(boolean z) {
        if (!cesn.m138187b()) {
            return 0;
        }
        if (z) {
            return cesn.f183405a.mo6606a().flpBackgroundBatchRequestMinWaitMs();
        }
        return cesn.m138188c();
    }

    /* renamed from: a */
    public static boolean m100560a(String str, LocationRequestInternal locationRequestInternal) {
        if (!cesn.m138187b()) {
            return false;
        }
        if (m100561a(cesn.f183405a.mo6606a().flpForcedBackgroundApps(), str) || (m100561a(cesn.f183405a.mo6606a().flpForcedBackgroundExceptHighAccuracyApps(), str) && locationRequestInternal.f79420b.f79349a != 100)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m100561a(String str, String str2) {
        return sqc.m35963b(str.split(","), str2);
    }
}
