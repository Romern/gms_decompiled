package p000;

import android.os.Process;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import java.util.concurrent.TimeoutException;

/* renamed from: vvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DroidGuardChimeraService f50045a;

    /* renamed from: b */
    private final Thread f50046b;

    public vvm(DroidGuardChimeraService droidGuardChimeraService, Thread thread) {
        this.f50045a = droidGuardChimeraService;
        this.f50046b = thread;
    }

    public final void run() {
        TimeoutException timeoutException = new TimeoutException("FSC timeout");
        timeoutException.setStackTrace(this.f50046b.getStackTrace());
        vyp.m41599a(this.f50045a).mo28972a(timeoutException);
        Process.killProcess(Process.myPid());
    }
}
