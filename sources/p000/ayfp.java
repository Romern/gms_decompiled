package p000;

import android.os.Process;

/* renamed from: ayfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayfp extends Thread {
    public ayfp(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(0);
        super.run();
    }
}
