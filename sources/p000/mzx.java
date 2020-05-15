package p000;

import android.app.backup.RestoreDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: mzx */
final /* synthetic */ class mzx implements Callable {

    /* renamed from: a */
    private final nab f35069a;

    public mzx(nab nab) {
        this.f35069a = nab;
    }

    public final Object call() {
        nab nab = this.f35069a;
        nab.mo20393h();
        RestoreDescription d = nab.mo20379d();
        if (d == null) {
            return null;
        }
        if (!nab.f35081F.contains(d.getPackageName())) {
            return d;
        }
        nab.f35075a.mo25414c("Preparing to restore launcher", new Object[0]);
        Context context = nab.f35110q;
        Settings.Secure.putString(context.getContentResolver(), "packages_to_clear_data_before_full_restore", d.getPackageName());
        nab.f35083H = true;
        Context context2 = nab.f35110q;
        String a = mpv.m25497a(context2);
        StringBuilder sb = new StringBuilder(a.length() + 32);
        sb.append(a);
        sb.append(".BROADCAST_LAUCHER_RESTORE_START");
        Intent intent = new Intent(sb.toString());
        intent.setPackage(a);
        context2.sendBroadcast(intent);
        nab.f35075a.logVerbose("Waiting for stub launcher to be enabled", new Object[0]);
        ComponentName componentName = new ComponentName(mpv.m25497a(nab.f35110q), "com.google.android.apps.pixelmigrate.component.StubLauncherActivity");
        long nanoTime = System.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(ccnl.f179542a.mo6606a().mo76464g());
        long c = ccnl.f179542a.mo6606a().mo76460c();
        while (true) {
            int componentEnabledSetting = nab.f35110q.getPackageManager().getComponentEnabledSetting(componentName);
            if (componentEnabledSetting != 1) {
                if (System.nanoTime() - nanoTime >= nanos) {
                    nab.f35075a.mo25416d("Timeout expired for waiting for stub launcher, proceeding", new Object[0]);
                    break;
                }
                nab.f35075a.logVerbose("Stub launcher state is %d", Integer.valueOf(componentEnabledSetting));
                Thread.sleep(c);
            } else {
                break;
            }
        }
        nab.f35075a.logVerbose("Stub launcher either enabled or we timed out", new Object[0]);
        return d;
    }
}
