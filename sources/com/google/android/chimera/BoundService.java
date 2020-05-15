package com.google.android.chimera;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BoundService extends ContextWrapper implements ComponentCallbacks {
    public BoundService() {
        super(null);
    }

    public static Intent getStartIntent(Context context, String str) {
        try {
            brtm f = dfy.m8329a(context).mo8898f().mo9181f();
            String E = f.mo69896E();
            dmy d = f.mo69924d(dmv.m8834a(E, str));
            if (d == null) {
                return null;
            }
            Intent intent = new Intent(str);
            intent.setClassName(context, dmv.m8840b(E, d.mo9291c()));
            return intent;
        } catch (InvalidConfigException e) {
            Log.e("BoundService", "Failed to get Chimera config", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract IBinder onBind(Intent intent);

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onLowMemory() {
    }

    public void onRebind(Intent intent) {
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(fileDescriptor, printWriter, strArr);
    }

    public final void setModuleContext(Context context) {
        attachBaseContext(context);
    }
}
