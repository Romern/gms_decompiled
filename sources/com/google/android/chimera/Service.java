package com.google.android.chimera;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Service extends ContextWrapper implements dix {
    public static final int START_CONTINUATION_MASK = 15;
    public static final int START_FLAG_REDELIVERY = 1;
    public static final int START_FLAG_RETRY = 2;
    public static final int START_NOT_STICKY = 2;
    public static final int START_REDELIVER_INTENT = 3;
    public static final int START_STICKY = 1;
    public static final int START_STICKY_COMPATIBILITY = 0;

    /* renamed from: CU */
    private android.app.Service f7661CU;

    /* renamed from: CV */
    private ProxyCallbacks f7662CV;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks {
        void superOnCreate();

        void superOnDestroy();

        int superOnStartCommand(Intent intent, int i, int i2);

        void superStopSelf();

        void superStopSelf(int i);

        boolean superStopSelfResult(int i);
    }

    public Service() {
        super(null);
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Application getApplication() {
        return this.f7661CU.getApplication();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.app.Service getContainerService() {
        return this.f7661CU;
    }

    public abstract IBinder onBind(Intent intent);

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
        this.f7662CV.superOnCreate();
    }

    public void onDestroy() {
        this.f7662CV.superOnDestroy();
    }

    public void onLowMemory() {
    }

    public void onRebind(Intent intent) {
    }

    public void onStart(Intent intent, int i) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return this.f7662CV.superOnStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(fileDescriptor, printWriter, strArr);
    }

    public void setProxy(android.app.Service service, Context context) {
        this.f7661CU = service;
        this.f7662CV = (ProxyCallbacks) service;
        attachBaseContext(context);
    }

    public final void startForeground(int i, Notification notification) {
        this.f7661CU.startForeground(i, notification);
    }

    public final void stopForeground(boolean z) {
        this.f7661CU.stopForeground(z);
    }

    public final void stopSelf() {
        this.f7662CV.superStopSelf();
    }

    public final boolean stopSelfResult(int i) {
        return this.f7662CV.superStopSelfResult(i);
    }

    public final void stopSelf(int i) {
        this.f7662CV.superStopSelf(i);
    }
}
