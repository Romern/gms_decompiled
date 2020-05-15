package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: athv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class athv extends Service {

    /* renamed from: a */
    private android.app.Service f90385a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract android.app.Service mo50003a();

    public final IBinder onBind(Intent intent) {
        return this.f90385a.onBind(intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f90385a.onConfigurationChanged(configuration);
    }

    public final void onCreate() {
        android.app.Service a = mo50003a();
        this.f90385a = a;
        a.onCreate();
    }

    public final void onDestroy() {
        this.f90385a.onDestroy();
    }

    public final void onLowMemory() {
        this.f90385a.onLowMemory();
    }

    public final void onRebind(Intent intent) {
        this.f90385a.onRebind(intent);
    }

    public final void onStart(Intent intent, int i) {
        this.f90385a.onStart(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.f90385a.onStartCommand(intent, i, i2);
    }

    public final void onTaskRemoved(Intent intent) {
        this.f90385a.onTaskRemoved(intent);
    }

    public final void onTrimMemory(int i) {
        this.f90385a.onTrimMemory(i);
    }

    public final boolean onUnbind(Intent intent) {
        return this.f90385a.onUnbind(intent);
    }
}
