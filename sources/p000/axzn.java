package p000;

import android.util.Log;

/* renamed from: axzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzn implements axwy {
    /* renamed from: a */
    public final void mo53559a(boolean z) {
        if (Log.isLoggable("NoopCloudSyncManager", 3)) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Ignoring optInCloudSync request: ");
            sb.append(z);
            Log.d("NoopCloudSyncManager", sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo53560a() {
        return false;
    }

    /* renamed from: b */
    public final axom mo53561b() {
        return new axom(false, false);
    }

    /* renamed from: c */
    public final void mo53563c(boolean z) {
        if (Log.isLoggable("NoopCloudSyncManager", 3)) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Ignoring attempt to change cloud sync setting:");
            sb.append(z);
            Log.d("NoopCloudSyncManager", sb.toString());
        }
    }

    /* renamed from: c */
    public final boolean mo53564c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo53565d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo53566e() {
        return false;
    }

    /* renamed from: g */
    public final void mo53568g() {
        if (Log.isLoggable("NoopCloudSyncManager", 3)) {
            Log.d("NoopCloudSyncManager", "Ignoring attempt to enable connection notifications");
        }
    }

    /* renamed from: i */
    public final boolean mo53570i() {
        return false;
    }

    /* renamed from: j */
    public final void mo53571j() {
        if (Log.isLoggable("NoopCloudSyncManager", 3)) {
            Log.d("NoopCloudSyncManager", "Ignoring update to reachable nodes.");
        }
    }
}
