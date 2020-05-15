package p000;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: bdzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdzy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgk f106710a;

    /* renamed from: b */
    final /* synthetic */ TimeUnit f106711b;

    public bdzy(bqgk bqgk, TimeUnit timeUnit) {
        this.f106710a = bqgk;
        this.f106711b = timeUnit;
    }

    public final void run() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Memory state is: ");
        sb.append(i);
        Log.w("ProcessReaper", sb.toString());
        if (runningAppProcessInfo.importance >= 400) {
            Log.w("ProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        bdzu.m91647a(this.f106710a.mo25814a(this, 10, this.f106711b));
    }
}
