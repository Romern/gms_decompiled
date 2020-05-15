package p000;

import android.app.ActivityManager;
import java.util.List;

/* renamed from: nif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nif implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nij f35692a;

    public nif(nij nij) {
        this.f35692a = nij;
    }

    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (this.f35692a.f35713j != -1 && (runningAppProcesses = ((ActivityManager) this.f35692a.f35705b.mo20797a().getSystemService("activity")).getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == this.f35692a.f35713j) {
                    this.f35692a.f35714k = runningAppProcessInfo.processName;
                    return;
                }
            }
        }
    }
}
