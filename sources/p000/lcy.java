package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: lcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lcy extends Service {

    /* renamed from: a */
    private android.app.Service f25822a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract android.app.Service mo7968a();

    public final IBinder onBind(Intent intent) {
        return this.f25822a.onBind(intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f25822a.onConfigurationChanged(configuration);
    }

    public final void onCreate() {
        android.app.Service a = mo7968a();
        this.f25822a = a;
        a.onCreate();
    }

    public final void onDestroy() {
        this.f25822a.onDestroy();
    }

    public final void onLowMemory() {
        this.f25822a.onLowMemory();
    }

    public final void onRebind(Intent intent) {
        this.f25822a.onRebind(intent);
    }

    public final void onStart(Intent intent, int i) {
        this.f25822a.onStart(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.f25822a.onStartCommand(intent, i, i2);
    }

    public final void onTaskRemoved(Intent intent) {
        this.f25822a.onTaskRemoved(intent);
    }

    public final void onTrimMemory(int i) {
        this.f25822a.onTrimMemory(i);
    }

    public final boolean onUnbind(Intent intent) {
        return this.f25822a.onUnbind(intent);
    }
}
