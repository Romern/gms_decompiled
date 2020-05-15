package p000;

import android.app.usage.UsageStatsManager;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ayfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfs {

    /* renamed from: a */
    private final UsageStatsManager f97495a;

    /* renamed from: b */
    private final Method f97496b;

    public ayfs(UsageStatsManager usageStatsManager) {
        Method method = null;
        if (usageStatsManager != null) {
            this.f97495a = usageStatsManager;
            if (usageStatsManager != null) {
                try {
                    method = usageStatsManager.getClass().getMethod("whitelistAppTemporarily", String.class, Long.TYPE, UserHandle.class);
                } catch (NoSuchMethodException e) {
                    Log.i("DozeInhibitor", "DozeInhibitor: methods not found, disabled");
                }
            }
        } else {
            this.f97495a = null;
        }
        this.f97496b = method;
    }

    /* renamed from: a */
    public final void mo53990a(String str) {
        if (ayha.m83999e()) {
            if (Log.isLoggable("DozeInhibitor", 2)) {
                Log.v("DozeInhibitor", "temporarilyInhibit: local edition companion, skipping");
            }
        } else if (this.f97496b != null) {
            if (Log.isLoggable("DozeInhibitor", 2)) {
                String valueOf = String.valueOf(str);
                Log.v("DozeInhibitor", valueOf.length() == 0 ? new String("temporarilyInhibit: whitelisting app from doze: ") : "temporarilyInhibit: whitelisting app from doze: ".concat(valueOf));
            }
            long U = chnj.f188812a.mo6606a().mo85395U();
            if (U > 0) {
                try {
                    this.f97496b.invoke(this.f97495a, str, Long.valueOf(U), Process.myUserHandle());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    String valueOf2 = String.valueOf(str);
                    Log.e("DozeInhibitor", valueOf2.length() == 0 ? new String("temporarilyInhibit: Error whitelisting app from doze, ") : "temporarilyInhibit: Error whitelisting app from doze, ".concat(valueOf2), e);
                }
            }
        } else if (Log.isLoggable("DozeInhibitor", 2)) {
            Log.v("DozeInhibitor", "temporarilyInhibit: not initialized, skipping");
        }
    }
}
