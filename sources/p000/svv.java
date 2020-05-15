package p000;

import android.app.ActivityManager;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* renamed from: svv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svv extends svu {
    /* renamed from: a */
    public final void mo26186a(AsyncTask asyncTask, Executor executor, Object... objArr) {
        asyncTask.executeOnExecutor(executor, objArr);
    }

    /* renamed from: d */
    public final boolean mo26192d() {
        return ActivityManager.isRunningInTestHarness();
    }

    /* renamed from: e */
    public final int mo26193e() {
        return 4;
    }
}
