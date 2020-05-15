package p000;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: awah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awah {
    static {
        TimeUnit.MINUTES.toMillis(10);
        SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static Status m79564a(Intent intent) {
        if (intent != null) {
            return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        }
        return null;
    }

    /* renamed from: a */
    public static void m79565a(Intent intent, Status status) {
        intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
    }

    /* renamed from: a */
    public static void m79566a(Status status, Object obj, aucf aucf) {
        if (status.mo17710c()) {
            aucf.mo50391a(obj);
        } else {
            aucf.mo50390a((Exception) rzy.m34725a(status));
        }
    }
}
